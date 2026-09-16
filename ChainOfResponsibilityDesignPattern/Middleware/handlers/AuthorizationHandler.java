package ChainOfResponsibilityDesignPattern.Middleware.handlers;
import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public class AuthorizationHandler extends RequestBaseHandler {

    @Override
    public boolean handle(Request request) {
        System.out.println("Authorization Handler: Authorizing request");
        System.out.println("Authorization Handler: Authorization successful");
        System.out.println("Passing request to next handler");
        return executeNextHandler(request);
    }
}
