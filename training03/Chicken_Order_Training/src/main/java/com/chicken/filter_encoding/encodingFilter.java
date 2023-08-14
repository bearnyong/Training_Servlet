package com.chicken.filter_encoding;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class encodingFilter implements Filter {

    private String encodingType;

    public encodingFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-type"); //xml (param-name에 매칭)
        System.out.println(encodingType);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hreqeust = (HttpServletRequest) request;
        if ("post".equals(hreqeust.getMethod())) {
            request.setCharacterEncoding(encodingType);
            System.out.println("변경된 인코딩 타입 : " + request.getCharacterEncoding());
        }

        /*꼭 작성*/
        chain.doFilter(request, response);
    }

}
