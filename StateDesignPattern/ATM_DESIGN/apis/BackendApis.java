package StateDesignPattern.ATM_DESIGN.apis;

import StateDesignPattern.ATM_DESIGN.dto.CloseTransactionRequestDto;
import StateDesignPattern.ATM_DESIGN.dto.StartTransactionRequestDto;
import StateDesignPattern.ATM_DESIGN.dto.UpdateAtmBalanceRequestDto;
import StateDesignPattern.ATM_DESIGN.dto.UpdateAtmStateRequestDto;
import StateDesignPattern.ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import StateDesignPattern.ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;

public interface BackendApis {
    int startTransaction(StartTransactionRequestDto startTransactionRequestDto);

    boolean validateCardDetails(ValidateCardDetailsRequestDto validateCardDetailsRequestDto);

    boolean validateCashWithdrawalAmount(ValidateCashWithdrawalAmountDto validateCashWithdrawalAmountDto);

    boolean updateAtmBalance(UpdateAtmBalanceRequestDto updateAtmBalanceRequestDto);

    boolean updateAtmState(UpdateAtmStateRequestDto updateAtmStateRequestDto);

    void closeTransaction(CloseTransactionRequestDto closeTransactionRequestDto);
}
