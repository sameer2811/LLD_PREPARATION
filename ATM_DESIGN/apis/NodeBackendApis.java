package ATM_DESIGN.apis;

import ATM_DESIGN.dto.StartTransactionRequestDto;
import ATM_DESIGN.dto.ValidateCardDetailsRequestDto;
import ATM_DESIGN.dto.ValidateCashWithdrawalAmountDto;
import ATM_DESIGN.dto.UpdateAtmBalanceRequestDto;
import ATM_DESIGN.dto.UpdateAtmStateRequestDto;
import ATM_DESIGN.dto.CloseTransactionRequestDto;

public class NodeBackendApis implements BackendApis {

    @Override
    public int startTransaction(StartTransactionRequestDto startTransactionRequestDto) {
        // TODO : We can implement the logic to start a Transaction
        // and return the transactionId which be given by the server.
        return 12345; // mimicking the response from the server;
    }

    @Override
    public boolean validateCardDetails(ValidateCardDetailsRequestDto validateCardDetailsRequestDto) {
        // TODO : We can implement the logic to validate the card details
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }

    @Override
    public boolean validateCashWithdrawalAmount(ValidateCashWithdrawalAmountDto validateCashWithdrawalAmountDto) {

        // TODO : We can implement the logic to validate the cash withdrawal amount
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }

    @Override
    public boolean updateAtmBalance(UpdateAtmBalanceRequestDto updateAtmBalanceRequestDto) {
        // TODO : We can implement the logic to update the ATM balance
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }

    @Override
    public boolean updateAtmState(UpdateAtmStateRequestDto updateAtmStateRequestDto) {
        // TODO : We can implement the logic to update the ATM state
        // OUr API will call the server to update the state of the ATM
        // and return the boolean value which be given by the server.
        return true; // mimicking the response from the server;
    }

    @Override
    public void closeTransaction(CloseTransactionRequestDto closeTransactionRequestDto) {
        // TODO : We can implement the logic to close the transaction
        // and return the boolean value which be given by the server.
        System.out.println("Transaction Closed for the ATM with ID: " + closeTransactionRequestDto.getAtmId());
        // mimicking the response from the server;
    }
}
