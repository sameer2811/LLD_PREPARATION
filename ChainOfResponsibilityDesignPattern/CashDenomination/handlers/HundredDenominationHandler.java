package ChainOfResponsibilityDesignPattern.CashDenomination.handlers;

import ChainOfResponsibilityDesignPattern.CashDenomination.models.CashRequest;

public class HundredDenominationHandler extends BaseDenominationHandler {

    private int hundredDenominationCount = 100;

    @Override
    public boolean handleCashDispenseRequest(CashRequest cashRequest) {
        if (cashRequest.getAmount() >= 100 && hundredDenominationCount > 0) {
            int numberOfHundredDenominations = cashRequest.getAmount() / 100;
            int numberOfHundredDenominationsToDispense = Math.min(numberOfHundredDenominations,
                    hundredDenominationCount);
            hundredDenominationCount -= numberOfHundredDenominationsToDispense;
            cashRequest.setAmount(cashRequest.getAmount() - numberOfHundredDenominationsToDispense * 100);

            System.out.println("Remaining amount: " + cashRequest.getAmount());
            System.out.println("Remaining hundred denomination count: " + hundredDenominationCount);
        }
        return forwardToNextAvailableDenomination(cashRequest);
    }
}
