package az.iktlab.ums_user_management_system.controller;

import az.iktlab.ums_user_management_system.model.AddressDto;
import az.iktlab.ums_user_management_system.model.PersonDto;
import az.iktlab.ums_user_management_system.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService service;

    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping
    public List<AddressDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/id/{id}")
    public AddressDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody AddressDto address) {
        service.save(address);
    }

    @PutMapping
    public void update(@RequestBody AddressDto address) {
        service.update(address);
    }
}
