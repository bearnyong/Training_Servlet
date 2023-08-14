package com.chicken.order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/nonmembersession")
public class /*주문화면*/orderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*인코딩 설정*/
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String tel = req.getParameter("tel");
        String addr = req.getParameter("addr");

        /*session 관리*/
        //HttpSession은 직접 생성할 수 없기에 request에 있는 getSetssion() 메소드를 이용해서 리턴받는다.
        HttpSession session = req.getSession();
        System.out.println(session.getId());

        /*session 값 저장하기*/
        session.setAttribute("name", name);
        session.setAttribute("password", password);
        session.setAttribute("tel", tel);
        session.setAttribute("addr", addr);

        /*사용자에게 화면 출력*/
        PrintWriter out = resp.getWriter();
        out.print("<!doctype html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>정보 입력 완료</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h3>");
        out.print(name);
        out.print("님 환영합니다! :-) ");
        out.print("</h3>");
        /*세션 값이기 때문에 chickenorder에 값이 넘어가지 않는다.*/
        out.print("<h4><a href=menu.jsp>주문하러가기</a></h4>");
        out.print("</body>");
        out.print("</html>");

        out.flush();
        out.close();

    }
}
