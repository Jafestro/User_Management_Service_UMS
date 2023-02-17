package az.iktlab.ums_user_management_system.service;

import az.iktlab.ums_user_management_system.mapper.WorkMapper;
import az.iktlab.ums_user_management_system.model.WorkDto;
import az.iktlab.ums_user_management_system.repository.WorkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {

    private final WorkRepository repository;

    public WorkService(WorkRepository repository) {
        this.repository = repository;
    }

    public List<WorkDto> getAll() {
        return WorkMapper.INSTANCE.mapToDtos(repository.findAll());
    }


    public WorkDto findById(Long id) {
        return WorkMapper.INSTANCE.mapToDto(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("WORK_NOT_EXIST")));

    }


    public void save(WorkDto work) {
        repository.save(WorkMapper.INSTANCE.mapToEntity(work));
    }


    public void update(WorkDto work) {
        var entity = WorkMapper.INSTANCE.mapToEntity(work);
        if (work.getCompany() != null)
            entity.setCompany(work.getCompany());
        if (work.getPosition() != null)
            entity.setPosition(work.getPosition());
        if (work.getSalary() > 0)
            entity.setSalary(work.getSalary());
        repository.save(entity);
    }
}
