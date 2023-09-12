package com.java_course.webservicesspringbootjpahibernate.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 2662016207L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

}
