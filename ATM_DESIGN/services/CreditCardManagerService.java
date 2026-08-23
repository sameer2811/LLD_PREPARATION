package ATM_DESIGN.services;

import java.math.BigDecimal;

import ATM_DESIGN.apis.BackendApis;
import ATM_DESIGN.models.Card;
import ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;

public class CreditCardManagerService implements CardManagerService {

    private BackendApis backendAPI;

    public CreditCardManagerService(BackendApis backendAPI) {
        this.backendAPI = backendAPI;
    }

    @Override
    public boolean readAndValidateCardDetails(Card card) {
        return backendAPI.validateCardDetails(new ValidateCardDetailsRequestDto(card));
    }

    @Override
    public boolean validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        return backendAPI.validateCashWithdrawalAmount(new ValidateCashWithdrawalAmountDto(card, amount));
    }
}
