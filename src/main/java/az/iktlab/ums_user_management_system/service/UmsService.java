package az.iktlab.ums_user_management_system.service;

import az.iktlab.ums_user_management_system.entity.UserEntity;
import az.iktlab.ums_user_management_system.mapper.UserMapper;
import az.iktlab.ums_user_management_system.model.UserDto;
import az.iktlab.ums_user_management_system.repository.PersonRepository;
import az.iktlab.ums_user_management_system.repository.UmsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsService {

    private final UmsRepository repository;
    private final PersonRepository personRepository;

    public UmsService(UmsRepository repository, PersonRepository personRepository) {
        this.repository = repository;
        this.personRepository = personRepository;
    }


    public void save(UserDto user) {
        if (user.getUsername().length() > 10) {
            throw new RuntimeException("USERNAME LENGTH MUST BE LESS THAN 10");
        }
//        if (user.getPerson().getFin().length() != 7)
//            throw new RuntimeException("FIN LENGTH MUST CONSIST OF 7 CHARACTERS");

        UserEntity entity = UserMapper.INSTANCE.mapToEntity(user);
        repository.save(entity);
    }


    public void deleteById(Long id) {
        if (id <= 0)
            throw new RuntimeException("ID CANNOT BE LOWER THAN 0");
        repository.deleteById(id);
    }


    public void deleteAll() {
        repository.deleteAll();
    }


    public List<UserDto> getAll() {
        return UserMapper.INSTANCE.mapToDtos(repository.findAll());
    }

    public UserDto getById(Long id) {
        if (id <= 0)
            throw new RuntimeException("ID CANNOT BE LOWER THAN 0");
        return UserMapper.INSTANCE.mapToDto(repository.getById(id));
    }

    public UserDto getByFin(String fin) {
        if (fin.length() != 7)
            throw new RuntimeException("FIN LENGTH MUST CONSIST OF 7 CHARACTERS");

        var personEntity = personRepository.findByFin(fin)
                .orElseThrow(() -> new RuntimeException("PERSON_NOT_EXIST"));

        return UserMapper.INSTANCE.mapToDto(repository.findByPerson(personEntity)
                .orElseThrow(() -> new RuntimeException("USER_NOT_EXIST")));
    }
}
