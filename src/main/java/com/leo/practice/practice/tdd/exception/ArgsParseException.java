package com.leo.practice.practice.tdd.exception;

/**
 * Description:
 *
 * @author lh
 * @version 1.0
 * Date:2022/3/21 10:57 PM
 */
public class ArgsParseException extends RuntimeException{
    public ArgsParseException(String message) {
        super(message);
    }
}
