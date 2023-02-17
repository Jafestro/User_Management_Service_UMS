package az.iktlab.ums_user_management_system.entity;

import az.iktlab.ums_user_management_system.model.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "patronymic_name")
    private String patronymicName;
    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    @Column(name = "fin",nullable = false,length = 7)
    private String fin;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "marriage_status")
    @Enumerated(value = EnumType.STRING)
    private MarriageStatus marriageStatus;
    @Column(name = "nationality")
    private String nationality;
    @OneToOne(targetEntity = AddressEntity.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private AddressEntity address;
    //Need to write Service and Controller part for each left entity
    @OneToMany(targetEntity = WorkEntity.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinTable(name = "person_works",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "work_id"))
    private List<WorkEntity> works;
    @OneToMany(targetEntity = EducationEntity.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinTable(name = "person_educations",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "education_id"))
    private List<EducationEntity> educations;
    @OneToMany(targetEntity = UserEntity.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinTable(name = "person_users",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<UserEntity> users;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
