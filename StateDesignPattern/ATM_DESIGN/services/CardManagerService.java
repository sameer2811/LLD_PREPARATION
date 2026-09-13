package StateDesignPattern.ATM_DESIGN.services;

import StateDesignPattern.ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import StateDesignPattern.ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;

public interface CardManagerService {

    boolean readAndValidateCardDetails(ValidateCardDetailsRequestDto validateCardDetailsRequestDto);

    boolean validateCashWithdrawalAmount(ValidateCashWithdrawalAmountDto validateCashWithdrawalAmountDto);
}
