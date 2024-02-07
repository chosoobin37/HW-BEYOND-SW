<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP - Hello World</title>
<!--
    서블릿을 배울 때 요청은 크게 GET과 POST로 나눠 진행
    1. GET
    -> GET 요청은 조회를 하게 될 때 요청하는 형식, URL 경로에 노출되는 방식으로
    서버에 값을 넘기며 조회 (쿼리스트링, PathVariable)
    2. Post
    -> Post 요청은 조회를 제외한 나머지(DML)를 진행할 때 주로 사용
    경우에 따라 조회 시 URL 경로에 노출되지 않고 서버에 값을 넘기거나
    조회를 위해 서버로 넘기는 값의 크기가 클 때 (255byte 초과) Post 요청 진행

    Rest API 방식으로 요청 시에는 더 세분화 된 Http Mehtod(7가지 종류)를 사용하게 되지만
    현재는 이 2가지 요청에 집중
-->
</head>
<body>
    <h1 align="center">Service Method</h1>
    <h3>GET 방식의 요청</h3>
    <h4>a태그의 href 속성값 변경</h4>
    <a href="request-service">서비스 메소드 요청하기</a>

    <h3>POST 방식의 요청</h3>
    <h4>form 태그의 method 속성을 post로 설정</h4>
    <form action="request-service" method="post">
        <input type="submit" value="POST 방식 요청 전송">
    </form>
</body>
</html>