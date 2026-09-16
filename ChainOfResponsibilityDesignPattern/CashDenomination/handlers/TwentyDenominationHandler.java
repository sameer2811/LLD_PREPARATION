package ChainOfResponsibilityDesignPattern.CashDenomination.handlers;

import ChainOfResponsibilityDesignPattern.CashDenomination.models.CashRequest;

public class TwentyDenominationHandler extends BaseDenominationHandler {
    private int twentyDenominationCount = 20;

    @Override
    public boolean handleCashDispenseRequest(CashRequest cashRequest) {
        if (cashRequest.getAmount() >= 20 && twentyDenominationCount > 0) {
            int numberOfTwentyDenominations = cashRequest.getAmount() / 20;
            int numberOfTwentyDenominationsToDispense = Math.min(numberOfTwentyDenominations, twentyDenominationCount);
            twentyDenominationCount -= numberOfTwentyDenominationsToDispense;
            cashRequest.setAmount(cashRequest.getAmount() - numberOfTwentyDenominationsToDispense * 20);

            System.out.println("Remaining amount: " + cashRequest.getAmount());
            System.out.println("Remaining twenty denomination count: " + twentyDenominationCount);
        }
        return forwardToNextAvailableDenomination(cashRequest);
    }

}
