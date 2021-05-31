package io.github.xopenapi.doudian.response.comment;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.xopenapi.doudian.domain.Comment;
import io.github.xopenapi.doudian.response.TiktokOpenResponse;

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
