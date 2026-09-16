package ChainOfResponsibilityDesignPattern.CashDenomination.src;

import ChainOfResponsibilityDesignPattern.CashDenomination.interfaces.CashDispenseHandler;
import ChainOfResponsibilityDesignPattern.CashDenomination.handlers.FiftyDenominationHandler;
import ChainOfResponsibilityDesignPattern.CashDenomination.handlers.HundredDenominationHandler;
import ChainOfResponsibilityDesignPattern.CashDenomination.handlers.TwentyDenominationHandler;
import ChainOfResponsibilityDesignPattern.CashDenomination.handlers.TenDenominationHandler;
import ChainOfResponsibilityDesignPattern.CashDenomination.models.CashRequest;

public class Main {
    public static void main(String[] args) {
        CashDispenseHandler hundredDenominationHandler = new HundredDenominationHandler();
        CashDispenseHandler fiftyDenominationHandler = new FiftyDenominationHandler();
        CashDispenseHandler twentyDenominationHandler = new TwentyDenominationHandler();
        CashDispenseHandler tenDenominationHandler = new TenDenominationHandler();

        hundredDenominationHandler.setNext(fiftyDenominationHandler);
        fiftyDenominationHandler.setNext(twentyDenominationHandler);
        twentyDenominationHandler.setNext(tenDenominationHandler);

        CashRequest cashRequest = new CashRequest(1250);
        boolean isCashDispensed = hundredDenominationHandler.handleCashDispenseRequest(cashRequest);
        if (isCashDispensed) {
            System.out.println("Cash dispensed successfully");
        } else {
            System.out.println("Cash dispensation failed");
        }

    }
}
