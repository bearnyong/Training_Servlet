<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>비회원 주문 정보 입력</title>
</head>
<body>
    <form action="nonmembersession" method="post">
        <h1>비회원 주문 정보 입력</h1>
        <dev>
            <label>이름 : </label>
            <input type="text" name="name"/>
        </dev>
        <dev>
            <label>비밀번호 : </label>
            <input type="password" name="password"/>
        </dev>
        <dev>
            <label>전화번호 : </label>
            <input type="tel" name="tel"/>
        </dev>
        <dev>
            <label>주소 : </label>
            <input type="addr" name="addr"/>
        </dev>
        <input type="submit" value="주문하기">
    </form>
</body>
</html>