<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%--외부라이브러리모음경로--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>전체 메뉴 조회</h2>
    <table>
        <tr>
            <th>메뉴명</th>
            <th>가격</th>
        </tr>
        <c:forEach items="${ requestScope.menuList}" var="menu">
        <tr>
            <td>${menu.menuName}</td>
            <td>${menu.menuPrice}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
