package ATM_DESIGN.dto;

public class StartTransactionRequestDto {
    private final String atmId;

    public StartTransactionRequestDto(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
