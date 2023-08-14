package com.yupdduk.addkyochon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/kyochonredirect")
public class KyochonOrderRedirect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 요청 수락");
        System.out.println(resp);
        resp.sendRedirect("/kyochon"); // 딜리버리 어노테이션 값 가져오기
    }
}
