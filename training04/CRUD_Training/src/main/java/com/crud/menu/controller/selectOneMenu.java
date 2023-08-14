package com.crud.menu.controller;

import com.crud.menu.model.dto.TblMenuDTO;
import com.crud.menu.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/menu/select")
public class selectOneMenu extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String menuName = req.getParameter("menuName");

        if (menuName.isEmpty()) {
            resp.sendError(404, "메뉴명이 입력되지 않았습니다.");
        }

        /*비즈니스 로직 호출*/
        MenuService menuService = new MenuService();
        TblMenuDTO name = MenuService./*service클래스의 메소드 생성*/selectOneMenu(menuName);
    }
}
