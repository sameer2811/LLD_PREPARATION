package ATM_DESIGN.state;

import java.math.BigDecimal;

import ATM_DESIGN.models.Card;
import ATM_DESIGN.models.ATM;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.factory.CardFactory;
import ATM_DESIGN.services.CardManagerService;
import ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;

public class ValidateCashWithDrawalAmount implements State {

    private final ATM atm;

    public ValidateCashWithDrawalAmount(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int startTransaction() {
        throw new IllegalStateException("Cannot start transaction in Validate Cash Withdrawal Amount State");
    }

    @Override
    public boolean readAndValidateCardDetails(Card card) {
        throw new IllegalStateException(
                "Cannot read and validate card details in Validate Cash Withdrawal Amount State");
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        CardManagerService cardManagerService = CardFactory.getCardManagerService(card.getCardType());

        boolean isCashWithdrawalAmountValid = cardManagerService
                .validateCashWithdrawalAmount(new ValidateCashWithdrawalAmountDto(card, amount));

        if (isCashWithdrawalAmountValid) {
            this.atm.setAtmState(new CashDispensing(this.atm));
        } else {
            System.out.println("Cash withdrawal amount is not valid");
            this.atm.setAtmState(new CloseTransaction(this.atm));
        }
        return isCashWithdrawalAmountValid;
    }

    @Override
    public boolean dispenseCash(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot dispense cash in Validate Cash Withdrawal Amount State");
    }

    @Override
    public boolean ejectCard(Card card) {
        throw new IllegalStateException("Cannot eject card in Validate Cash Withdrawal Amount State");
    }

    @Override
    public void closeTransaction() {
        throw new IllegalStateException("Cannot close transaction in Validate Cash Withdrawal Amount State");
    }

    @Override
    public ATMState getCurrentState() {
        return ATMState.VALIDATE_CASH_WITHDRAWAL_AMOUNT;
    }
}
