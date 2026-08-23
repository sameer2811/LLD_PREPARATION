package ATM_DESIGN.services;

import java.math.BigDecimal;

import ATM_DESIGN.models.Card;

public interface CardManagerService {

    boolean readAndValidateCardDetails(Card card);

    boolean validateCashWithdrawalAmount(Card card, BigDecimal amount);
}
