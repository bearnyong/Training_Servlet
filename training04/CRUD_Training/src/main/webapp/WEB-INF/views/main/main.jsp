<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>니하오 마라탕</title>
</head>
<body>
    <%--타이틀--%>
    <jsp:include page="../common/header.jsp"/>

    <nav>
        <ul>
            <%--1.전체 메뉴 조회 : WHERE ORDERABLE_STATUS가 'Y'인 상태만 출력, 메뉴명(MENU_NAME)과 가격(MENU_PRICE) 조회--%>
            <%-- 1.1 controller -> selectAllMenu -> @Webservlet("/menu/list") --%>
            <li><button onclick="location.href='${pageContext.servletContext.contextPath}/menu/list'">전체 메뉴 조회</button></li>
            <%--2.단일 메뉴 조회 : 판매상태(ORDERABLE_STATUS) 구분없이 메뉴의 모든 정보 조회 + 카테고리명(join)--%>
            <%-- 2.1.controller -> selectOneMenu -> @Webservlet("/menu/select")--%>
            <li><button onclick="location.href='${pageContext.servletContext.contextPath}/menu/select'">단일 메뉴 조회</button></li>
            <li>메뉴3</li>
            <li>메뉴4</li>
            <li>메뉴5</li>
        </ul>
    </nav>
</body>
</html>