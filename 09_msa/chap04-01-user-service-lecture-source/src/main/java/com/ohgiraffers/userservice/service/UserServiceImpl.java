package com.ohgiraffers.userservice.service;

import com.ohgiraffers.userservice.aggregate.UserEntity;
import com.ohgiraffers.userservice.dto.UserDTO;
import com.ohgiraffers.userservice.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private ModelMapper modelMapper;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           ModelMapper modelMapper,
                           BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Transactional
    @Override
    public void resgistUser(UserDTO userDTO) {

        /* 설명. userId가 비어있는 상태인데 UUID를 활용하여 서버측에서 회원의 고유 아이디 생성 */
        userDTO.setUserId(UUID.randomUUID().toString());

        /* 설명. 필드값이 정확히 일치할 때만 매칭하기 위해 STRICT 모드 상태로 modelMapper 설정 (STANTDARD -> STRICT) */
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(userDTO, UserEntity.class);

        /* 설명. spring security 모듈 추가 후 진행하므로 security 설정도 추가 */ 
        userEntity.setEncryptPwd(bCryptPasswordEncoder.encode(userDTO.getPwd()));
//        userEntity.setEncryptPwd("암호화 된 비밀번호");

        userRepository.save(userEntity);

    }
}
