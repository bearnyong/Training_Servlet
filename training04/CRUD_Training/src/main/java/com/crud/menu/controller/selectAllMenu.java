package com.crud.menu.controller;

import com.crud.menu.model.dto.TblMenuDTO;
import com.crud.menu.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*1.1. main.jsp의 전체메뉴조회*/
@WebServlet("/menu/list")
public class selectAllMenu extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MenuService menuService = new MenuService();
        /* -> 1.2. MenuService 클래스 생성*/
        List<TblMenuDTO> menuList = menuService.selectAllMenu();
        /* -> 1.3. TblMenuDTO 클래스 생성*/
        /*-> 1.4. MenuService로 이동 -> selectAllMenu()메서드 생성*/

        for (TblMenuDTO menu : menuList) {
            System.out.println(menu);
        }

        String path = "";
        if (menuList != null) {
            path = "/WEB-INF/views/menu/showAllMenu.jsp";
            req.setAttribute("menuList"/*showAllMenu.jsp 파일과 연결*/, menuList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "메뉴 전체 조회 실패");
        } 

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
