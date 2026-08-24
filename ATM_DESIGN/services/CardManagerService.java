package ATM_DESIGN.services;

import ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;

public interface CardManagerService {

    boolean readAndValidateCardDetails(ValidateCardDetailsRequestDto validateCardDetailsRequestDto);

    boolean validateCashWithdrawalAmount(ValidateCashWithdrawalAmountDto validateCashWithdrawalAmountDto);
}
