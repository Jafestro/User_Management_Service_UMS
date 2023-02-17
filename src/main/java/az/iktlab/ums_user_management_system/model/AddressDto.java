package az.iktlab.ums_user_management_system.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDto {
    private Long id;
    private String city;
    private String region;
    private String zipCode;
}
