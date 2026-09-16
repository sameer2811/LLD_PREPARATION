package ChainOfResponsibilityDesignPattern.Middleware.handlers;

import ChainOfResponsibilityDesignPattern.Middleware.interfaces.RequestHandler;
import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public abstract class RequestBaseHandler implements RequestHandler {

    protected RequestHandler next;

    @Override
    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public boolean executeNextHandler(Request request) {
        if (this.next == null) {
            System.out.println("No next handler found");
            System.out.println("Request processed successfully");
            System.out.println("Not Passing this request to next handler");
            return true;
        }
        System.out.println("Passing request to next handler");
        return this.next.handle(request);
    }

}
