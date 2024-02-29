package com.ohgiraffers.restapi.section02.responseentity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/entity")
public class ResponseEntityTestController {

    private List<UserDTO> users;

    public ResponseEntityTestController(List<UserDTO> users) {
        this.users = new ArrayList<>();

        users.add(new UserDTO(1, "user01", "pass01", "조먹밥", new java.util.Date()));
        users.add(new UserDTO(2, "user02", "pass02", "이루비", new java.util.Date()));
        users.add(new UserDTO(3, "user03", "pass03", "이루동", new java.util.Date()));
    }

    /* 설명. 1) 직접 ResponseEntity 객체 생성 */
    public ResponseEntity<ResponseMessage> findAllUsers() {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("users", users);

        ResponseMessage responseMessage = new ResponseMessage(200, "Success!", responseMap);

        return new ResponseEntity<>(responseMessage, headers, HttpStatus.OK);

    }
}
