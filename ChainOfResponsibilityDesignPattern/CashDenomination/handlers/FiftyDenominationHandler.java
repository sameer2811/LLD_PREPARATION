package ChainOfResponsibilityDesignPattern.CashDenomination.handlers;

import ChainOfResponsibilityDesignPattern.CashDenomination.models.CashRequest;

public class FiftyDenominationHandler extends BaseDenominationHandler {

    private int fiftyDenominationCount = 50;

    @Override
    public boolean handleCashDispenseRequest(CashRequest cashRequest) {
        if (cashRequest.getAmount() >= 50 && fiftyDenominationCount > 0) {
            int numberOfFiftyDenominations = cashRequest.getAmount() / 50;
            System.out.println("Dispensing " + numberOfFiftyDenominations + " fifty denominations");

            int numberOfFiftyDenominationsToDispense = Math.min(numberOfFiftyDenominations, fiftyDenominationCount);
            fiftyDenominationCount -=  numberOfFiftyDenominationsToDispense;
            cashRequest.setAmount(cashRequest.getAmount() - numberOfFiftyDenominationsToDispense * 50);

            System.out.println("Remaining amount: " + cashRequest.getAmount());
            System.out.println("Remaining fifty denomination count: " + fiftyDenominationCount);
        }
        return forwardToNextAvailableDenomination(cashRequest);
    }
}
