package com.crud.menu.model.service;

import com.crud.menu.model.dao.MenuDAO;
import com.crud.menu.model.dto.TblMenuDTO;

import java.sql.Connection;
import java.util.List;

import static com.crud.common.jdbc.JDBCTemplate.*;

public class MenuService {

    /**/
    private final MenuDAO menuDAO;

    /**/
    public MenuService() {
        menuDAO = new MenuDAO();
    }

    /*1.전체메뉴 조회하기*/
    public List<TblMenuDTO> selectAllMenu() {
        /*1.5. DB Connection 생성*/
        Connection con = getConnection();
        List<TblMenuDTO> menuList = menuDAO.selectAllMenu(con);
        /*1.6. menuDAO -> selectAllMenu() 메소드 생성*/
        close(con);

        return menuList;
    }

    /*2.단일메뉴 조회하기*/
    public static TblMenuDTO selectOneMenu(String menuName) {
        /*DB Connection 생성*/
        Connection con = getConnection();
        /*비즈니스 로직 실행*/
        TblMenuDTO name = menuDAO.selectOneMenu(con, menuName);
        /**/
        close(con);

        return name;
    }
}
