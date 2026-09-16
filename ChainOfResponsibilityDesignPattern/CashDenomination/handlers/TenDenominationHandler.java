package ChainOfResponsibilityDesignPattern.CashDenomination.handlers;
import ChainOfResponsibilityDesignPattern.CashDenomination.models.CashRequest;

public class TenDenominationHandler extends BaseDenominationHandler {
    private int tenDenominationCount = 10;

    @Override
    public boolean handleCashDispenseRequest(CashRequest cashRequest) {
        if (cashRequest.getAmount() >= 10 && tenDenominationCount > 0) {
            int numberOfTenDenominations = cashRequest.getAmount() / 10;
            int numberOfTenDenominationsToDispense = Math.min(numberOfTenDenominations, tenDenominationCount);
            tenDenominationCount -= numberOfTenDenominationsToDispense;
            cashRequest.setAmount(cashRequest.getAmount() - numberOfTenDenominationsToDispense * 10);

            System.out.println("Remaining amount: " + cashRequest.getAmount());
            System.out.println("Remaining ten denomination count: " + tenDenominationCount);
        }
        return forwardToNextAvailableDenomination(cashRequest);
    }

}
