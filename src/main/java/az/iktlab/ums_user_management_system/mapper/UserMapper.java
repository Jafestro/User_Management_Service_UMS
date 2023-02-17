package az.iktlab.ums_user_management_system.mapper;

import az.iktlab.ums_user_management_system.entity.UserEntity;
import az.iktlab.ums_user_management_system.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class UserMapper {
        public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

        public abstract UserEntity mapToEntity(UserDto user);
        public abstract List<UserDto> mapToDtos(List<UserEntity> users);
        public abstract UserDto mapToDto(UserEntity user);

}
