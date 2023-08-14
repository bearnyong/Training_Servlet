package com.chicken.filter_password;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/nonmembersession/*") /*member필터 이후의 모든 필터는 이 친구를 통해간다.*/
public class PasswordEncyptFilter implements Filter {

    public PasswordEncyptFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hreqeust = (HttpServletRequest) request;
        ReqeustWrapper wrapper = new ReqeustWrapper(hreqeust);

        chain.doFilter(wrapper, response);
    }

}
