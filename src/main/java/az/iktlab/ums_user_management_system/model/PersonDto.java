package az.iktlab.ums_user_management_system.model;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class PersonDto {
    private Long id;
    private String name;
    private String surname;
    private  String patronymicName;
    private Gender gender;
    private String fin;
    private LocalDate birthDate;
    private MarriageStatus marriageStatus;
    private String nationality;
}
