package io.github.xopenapi.doudian.request.parameters;

import io.github.xopenapi.doudian.utils.AssertUtils;

public class IDParameter {

    private Long id;

    public IDParameter(Long id) {
        AssertUtils.notNull(id, "id can not be null!");
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }

    public void setId(Long id) {
        this.id = id;
    }
}
