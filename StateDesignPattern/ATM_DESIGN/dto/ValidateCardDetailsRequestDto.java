package StateDesignPattern.ATM_DESIGN.dto;

import StateDesignPattern.ATM_DESIGN.models.Card;

public class ValidateCardDetailsRequestDto {

    private final Card card;

    public ValidateCardDetailsRequestDto(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
}
