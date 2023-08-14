package com.yupdduk.delivery;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delivery")
public class deliveryForward extends HttpServlet { /* 여기로 넘겨줌 하지만 이름은 riceCake(넘겨준 쪽)이 나옴 */

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        /* deliveryForward에서 값을 받아온다. */
        String name = (String) req.getAttribute("name");
        String kind = (String) req.getAttribute("kind");
        String spicy = (String) req.getAttribute("spicy");
        String topping = (String) req.getAttribute("topping");
        String address = (String) req.getAttribute("address");
        String deliveryMen = "이상우";

        // 배열 사이즈 재서 인덱스 값이 0이면 append 안해줌...

        /* 웹페이지(사용자화면) 출력 */
        StringBuilder orderString = new StringBuilder();
        orderString.append("<!doctype html>\n")
                .append("<html lang=\"en\">\n")
                .append("<head>\n")
                .append("<title>주문내역</title>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>")
                .append(name)
                .append("님 주문내역 </h1>")
                .append("<h3><label><b>[ ")
                .append(kind)
                .append(" ]</b></label></h3>")
                .append("<label>º 맵기 : <b>")
                .append(spicy)
                .append("</b></label>")
                .append("<br><label>º 추가 옵션 : <b>")
                .append(topping)
                .append("</b></label>")
                .append("<br><label>º 배달원 : <b>")
                .append(deliveryMen)
                .append("</b></label>")
                .append("<br><br>")
                .append("<h4>주문이 완료되었습니다</h4>")
                .append("<br><br><br><br><br>")
                .append("<h2>잠깐!</h2>")
                .append("<h3><a href=\"kyochonredirect\">엽떡과 잘어울리는 교촌치킨과 함께하는 건 어떠신가요?</a></h3>")
                .append("<a href=\"http://www.kyochon.com/main/\"><button>교촌치킨 사이트 바로가기</button></a>")
                .append("</body>\n")
                .append("</html>\n");

        /* 사용자에게 내보낼 데이터 타입 설정하기 */
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.println(orderString.toString());
        out.flush();
        out.close();

    }

}
