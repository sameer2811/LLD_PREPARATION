package ATM_DESIGN.state;

import ATM_DESIGN.models.ATM;
import ATM_DESIGN.apis.NodeBackendApis;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.models.Card;
import java.math.BigDecimal;

public class CloseTransaction implements State {

    private final ATM atm;

    public CloseTransaction(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void idleState() {
        throw new IllegalStateException("Cannot go to Idle State in Close Transaction State");
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
