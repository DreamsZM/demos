package com.zy.demos;

/**
 * @author Zhao Min
 */
public enum Status {
    //
    CONTINUE(100),
    //
    PROCESSING(102),
    ;

    private int code;

    Status(int code) {
        this.code = code;
    }
}
