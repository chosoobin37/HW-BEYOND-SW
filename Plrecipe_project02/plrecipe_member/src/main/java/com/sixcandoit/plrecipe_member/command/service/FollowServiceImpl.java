package com.sixcandoit.plrecipe_member.command.service;

import com.sixcandoit.plrecipe_member.command.dto.FollowDTO;
import com.sixcandoit.plrecipe_member.command.aggregate.Follow;
import com.sixcandoit.plrecipe_member.query.repository.FollowMapper;
import com.sixcandoit.plrecipe_member.command.repository.FollowRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FollowServiceImpl implements FollowService {

    private final ModelMapper mapper;
    private final FollowMapper followMapper;
    private final FollowRepository followRepository;

    @Autowired
    public FollowServiceImpl(ModelMapper mapper, FollowMapper followMapper, FollowRepository followRepository) {
        this.mapper = mapper;
        this.followMapper = followMapper;
        this.followRepository = followRepository;
    }
    @Override
    public void cancelFollow(int followId) {
        followRepository.deleteById(followId);
    }

    @Override
    public List<FollowDTO> selectMemberWhoFollowsMe(int userFollow) {
        return followMapper.selectMemberWhoFollowsMe(userFollow);
    }

    @Override
    public List<FollowDTO> selectMemberWhoIFollow(int userFollower) {
        return followMapper.selectMemberWhoIFollow(userFollower);
    }

    @Override
    public List<FollowDTO> selectAllFollows() {
        return followMapper.selectAllFollow();
    }

    @Override
    public void followMember(FollowDTO followDTO) {
        Follow follow = mapper.map(followDTO, Follow.class);
        followRepository.save((follow));
    }

    @Override
    public FollowDTO selectFollowById(int followId) {
        Optional<Follow> userEntity = followRepository.findById((followId));
        FollowDTO followDTO = mapper.map(userEntity, FollowDTO.class);

        return followDTO;
    }


}