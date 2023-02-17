package az.iktlab.ums_user_management_system.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private Person person;
}
