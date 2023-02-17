package az.iktlab.ums_user_management_system.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkDto {
    private Long id;
    private String company;
    private int salary;
    private String position;
}
