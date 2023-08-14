package com.yupdduk.addkyochon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/kyochon")
public class KyochonOrder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //교촌
        String welcom = "안녕하세요 교촌치킨 입니다. :-)";

        StringBuilder welcomMessage = new StringBuilder();
        welcomMessage.append("<!doctype html>\n")
                .append("<html lang=\"en\">\n")
                .append("<head>\n")
                .append("<title>교촌치킨</title>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h2>")
                .append(welcom)
                .append("</h2>")
                .append("</body>\n")
                .append("</html>\n");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(welcomMessage.toString());
        out.flush();
        out.close();

    }
}
