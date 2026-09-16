package ChainOfResponsibilityDesignPattern.Middleware.handlers;
import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public class AuthenticationHandler extends RequestBaseHandler {

    @Override
    public boolean handle(Request request) {
        System.out.println("Authentication Handler: Authenticating request");
        System.out.println("Authentication Handler: Authentication successful");
        System.out.println("Passing request to next handler");
        return executeNextHandler(request);    
    }

}
