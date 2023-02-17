package az.iktlab.ums_user_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Education {
    private EducationLevel education;
    private String educationPlace;
    private String profession;
}
