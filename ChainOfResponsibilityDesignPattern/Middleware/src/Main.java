package ChainOfResponsibilityDesignPattern.Middleware.src;

import ChainOfResponsibilityDesignPattern.Middleware.handlers.AuthenticationHandler;
import ChainOfResponsibilityDesignPattern.Middleware.handlers.AuthorizationHandler;
import ChainOfResponsibilityDesignPattern.Middleware.handlers.BusinessValidationHandler;
import ChainOfResponsibilityDesignPattern.Middleware.handlers.RateLimiterHandler;
import ChainOfResponsibilityDesignPattern.Middleware.handlers.ValidationHandler;
import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public class Main {

    public static void main(String[] args) {
        Request request = new Request.RequestBuilder()
                .setIpAddress("127.0.0.1")
                .setUrl("https://www.google.com")
                .setMethod("GET")
                .setRequestBody("").setRequestHeader("").setRequestParam("").setRequestQuery("").setRequestPath("")
                .setRequestHost("www.google.com").build();

        BusinessValidationHandler businessValidationHandler = new BusinessValidationHandler();
        ValidationHandler validationHandler = new ValidationHandler();
        RateLimiterHandler rateLimiterHandler = new RateLimiterHandler();
        AuthorizationHandler authorizationHandler = new AuthorizationHandler();
        AuthenticationHandler authenticationHandler = new AuthenticationHandler();

        authenticationHandler.setNext(authorizationHandler);
        authorizationHandler.setNext(rateLimiterHandler);
        rateLimiterHandler.setNext(validationHandler);
        validationHandler.setNext(businessValidationHandler);
        businessValidationHandler.setNext(null);

        boolean isRequestProcessed = authenticationHandler.handle(request);
        if (isRequestProcessed) {
            System.out.println("Request processed successfully");
        } else {
            System.out.println("Request processing failed");
        }

    }
}
