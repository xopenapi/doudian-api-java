package com.lucfish.openapi.doudian.request.comment;

import com.lucfish.openapi.doudian.request.TiktokOpenRequest;
import com.lucfish.openapi.doudian.request.parameters.CommentListParameters;
import com.lucfish.openapi.doudian.response.comment.CommentListResponse;

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
