package ATM_DESIGN.state;

import java.math.BigDecimal;

import ATM_DESIGN.models.Card;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.models.ATM;

public class CashDispensing implements State {

    private final ATM atm;

    public CashDispensing(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void idleState() {
        throw new IllegalStateException("Cannot go to Idle State in Cash Dispensing State");
    }

    @Override
    public int startTransaction() {
        throw new IllegalStateException("Cannot start transaction in Cash Dispensing State");
    }

    @Override
    public boolean readAndValidateCardDetails(Card card) {
        throw new IllegalStateException("Cannot read and validate card details in Cash Dispensing State");
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot validate cash withdrawal amount in Cash Dispensing State");
    }

    @Override
    public boolean dispenseCash(Card card, BigDecimal amount) {
        System.out.println("Dispensing cash...");

        BigDecimal remainingBalance = this.atm.getAtmBalance().subtract(amount);
        this.atm.setAtmBalance(remainingBalance);

        System.out.println("Cash dispensed successfully");
        this.atm.setAtmState(new EjectCard(this.atm));
        return true;
    }

    @Override
    public boolean ejectCard(Card card) {
        throw new IllegalStateException("Cannot eject card in Cash Dispensing State");
    }

    @Override
    public void closeTransaction() {
        throw new IllegalStateException("Cannot close transaction in Cash Dispensing State");
    }

    @Override
    public ATMState getCurrentState() {
        return ATMState.CASH_DISPENSING;
    }
}
