package com.yupdduk.kiosk.order;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/*forward*/
@WebServlet("/yupdduk")
public class YupddukOrder extends HttpServlet { /* 값을 받아서 */

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        /* 이름 */
        String name = req.getParameter("name");
        /* 종류 */
        String kind = req.getParameter("kind");
        /* 맵기 */
        String spicy = req.getParameter("spicy");
        /* 토핑 추가는 중복 선택이 가능하기에 배열로 값을 받는다.
         * 배열로 값을 받을 때는 getParameterValues() 메서드를 사용한다. */
        String[] toppings = req.getParameterValues("topping");
        /* 주소 */
        String address = req.getParameter("address");

        /* 콘솔창 출력 */
        System.out.println("주문자 이름 : " + name);
        System.out.println("떡볶이 종류 선택 : " + kind);
        System.out.println("떡볶이 맵기 선택 : " + spicy);
        System.out.print("떡볶이 토핑 선택 : ");
        if(toppings != null) {
            for (String topping : toppings) {
                System.out.print(topping + ", ");
            }
        } else {
            System.out.println();
        }
        System.out.println("주문자 주소 : " + address);


        /* null 값 찾는 방법 */
//        System.out.println(name==null); //false
//        System.out.println(Objects.isNull(name)); //false : 임의의 값이 들어간거임 그래서 null이 아닌 것..
//        System.out.println(name.length()); //0(공백)
//        System.out.println("".equals(name)); //true : 공백이 들어가 있다는 것...

//        System.out.println(kind == null);
//        System.out.println(spicy == null);


        /* 값을 입력하지 않을 경우 에러코드 발생 */
        if ("".equals(name)/* 값이 입력되지 않았을 떄 = 공백이 들어가 있을 때 */) {
            resp.sendError(404, "이름이 입력되지 않았습니다.");
        } else if (kind == null /*null값인 경우*/) {
            resp.sendError(404, "떡볶이 종류가 선택되지 않았습니다.");
        } else if (spicy == null) {
            resp.sendError(404, "떡볶이 맵기가 선택되지 않았습니다.");
        } else if (toppings == null) {
            resp.sendError(404, "토핑 옵션이 선택되지 않았습니다.\n토핑을 원하지 않으실 경우 '선택 안 함'을 선택해 주세요.");
        } else if ("".equals(address)) {
            resp.sendError(404, "주소가 입력되지 않았습니다. 배달 받으실 주소를 입력해 주세요.");
        } else {
            /* 토핑 값 넣어주기 */
            StringBuilder toppingArr = new StringBuilder();
            for (String topping: toppings) {
                toppingArr.append(topping + ", ");
            }
            
            /* 모든 값이 입력 되었을 경우 값을 받아서 딜리버리로 넘겨줌*/
            req.setAttribute("name", name);
            req.setAttribute("kind", kind);
            req.setAttribute("spicy", spicy);
            req.setAttribute("topping", toppingArr.toString());
            req.setAttribute("address", address);

            RequestDispatcher bye = req.getRequestDispatcher("delivery");
            bye.forward(req, resp);

        }

    }

}
