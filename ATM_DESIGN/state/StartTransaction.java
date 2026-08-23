package ATM_DESIGN.state;

import java.math.BigDecimal;

import ATM_DESIGN.apis.BackendApis;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.models.ATM;
import ATM_DESIGN.models.Card;
import ATM_DESIGN.dto.StartTransactionRequestDto;

public class StartTransaction implements State {

    private final BackendApis backendApis;
    private final ATM atm;

    public StartTransaction(BackendApis backendApis, ATM atm) {
        this.backendApis = backendApis;
        this.atm = atm;
    }

    @Override
    public void idleState() {
        System.out.println("ATM is in Idle State");
    }

    @Override
    public int startTransaction() {
        System.out.println("Your Transaction is Started !!!");
        int transactionId = backendApis.startTransaction(new StartTransactionRequestDto(this.atm.getAtmId()));
        System.out.println("Transaction ID: " + transactionId);

        if (transactionId > 0) {
            this.atm.setAtmState(ATMState.READ_AND_VALIDATE_CARD_DETAILS);
        } else {
            System.out.println("Transaction Failed !!! Cannot Initiate the Transaction !!!");
            this.atm.setAtmState(ATMState.CLOSE_TRANSACTION);
        }
        return transactionId;
    }

    @Override
    public boolean readAndValidateCardDetails(Card card) {
        throw new IllegalStateException("Cannot read and validate card details in Start Transaction State");
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot validate cash withdrawal amount in Start Transaction State");
    }

    @Override
    public boolean dispenseCash(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot dispense cash in Start Transaction State");
    }

    @Override
    public boolean ejectCard(Card card) {
        throw new IllegalStateException("Cannot eject card in Start Transaction State");
    }

    @Override
    public void closeTransaction() {
        System.out.println("Your Transaction is Closed !!!");
        this.atm.setAtmState(ATMState.IDLE);
    }

    @Override
    public ATMState getCurrentState() {
        return ATMState.START_TRANSACTION;
    }
}
