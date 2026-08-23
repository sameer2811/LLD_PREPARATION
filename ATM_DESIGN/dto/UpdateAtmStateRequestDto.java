package ATM_DESIGN.dto;

import ATM_DESIGN.enums.ATMState;

public class UpdateAtmStateRequestDto {

    private final String atmId;
    private final ATMState atmState;

    public UpdateAtmStateRequestDto(String atmId, ATMState atmState) {
        this.atmId = atmId;
        this.atmState = atmState;
    }

    public String getAtmId() {
        return atmId;
    }

    public ATMState getAtmState() {
        return atmState;
    }
}
