package az.iktlab.ums_user_management_system.mapper;

import az.iktlab.ums_user_management_system.entity.AddressEntity;
import az.iktlab.ums_user_management_system.entity.UserEntity;
import az.iktlab.ums_user_management_system.model.AddressDto;
import az.iktlab.ums_user_management_system.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class AddressMapper {
    public static final AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    public abstract AddressEntity mapToEntity(AddressDto address);
    public abstract List<AddressDto> mapToDtos(List<AddressEntity> addresses);
    public abstract AddressDto mapToDto(AddressEntity address);
}
