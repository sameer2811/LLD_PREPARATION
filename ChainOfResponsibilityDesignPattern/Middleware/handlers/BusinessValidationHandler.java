package ChainOfResponsibilityDesignPattern.Middleware.handlers;

import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public class BusinessValidationHandler extends RequestBaseHandler {

    @Override
    public boolean handle(Request request) {
        System.out.println("Business Validation Handler: Validating request");
        System.out.println("Business Validation Handler: Validation successful");
        System.out.println("Passing request to next handler");
        return executeNextHandler(request);
    }
}
