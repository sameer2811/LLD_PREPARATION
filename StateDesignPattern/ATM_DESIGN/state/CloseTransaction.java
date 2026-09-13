package StateDesignPattern.ATM_DESIGN.state;

import java.math.BigDecimal;

import StateDesignPattern.ATM_DESIGN.apis.NodeBackendApis;
import StateDesignPattern.ATM_DESIGN.enums.ATMState;
import StateDesignPattern.ATM_DESIGN.models.ATM;
import StateDesignPattern.ATM_DESIGN.models.Card;

public class CloseTransaction implements State {

    private final ATM atm;

    public CloseTransaction(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int startTransaction() {
        throw new IllegalStateException("Cannot start transaction in Close Transaction State");
    }

    @Override
    public boolean readAndValidateCardDetails(Card card) {
        throw new IllegalStateException("Cannot read and validate card details in Close Transaction State");
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot validate cash withdrawal amount in Close Transaction State");
    }

    @Override
    public boolean dispenseCash(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot dispense cash in Close Transaction State");
    }

    @Override
    public boolean ejectCard(Card card) {
        throw new IllegalStateException("Cannot eject card in Close Transaction State");
    }

    @Override
    public void closeTransaction() {
        System.out.println("Closing transaction...");

        System.out.println("Transaction closed successfully");
        this.atm.setAtmState(new StartTransaction(new NodeBackendApis(), this.atm));
    }

    @Override
    public ATMState getCurrentState() {
        return ATMState.CLOSE_TRANSACTION;
    }
}
