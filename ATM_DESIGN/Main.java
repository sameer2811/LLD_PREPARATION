package ATM_DESIGN;

import java.math.BigDecimal;

import ATM_DESIGN.apis.NodeBackendApis;
import ATM_DESIGN.enums.CardType;
import ATM_DESIGN.models.ATM;
import ATM_DESIGN.models.Card;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To the ATM Machine State Design Pattern");

        ATM atm = new ATM.Builder()
                .setAtmId("1234567890")
                .setAtmBalance(new BigDecimal(1000))
                .setBackendApis(new NodeBackendApis())
                .build();

        Card card = new Card.Builder()
                .setCardNumber("1234567890")
                .setCardType(CardType.CREDIT_CARD)
                .setCardHolderName("John Doe")
                .setPin("123")
                .build();

        atm.startTransaction();

        atm.readAndValidateCardDetails(card);

        atm.validateCashWithdrawalAmount(card, new BigDecimal(100));

        atm.dispenseCash(card, new BigDecimal(100));

        atm.ejectCard(card);

        atm.closeTransaction();
    }
}