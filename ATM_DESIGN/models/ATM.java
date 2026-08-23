package ATM_DESIGN.models;

import ATM_DESIGN.apis.BackendApis;
import ATM_DESIGN.enums.ATMState;
import ATM_DESIGN.dto.UpdateAtmStateRequestDto;
import java.math.BigDecimal;

public class ATM {

    private String atmId;

    private ATMState atmState;

    private BigDecimal atmBalance;

    private BackendApis backendApis;

    public ATM(AtmBuilder atmBuilder) {
        this.atmId = atmBuilder.atmId;
        this.atmState = atmBuilder.atmState;
        this.atmBalance = atmBuilder.atmBalance;
        this.backendApis = atmBuilder.backendApis;
    }

    public String getAtmId() {
        return atmId;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public BigDecimal getAtmBalance() {
        return atmBalance;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
        this.backendApis.updateAtmState(new UpdateAtmStateRequestDto(this.atmId, this.atmState));
    }

    public static class AtmBuilder {
        private String atmId;
        private ATMState atmState;
        private BigDecimal atmBalance;
        private BackendApis backendApis;

        public AtmBuilder(String atmId) {
            this.atmId = atmId;
        }

        public AtmBuilder setAtmState(ATMState atmState) {
            this.atmState = atmState;
            return this;
        }

        public AtmBuilder setAtmBalance(BigDecimal atmBalance) {
            this.atmBalance = atmBalance;
            return this;
        }

        public AtmBuilder setBackendApis(BackendApis backendApis) {
            this.backendApis = backendApis;
            return this;
        }

        public ATM build() {
            return new ATM(this);
        }
    }

}
