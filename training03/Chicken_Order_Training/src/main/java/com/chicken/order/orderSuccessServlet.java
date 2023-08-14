package com.chicken.order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/nonmembersession/chickenorder")
public class /*주문완료*/orderSuccessServlet extends HttpServlet {

    @Override
    protected void doGet/*<a>태그로 불러오는 요청은 doGet!*/(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*인코딩 설정*/
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String menu = req.getParameter("menu");
        String[] toppings = req.getParameterValues("topping");
        String review = req.getParameter("review");

        /* 토핑 값 넣어주기 */
        StringBuilder toppingArr = new StringBuilder();
        for (String topping: toppings) {
            toppingArr.append(topping + ", ");
        }

        /*session 값 관리*/
        HttpSession session = req.getSession();

        /* 사용자에게 응답을 해주기 위한 로직 */
        String name = (String) session.getAttribute("name");
        String tel = (String) session.getAttribute("tel");
        String addr = (String) session.getAttribute("addr");

        /*주문요청 후 cookie에 주문시간 정보 저장*/
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        String nowClock = simpleDateFormat.format(nowDate);
        System.out.println(nowClock);

        /*서블릿에서 한글 쿠키 사용하기*/
        nowClock = URLEncoder.encode(nowClock, "utf-8").replaceAll("\\+", "%20");

        /*요청 값을 쿠키에 담아준다.*/
        Cookie orderClock = new Cookie("nowClock", nowClock);

        /*사용자 응답시 쿠키의 값을 담아보낸다.*/
        resp.addCookie(orderClock);

        PrintWriter out = resp.getWriter();
        out.print("<!doctype html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>주문 내역</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h2>"+name+"님 주문 내역</h2>");
        out.print("<h4>주문메뉴 : "+menu+"</h4>");
        out.print("<h4>사이드메뉴 추가 : "+toppingArr.toString()+"</h4>");
        out.print("<h4>리뷰이벤트 추가 : "+review+"</h4>");
        out.print("</body>");
        out.print("</html>");

        out.flush();
        out.close();

    }
}
