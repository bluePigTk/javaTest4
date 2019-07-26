package com.tk.exam1.model;

public class ExamResult {
    private  Boolean status;
    private String msg;
    private Object data;

    @Override
    public String toString() {
        return "ExamResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public ExamResult() {

    }

    public ExamResult(Boolean status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ExamResult(Boolean status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
