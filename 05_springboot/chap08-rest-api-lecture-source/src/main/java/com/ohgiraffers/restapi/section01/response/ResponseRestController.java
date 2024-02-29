package com.ohgiraffers.restapi.section01.response;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/* 설명. RestController -> 모든 핸들러 메소드에 @ResponseBody를 붙여주는 Annotation */
/* 설명. 이 Controller의 핸들러 메소드 반환값은 이제 viewResolver가 처리 X -> json 문자열로 반환 */

@RestController
@RequestMapping("/response")
public class ResponseRestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world!";
    }

    @GetMapping("/random")
    public int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    @GetMapping("/message")
    public Message getMessage() {
        return new Message(200, "메시지를 응답합니다.");
    }

    /* 설명.
     *  RestController에서 반환하는 것(자바 타입들)은 모두 jsonArray 형태([]) or jsonObject 형태({})로 바뀌어 JSON 문자열로 반환
     *  1) Map 또는 일반 클래스 타입 -> {} 형태
     *  2) ArrayList -> [] 형태
     *  -
     *  JSON(JavaScript Object Notation) -> 자바 스크립트가 인지할 수 있는 객체 형태
     * */

    @GetMapping("/test")
    public List<Map<String, Message>> getTest() {
        List<Map<String, Message>> list = new ArrayList<>();
        Map<String, Message> map = new HashMap<>();
        map.put("test1", new Message(200, "Success"));
        map.put("test2", new Message(200, "Success2"));
        list.add(map);
        return list;
    }

    @GetMapping("/list")
    public List<String> getList() {
        return List.of(new String[]{"딸기, 체리, 복숭아"});
    }

    @GetMapping("/map")
    public Map<Integer, String> getMapping() {
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message(200, "Success"));
        messageList.add(new Message(404, "Page Not Found"));
        messageList.add(new Message(500, "Server Error"));

        return messageList.stream().
                collect(Collectors.toMap(Message::getHttpStatusCode, Message::getMessage));
    }

    /* 설명. 이미지 응답하기 */
    /* 설명. produces -> response header의 content-type 설정 */
    @GetMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage() throws IOException {
        return getClass().getResourceAsStream("/static/fupng.png").readAllBytes();
    }

    /* 설명. ResponseEntity는 필수는 아니지만 유용하게 사용할 수 있다. */
    @GetMapping("/entity")
    public ResponseEntity<Message> getEntity() {
        return ResponseEntity.ok(new Message(200, "응답 성공"));
    }
}
