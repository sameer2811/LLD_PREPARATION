package ATM_DESIGN.dto;

import java.math.BigDecimal;

import ATM_DESIGN.models.Card;

public class ValidateCashWithdrawalAmountDto {

    private final Card card;
    private final BigDecimal amount;

    public ValidateCashWithdrawalAmountDto(Card card, BigDecimal amount) {
        this.card = card;
        this.amount = amount;
    }

    public Card getCard() {
        return card;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}
