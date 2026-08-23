package ATM_DESIGN.apis;

import java.math.BigDecimal;

import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.models.ATM;
import ATM_DESIGN.models.Card;

public interface BackendApis {
    int startTransaction(String atmId);

    boolean validateCardDetails(Card card);

    boolean validateCashWithdrawalAmount(Card card, BigDecimal amount);

    boolean updateAtmBalance(ATM atm, BigDecimal amount);

    boolean updateAtmState(ATM atm, ATMState atmState);
}
