package ATM_DESIGN.state;

import java.math.BigDecimal;

import ATM_DESIGN.models.Card;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.models.ATM;

public class EjectCard implements State {
    private final ATM atm;

    public EjectCard(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void idleState() {
        throw new IllegalStateException("Cannot go to Idle State in Eject Card State");
    }

    @Override
    public int startTransaction() {
        throw new IllegalStateException("Cannot start transaction in Eject Card State");
    }

    @Override
    public boolean readAndValidateCardDetails(Card card) {
        throw new IllegalStateException("Cannot read and validate card details in Eject Card State");
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot validate cash withdrawal amount in Eject Card State");
    }

    @Override
    public boolean dispenseCash(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot dispense cash in Eject Card State");
    }

    @Override
    public boolean ejectCard(Card card) {
        System.out.println("Ejecting card...");

        System.out.println("Card ejected successfully");
        this.atm.setAtmState(ATMState.CLOSE_TRANSACTION);
        return true;
    }

    @Override
    public void closeTransaction() {
        throw new IllegalStateException("Cannot close transaction in Eject Card State");
    }

    @Override
    public ATMState getCurrentState() {
        return ATMState.EJECT_CARD;
    }
}
