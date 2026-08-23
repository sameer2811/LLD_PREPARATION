package ATM_DESIGN.factory;

import ATM_DESIGN.apis.NodeBackendApis;
import ATM_DESIGN.enums.CardType;
import ATM_DESIGN.services.CardManagerService;
import ATM_DESIGN.services.CreditCardManagerService;
import ATM_DESIGN.services.DebitCardManagerService;

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
