package ATM_DESIGN.models;

import ATM_DESIGN.apis.BackendApis;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.state.StartTransaction;
import ATM_DESIGN.state.State;
import ATM_DESIGN.dto.UpdateAtmBalanceRequestDto;
import ATM_DESIGN.dto.UpdateAtmStateRequestDto;
import java.math.BigDecimal;
import ATM_DESIGN.apis.NodeBackendApis;

public class ATM {

    private String atmId;

    private State state;

    private BigDecimal atmBalance;

    private BackendApis backendApis;

    public ATM(Builder Builder) {
        this.atmId = Builder.atmId;
        this.state = new StartTransaction(new NodeBackendApis(), this);
        this.atmBalance = Builder.atmBalance;
        this.backendApis = Builder.backendApis;
    }

    public String getAtmId() {
        return atmId;
    }

    public ATMState getAtmState() {
        return state.getCurrentState();
    }

    public BigDecimal getAtmBalance() {
        return atmBalance;
    }

    public void startTransaction() {
        this.state.startTransaction();
    }

    public void readAndValidateCardDetails(Card card) {
        this.state.readAndValidateCardDetails(card);
    }

    public void validateCashWithdrawalAmount(Card card, BigDecimal amount) {
        this.state.validateCashWithdrawalAmount(card, amount);
    }

    public void dispenseCash(Card card, BigDecimal amount) {
        this.state.dispenseCash(card, amount);
    }

    public void ejectCard(Card card) {
        this.state.ejectCard(card);
    }

    public void closeTransaction() {
        this.state.closeTransaction();
    }

    public void setAtmState(State state) {
        this.state = state;
        this.backendApis.updateAtmState(new UpdateAtmStateRequestDto(this.atmId, this.state.getCurrentState()));
    }

    public void setAtmBalance(BigDecimal atmBalance) {
        this.atmBalance = atmBalance;
        this.backendApis.updateAtmBalance(new UpdateAtmBalanceRequestDto(this.atmId, this.atmBalance));
    }

    public static class Builder {
        private String atmId;
        private BigDecimal atmBalance;
        private BackendApis backendApis;

        public Builder setAtmId(String atmId) {
            this.atmId = atmId;
            return this;
        }

        public Builder setAtmBalance(BigDecimal atmBalance) {
            this.atmBalance = atmBalance;
            return this;
        }

        public Builder setBackendApis(BackendApis backendApis) {
            this.backendApis = backendApis;
            return this;
        }

        public ATM build() {
            return new ATM(this);
        }
    }

}
