package ATM_DESIGN.dto;

import java.math.BigDecimal;

public class UpdateAtmBalanceRequestDto {
    private final String atmId;
    private final BigDecimal amount;

    public UpdateAtmBalanceRequestDto(String atmId, BigDecimal amount) {
        this.atmId = atmId;
        this.amount = amount;
    }

    public String getAtmId() {
        return atmId;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
