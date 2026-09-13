package StateDesignPattern.ATM_DESIGN.factory;

import StateDesignPattern.ATM_DESIGN.apis.NodeBackendApis;
import StateDesignPattern.ATM_DESIGN.enums.CardType;
import StateDesignPattern.ATM_DESIGN.services.CardManagerService;
import StateDesignPattern.ATM_DESIGN.services.CreditCardManagerService;
import StateDesignPattern.ATM_DESIGN.services.DebitCardManagerService;

public class CardFactory {
    public static CardManagerService getCardManagerService(CardType cardType) {
        switch (cardType) {
            case CREDIT_CARD:
                return new CreditCardManagerService(new NodeBackendApis());
            case DEBIT_CARD:
                return new DebitCardManagerService(new NodeBackendApis());
            default:
                throw new IllegalArgumentException("Invalid card type: " + cardType);
        }
    }
}
