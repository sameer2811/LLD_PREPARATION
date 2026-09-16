package ChainOfResponsibilityDesignPattern.Middleware.interfaces;

import ChainOfResponsibilityDesignPattern.Middleware.models.Request;

public interface RequestHandler {
    boolean handle(Request request);

    public void setNext(RequestHandler next);
}
