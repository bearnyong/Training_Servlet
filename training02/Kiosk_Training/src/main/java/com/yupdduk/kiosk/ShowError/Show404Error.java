package com.yupdduk.kiosk.ShowError;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/showerrorpage")
public class Show404Error extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 에러 속성 정보 */
        String forwardRequestURI = (String) req.getAttribute("javax.servlet.forward.request_uri");
        String contextPath = (String) req.getAttribute("javax.servlet.forward.context_path");
        String servletPath = (String) req.getAttribute("javax.servlet.forward.servlet_path");
        HttpServletMapping mapping = req.getHttpServletMapping();
        Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
        String message = (String) req.getAttribute("javax.servlet.error.message");
        String servletName = (String) req.getAttribute("javax.servlet.error.servlet_name");
        String errorRequestURI = (String) req.getAttribute("javax.servlet.error.request_uri");

        StringBuilder errorPage = new StringBuilder();
        errorPage.append("<!doctype html>\n")
                .append("<html> \n")
                .append("<head> \n")
                .append("</head> \n")
                .append("<body> \n")
                .append("<h3>")
                .append(statusCode)
                .append(" : ")
                .append(message)
                .append("</h3> \n")
                .append("</body> \n")
                .append("</html> \n");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.print(errorPage.toString());
        out.flush();
        out.close();

    }
}
