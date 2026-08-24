package ATM_DESIGN.services;
import ATM_DESIGN.apis.BackendApis;
import ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;

public class CreditCardManagerService implements CardManagerService {

    private BackendApis backendAPI;

    public CreditCardManagerService(BackendApis backendAPI) {
        this.backendAPI = backendAPI;
    }

    @Override
    public boolean readAndValidateCardDetails(ValidateCardDetailsRequestDto validateCardDetailsRequestDto) {
        return backendAPI.validateCardDetails(validateCardDetailsRequestDto);
    }

    @Override
    public boolean validateCashWithdrawalAmount(ValidateCashWithdrawalAmountDto validateCashWithdrawalAmountDto) {
        return backendAPI.validateCashWithdrawalAmount(validateCashWithdrawalAmountDto);
    }
}   
