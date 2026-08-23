package ATM_DESIGN.apis;

import ATM_DESIGN.dto.StartTransactionRequestDto;
import ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;
import ATM_DESIGN.dto.UpdateAtmBalanceRequestDto;
import ATM_DESIGN.dto.UpdateAtmStateRequestDto;
import ATM_DESIGN.dto.CloseTransactionRequestDto;

public interface BackendApis {
    int startTransaction(StartTransactionRequestDto startTransactionRequestDto);

    boolean validateCardDetails(ValidateCardDetailsRequestDto validateCardDetailsRequestDto);

    boolean validateCashWithdrawalAmount(ValidateCashWithdrawalAmountDto validateCashWithdrawalAmountDto);

    boolean updateAtmBalance(UpdateAtmBalanceRequestDto updateAtmBalanceRequestDto);

    boolean updateAtmState(UpdateAtmStateRequestDto updateAtmStateRequestDto);

    void closeTransaction(CloseTransactionRequestDto closeTransactionRequestDto);
}
