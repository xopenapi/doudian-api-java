package io.github.xopenapi.doudian.response;

public class ErrorResponse extends TiktokOpenResponse<Object> {

    public ErrorResponse() {
        super();
        setErr_no(99);
        setMessage("查看日志");
    }

}
