package ChainOfResponsibilityDesignPattern.Middleware.handlers;

import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public class RateLimiterHandler extends RequestBaseHandler {

    @Override
    public boolean handle(Request request) {
        System.out.println("Rate Limiter Handler: Rate limiting request");
        System.out.println("Rate Limiter Handler: Rate limiting successful");
        System.out.println("Passing request to next handler");
        return executeNextHandler(request);
    }
}
