package ATM_DESIGN.state;

import java.math.BigDecimal;

import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.models.Card;

public interface State {
    int startTransaction();

    boolean readAndValidateCardDetails(Card card);

    boolean validateCashWithdrawalAmount(Card card, BigDecimal amount);

    boolean dispenseCash(Card card, BigDecimal amount);

    boolean ejectCard(Card card);

    void closeTransaction();

    ATMState getCurrentState();
}
