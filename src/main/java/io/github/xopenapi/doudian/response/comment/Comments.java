package io.github.xopenapi.doudian.response.comment;

import io.github.xopenapi.doudian.domain.Comment;

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
