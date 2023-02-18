package az.iktlab.ums_user_management_system.service;

import az.iktlab.ums_user_management_system.mapper.PersonMapper;
import az.iktlab.ums_user_management_system.model.PersonDto;
import az.iktlab.ums_user_management_system.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
//    private final PersonRepository repository;
//
//    public PersonService(PersonRepository repository) {
//        this.repository = repository;
//    }
//
//    public List<PersonDto> getAll() {
//        return PersonMapper.INSTANCE.mapToDtos(repository.findAll());
//    }
//
//
//    public PersonDto findById( Long id) {
//        var entity = repository.findById(id).orElseThrow(()->new RuntimeException("PERSON_NOT_EXIST"));
//        return PersonMapper.INSTANCE.mapToDto(entity);
//    }
//
//
//    public void save( PersonDto person) {
//       repository.save(PersonMapper.INSTANCE.mapToEntity(person));
//    }
//
//
//    public void update(PersonDto person) {
//        var entity = repository.findById(person.getId()).orElseThrow(()->new RuntimeException("PERSON_NOT_EXIST"));
//
//        /*
//        * Process of checking whether asked value null or not,
//        *  it is performed to prevent accidentally giving null values
//        * from frontend or user
//        * */
//
//        if(person.getName() != null)
//            entity.setName(person.getName());
//        if(person.getSurname() != null)
//            entity.setSurname(person.getSurname());
//        if (person.getFin() != null)
//            entity.setFin(person.getFin());
//        if (person.getGender() != null)
//            entity.setGender(person.getGender());
//        if (person.getNationality() != null)
//            entity.setNationality(person.getNationality());
//        if (person.getBirthDate() != null)
//            entity.setBirthDate(person.getBirthDate());
//        if (person.getMarriageStatus() != null)
//            entity.setMarriageStatus(person.getMarriageStatus());
//        if (person.getPatronymicName() != null)
//            entity.setPatronymicName(person.getPatronymicName());
//
//        repository.save(entity);
//    }
}
