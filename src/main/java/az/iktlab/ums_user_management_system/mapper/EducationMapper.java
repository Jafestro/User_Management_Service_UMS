package az.iktlab.ums_user_management_system.mapper;

import az.iktlab.ums_user_management_system.entity.EducationEntity;
import az.iktlab.ums_user_management_system.entity.UserEntity;
import az.iktlab.ums_user_management_system.model.EducationDto;
import az.iktlab.ums_user_management_system.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class EducationMapper {
    public static final EducationMapper INSTANCE = Mappers.getMapper(EducationMapper.class);

    public abstract EducationEntity mapToEntity(EducationDto education);
    public abstract List<EducationDto> mapToDtos(List<EducationEntity> educations);
    public abstract EducationDto mapToDto(EducationEntity education);
}
