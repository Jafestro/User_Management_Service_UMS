package az.iktlab.ums_user_management_system.repository;

import az.iktlab.ums_user_management_system.entity.PersonEntity;
import az.iktlab.ums_user_management_system.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UmsRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByPerson(PersonEntity person);
}
