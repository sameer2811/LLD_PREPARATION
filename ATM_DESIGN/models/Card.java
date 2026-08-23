package ATM_DESIGN.models;

public class Card {
    private String cardNumber;
    private String cardHolderName;
    private String pin;

    private Card(CardBuilder builder) {
        this.cardNumber = builder.cardNumber;
        this.cardHolderName = builder.cardHolderName;
        this.pin = builder.pin;
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

    @Override
    public String toString() {
        return "Card [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", pin=" + pin + "]";
    }

    public static class CardBuilder {
        private String cardNumber;
        private String cardHolderName;
        private String pin;

        public CardBuilder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public CardBuilder setCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public CardBuilder setPin(String pin) {
            this.pin = pin;
            return this;
        }

        public Card build() {
            return new Card(this);
        }
    }
}
