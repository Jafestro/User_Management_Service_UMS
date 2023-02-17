package az.iktlab.ums_user_management_system.mapper;

import az.iktlab.ums_user_management_system.entity.PersonEntity;
import az.iktlab.ums_user_management_system.model.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class PersonMapper {
    public static final PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    public abstract PersonEntity mapToEntity(PersonDto person);
    public abstract List<PersonDto> mapToDtos(List<PersonEntity> people);
    public abstract PersonDto mapToDto(PersonEntity person);
}
