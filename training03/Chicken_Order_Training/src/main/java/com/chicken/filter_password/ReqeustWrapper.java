package com.chicken.filter_password;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class ReqeustWrapper extends HttpServletRequestWrapper {

    public ReqeustWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {

        String value = "";
        if ("password".equals(name)) {
            //BCryptPasswordEncoder : 복호화가 되지 않도록 함
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            value = passwordEncoder.encode(super.getParameter(name));
        } else {
            value = super.getParameter(name);
        }

        return super.getParameter(value);
    }
}
