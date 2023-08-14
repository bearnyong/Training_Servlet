package com.crud.menu.model.dao;

import com.crud.common.config.ConfigLocation;
import com.crud.menu.model.dto.TblMenuDTO;
import static com.crud.common.jdbc.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MenuDAO {

    /**/
    private final Properties prop;

    /**/
    public MenuDAO() {
        prop = new Properties();
        try {
            prop.loadFromXML(new FileInputStream(ConfigLocation.MAPPER_LOCATION/*매퍼연결*/+"menu-mapper.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<TblMenuDTO> selectAllMenu(Connection con) {
        Statement stmt = null;
        ResultSet rset = null;
        List<TblMenuDTO> menuList = null;

        /*쿼리 가져오기*/
        String query = prop.getProperty("selectAllMenu");

        /*쿼리 짜고 돌아오기*/
        try {
            /*쿼리 돌린 결과를 rset에 넣어준다.*/
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);
            menuList = new ArrayList<>();

            /*쿼리 값 매핑*/
            while (rset.next()) {
                TblMenuDTO menuDTO = new TblMenuDTO();
                menuDTO.setMenuName(rset.getString("MENU_NAME"));
                menuDTO.setMenuPrice(rset.getInt("MENU_PRICE"));
                /*menuList에 값 게속 추가해주기*/
                menuList.add(menuDTO);
            }
        } catch (SQLException e) {
            /*오류 보여주기*/
            e.printStackTrace();
        } finally {
            close(rset);
            close(stmt);
        }

        System.out.println(menuList);
        return menuList;
    }


}
