package ATM_DESIGN.state;

import java.math.BigDecimal;

import ATM_DESIGN.models.ATM;
import ATM_DESIGN.models.Card;
import ATM_DESIGN.services.CardManagerService;
import ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.factory.CardFactory;

public class ReadAndValidateCardDetails implements State {

    private final ATM atm;

    public ReadAndValidateCardDetails(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int startTransaction() {
        throw new IllegalStateException("Cannot start transaction in Read and Validate Card Details State");
    }

    @Override
    public boolean readAndValidateCardDetails(Card card) {

        System.out.println("Reading and validating card details...");
        CardManagerService cardManagerService = CardFactory.getCardManagerService(card.getCardType());

        boolean isCardValid = cardManagerService.readAndValidateCardDetails(new ValidateCardDetailsRequestDto(card));

        if (isCardValid) {
            System.out.println("Card is valid");
            this.atm.setAtmState(new ValidateCashWithDrawalAmount(this.atm));
        } else {
            System.out.println("Card is not valid");
            this.atm.setAtmState(new CloseTransaction(this.atm));
        }
        return isCardValid;
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        throw new IllegalStateException(
                "Cannot validate cash withdrawal amount in Read and Validate Card Details State");
    }

    @Override
    public boolean dispenseCash(Card card, BigDecimal amount) {
        throw new IllegalStateException("Cannot dispense cash in Read and Validate Card Details State");
    }

    @Override
    public boolean ejectCard(Card card) {
        throw new IllegalStateException("Cannot eject card in Read and Validate Card Details State");
    }

    @Override
    public void closeTransaction() {
        throw new IllegalStateException("Cannot close transaction in Read and Validate Card Details State");
    }

    @Override
    public ATMState getCurrentState() {
        return ATMState.READ_AND_VALIDATE_CARD_DETAILS;
    }
}
