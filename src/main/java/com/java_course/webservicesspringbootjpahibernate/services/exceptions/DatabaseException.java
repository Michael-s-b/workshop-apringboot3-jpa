package com.java_course.webservicesspringbootjpahibernate.services.exceptions;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = -6793761859L;

    public DatabaseException(String msg) {
        super(msg);
    }

}
