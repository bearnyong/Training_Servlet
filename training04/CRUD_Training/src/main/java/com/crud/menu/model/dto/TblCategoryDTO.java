package com.crud.menu.model.dto;

public class TblCategoryDTO {

    private int categoryCode; /*카테고리코드*/
    private String cotegoryName; /*카테고리명*/
    private int refCategoryCode; /*상위카테고리코드*/

    public TblCategoryDTO() {
    }

    public TblCategoryDTO(int categoryCode, String cotegoryName, int refCategoryCode) {
        this.categoryCode = categoryCode;
        this.cotegoryName = cotegoryName;
        this.refCategoryCode = refCategoryCode;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCotegoryName() {
        return cotegoryName;
    }

    public void setCotegoryName(String cotegoryName) {
        this.cotegoryName = cotegoryName;
    }

    public int getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(int refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    @Override
    public String toString() {
        return "tblCategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", cotegoryName='" + cotegoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }

}
