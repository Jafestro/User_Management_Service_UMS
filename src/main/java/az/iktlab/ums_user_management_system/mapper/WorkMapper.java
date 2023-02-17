package az.iktlab.ums_user_management_system.mapper;

import az.iktlab.ums_user_management_system.entity.UserEntity;
import az.iktlab.ums_user_management_system.entity.WorkEntity;
import az.iktlab.ums_user_management_system.model.UserDto;
import az.iktlab.ums_user_management_system.model.Work;
import az.iktlab.ums_user_management_system.model.WorkDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class WorkMapper {
    public static final WorkMapper INSTANCE = Mappers.getMapper(WorkMapper.class);

    public abstract WorkEntity mapToEntity(WorkDto work);
    public abstract List<WorkDto> mapToDtos(List<WorkEntity> works);
    public abstract WorkDto mapToDto(WorkEntity work);
}
