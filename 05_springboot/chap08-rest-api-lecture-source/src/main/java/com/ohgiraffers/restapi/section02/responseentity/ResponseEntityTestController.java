package com.ohgiraffers.restapi.section02.responseentity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entity")
public class ResponseEntityTestController {

    private List<UserDTO> users;

    public ResponseEntityTestController(List<UserDTO> users) {
        this.users = users;

        users.add(new UserDTO(1, "user01", "pass01", "조먹밥", new java.util.Date()));
        users.add(new UserDTO(2, "user02", "pass02", "이루비", new java.util.Date()));
        users.add(new UserDTO(3, "user03", "pass03", "이루동", new java.util.Date()));
    }

    /* 설명. 1) 직접 ResponseEntity 객체 생성 */
    @GetMapping("/users")
    public ResponseEntity<ResponseMessage> findAllUsers() {

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("users", users);

        ResponseMessage responseMessage = new ResponseMessage(200, "Success!", responseMap);

        return new ResponseEntity<>(responseMessage, headers, HttpStatus.OK);
    }

    /* 설명. 2) 빌더를 활용한 메소드 체이닝 방식으로 ResponseEntity 객체 만들기 */

    @GetMapping("/users/{userNo}")
    public ResponseEntity<ResponseMessage> findUserByNo(@PathVariable int userNo) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        /* 설명. 요청 리소스(회원 번호와 일치하는 회원 한 명) 추출 */
        UserDTO foundUser = users.stream().filter(user -> user.getNo() == userNo).collect(Collectors.toList()).get(0);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("user", foundUser);

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(new ResponseMessage(200, "Success!", responseMap));
    }

    /* 설명.
     *  기존에 배웠던 @RequestParam과 달리 json 문자열이 핸들러 메소드로 넘어올 때 -> @RequestBody 붙이고 받아내야 함
     *  json. 문자열의 각 프로퍼티 별로 받을 수도 있지만 한 번에 하나의 타입으로 다 받아내는 경우
     *  -> 커맨드 객체 (UserDTO) 활용해야 하며 커맨드 객체는 json 문자열의 프로퍼티명과 일치해야 함
     *  -
     *  {
     *      "id": "user01"
     *  }
     *  "id" -> property, "user01" -> property명
     * */

    @PostMapping("/users")
    public ResponseEntity<?> registUser(@RequestBody UserDTO newUser) {

        System.out.println("newUser = " + newUser);

        /* 설명. auto_increment 개념 -> 컬렉션 마지막에 있는 회원번호 +1 처리 후 newUser에 추가 */
        int lastUserNo = users.get(users.size() - 1).getNo();
        newUser.setNo(lastUserNo + 1);

        users.add(newUser);

        return ResponseEntity
                .created(URI.create("/entity/users/" + users.get(users.size() - 1).getNo()))
                .build();
    }

    @PutMapping("users/{userNo}")
    public ResponseEntity<?> modifyUser(@RequestBody UserDTO modifyInfo, @PathVariable int userNo) {

        /* 설명. PathVariable로 넘어온 번호와 일치하는 회원 한 명 추출 */
        UserDTO foundUser =
                users.stream().filter(user -> user.getNo() == userNo)
                        .collect(Collectors.toList())
                        .get(0);

        /* 설명. 사용자가 넘겨준 수정하고자 하는 데이터로 회원 정보 수정 */
        foundUser.setId(modifyInfo.getId());
        foundUser.setPwd(modifyInfo.getPwd());
        foundUser.setName(modifyInfo.getName());

        return ResponseEntity
                .created(URI.create("/entity/users/" + userNo))
                .build();
    }

    @DeleteMapping("/users/{userNo}")
    public ResponseEntity<?> removeUser(@PathVariable int userNo) {

        UserDTO foundUser =
                users.stream().filter(user -> user.getNo() == userNo)
                        .collect(Collectors.toList())
                        .get(0);

        /* 설명. ArrayList에서 제공하는 remove -> 인덱스 대신 자신이 관리하는 객체 찾아 삭제하기도 함 */
        users.remove(foundUser);

        return ResponseEntity
                .noContent()            // 204
                .build();
    }

}
