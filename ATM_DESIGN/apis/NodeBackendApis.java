package ATM_DESIGN.apis;

import ATM_DESIGN.models.ATM;
import ATM_DESIGN.models.Card;
import java.math.BigDecimal;
import ATM_DESIGN.enums.ATMState;

public class NodeBackendApis implements BackendApis {

    @Override
    public int startTransaction(String atmId) {
        // TODO : We can implement the logic to start a Transaction
        // and return the transactionId which be given by the server.
        return 12345; // mimicking the response from the server;
    }

    @Override
    public boolean validateCardDetails(Card card) {
        // TODO : We can implement the logic to validate the card details
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {

        // TODO : We can implement the logic to validate the cash withdrawal amount
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }

    @Override
    public boolean updateAtmBalance(ATM atm, BigDecimal amount) {

        // TODO : We can implement the logic to update the ATM balance
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }

    @Override
    public boolean updateAtmState(ATM atm, ATMState atmState) {

        // TODO : We can implement the logic to update the ATM state
        // OUr API will call the server to update the state of the ATM
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }
}
