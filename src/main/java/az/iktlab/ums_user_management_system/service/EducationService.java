package az.iktlab.ums_user_management_system.service;

import az.iktlab.ums_user_management_system.mapper.EducationMapper;
import az.iktlab.ums_user_management_system.model.EducationDto;
import az.iktlab.ums_user_management_system.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    private final EducationRepository repository;

    public EducationService(EducationRepository repository) {
        this.repository = repository;
    }

    public List<EducationDto> getAll() {
        return EducationMapper.INSTANCE.mapToDtos(repository.findAll());
    }


    public EducationDto findById(Long id) {

       var entity =  repository.findById(id).orElseThrow(()->new RuntimeException("SUCH_EDUCATION_NOT_EXIST"));
        return EducationMapper.INSTANCE.mapToDto(entity);
    }


    public void save(EducationDto education) {
        repository.save(EducationMapper.INSTANCE.mapToEntity(education));
    }


    public void update(EducationDto education) {
        var entity = repository.findById(education.getId())
                        .orElseThrow(()-> new RuntimeException("SUCH_EDUCATION_NOT_EXIST"));
        if(education.getEducation() != null)
            entity.setEducation(education.getEducation());
        if (education.getEducationPlace() != null)
            entity.setEducationPlace(education.getEducationPlace());
        if (education.getProfession() != null)
            entity.setProfession(entity.getProfession());
        repository.save(entity);
    }
}
