package ChainOfResponsibilityDesignPattern.Middleware.handlers;

import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public class ValidationHandler extends RequestBaseHandler {

    @Override
    public boolean handle(Request request) {
        System.out.println("Validation Handler: Validating request");
        System.out.println("Validation Handler: Validation successful");
        System.out.println("Passing request to next handler");
        return executeNextHandler(request);
    }

}
