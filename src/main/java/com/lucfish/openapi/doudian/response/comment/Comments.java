package com.lucfish.openapi.doudian.response.comment;

import com.lucfish.openapi.doudian.domain.Comment;

import java.util.List;

public class Comments {

    public List<Comment> comments;

    public Integer total;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
