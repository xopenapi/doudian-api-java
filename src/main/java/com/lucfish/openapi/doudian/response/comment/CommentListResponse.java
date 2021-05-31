package com.lucfish.openapi.doudian.response.comment;

import com.alibaba.fastjson.annotation.JSONField;
import com.lucfish.openapi.doudian.domain.Comment;
import com.lucfish.openapi.doudian.response.TiktokOpenResponse;

import java.util.ArrayList;
import java.util.List;

public class CommentListResponse extends TiktokOpenResponse<Comments> {

    @JSONField(serialize = false,deserialize = false)
    public List<Comment> getContents() {
        if (getContents() != null)
            return getContents();
        return new ArrayList<>();
    }

}
