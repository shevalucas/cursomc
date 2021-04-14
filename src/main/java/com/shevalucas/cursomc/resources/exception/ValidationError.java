package com.shevalucas.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends  StandardError {

    private List<FieldMessage>errors =new ArrayList<>();

    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void AddError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
