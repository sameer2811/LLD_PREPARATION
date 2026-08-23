package ATM_DESIGN.dto;

public class CloseTransactionRequestDto {
    private final String atmId;

    public CloseTransactionRequestDto(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
