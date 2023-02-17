package az.iktlab.ums_user_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private long id;
    private String name;
    private String surname;
    private  String patronymicName;
    private Gender gender;
    private String fin;
    private LocalDate birthDate;
    private MarriageStatus marriageStatus;
    private String nationality;
    private Address address;
    private Work work;
    private Education education;

}
