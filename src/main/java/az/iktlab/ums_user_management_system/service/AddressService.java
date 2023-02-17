package az.iktlab.ums_user_management_system.service;

import az.iktlab.ums_user_management_system.mapper.AddressMapper;
import az.iktlab.ums_user_management_system.model.AddressDto;
import az.iktlab.ums_user_management_system.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    public List<AddressDto> getAll() {
        return AddressMapper.INSTANCE.mapToDtos(repository.findAll());
    }


    public AddressDto findById(Long id) {
        var entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("ADDRESS_NOT_FOUND"));
        return AddressMapper.INSTANCE.mapToDto(entity);
    }


    public void save(AddressDto address) {
        repository.save(AddressMapper.INSTANCE.mapToEntity(address));
    }

    public void update(AddressDto address) {
        var entity = repository.findById(address.getId()).orElseThrow(()->new RuntimeException("ADDRESS_NOT_FOUND"));
        if(address.getCity() != null)
            entity.setCity(address.getCity());
        if(address.getRegion() != null)
            entity.setRegion(address.getRegion());
        if (address.getZipCode() != null)
            entity.setZipCode(address.getZipCode());
//        entity = AddressMapper.INSTANCE.mapToEntity(address);
        repository.save(entity);
    }
}
