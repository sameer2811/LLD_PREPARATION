package ATM_DESIGN.models;

import ATM_DESIGN.enums.CardType;

public class Card {
    private String cardNumber;
    private String cardHolderName;
    private String pin;
    private CardType cardType;

    private Card(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.cardHolderName = builder.cardHolderName;
        this.pin = builder.pin;
        this.cardType = builder.cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getPin() {
        return pin;
    }

    public CardType getCardType() {
        return cardType;
    }

    @Override
    public String toString() {
        return "Card [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", pin=" + pin + ", cardType="
                + cardType + "]";
    }

    public static class Builder {
        private String cardNumber;
        private String cardHolderName;
        private String pin;
        private CardType cardType;

        public Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setCardType(CardType cardType) {
            this.cardType = cardType;
            return this;
        }

        public Builder setCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public Builder setPin(String pin) {
            this.pin = pin;
            return this;
        }

        public Card build() {
            return new Card(this);
        }
    }
}
