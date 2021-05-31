package io.github.xopenapi.doudian.domain;

public class Category {

    private Long id;

    private String name;

    private Integer level;

    private Long parent_id;

    private boolean is_leaf;

    private boolean enable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public boolean isIs_leaf() {
        return is_leaf;
    }

    public void setIs_leaf(boolean is_leaf) {
        this.is_leaf = is_leaf;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
