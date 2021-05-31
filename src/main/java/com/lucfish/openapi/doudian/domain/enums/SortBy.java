package com.lucfish.openapi.doudian.domain.enums;

public enum SortBy {
    ASC("0"),
    DESC("1");

    private String is_desc;

    SortBy(String is_desc) {
        this.is_desc = is_desc;
    }

    @Override
    public String toString() {
        return is_desc;
    }

    public String getIs_desc() {
        return is_desc;
    }

    public void setIs_desc(String is_desc) {
        this.is_desc = is_desc;
    }
}
