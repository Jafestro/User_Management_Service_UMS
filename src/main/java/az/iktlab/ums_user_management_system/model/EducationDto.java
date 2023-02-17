package az.iktlab.ums_user_management_system.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EducationDto {
    private Long id;
    private EducationLevel education;
    private String educationPlace;
    private String profession;
}
