package az.iktlab.ums_user_management_system.repository;

import az.iktlab.ums_user_management_system.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,Long> {
    Optional<PersonEntity> findByFin(String fin);
}
