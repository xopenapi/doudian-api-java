package io.github.xopenapi.doudian.request.comment;

import io.github.xopenapi.doudian.request.TiktokOpenRequest;
import io.github.xopenapi.doudian.request.parameters.CommentListParameters;
import io.github.xopenapi.doudian.response.comment.CommentListResponse;

public class CommentListRequest extends TiktokOpenRequest<CommentListParameters, CommentListResponse> {

    public CommentListRequest(CommentListParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<CommentListResponse> getResponseType() {
        return CommentListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/comment/list";
    }
}
