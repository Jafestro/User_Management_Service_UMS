package az.iktlab.ums_user_management_system.repository;

import az.iktlab.ums_user_management_system.entity.WorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<WorkEntity,Long> {
}
