package az.iktlab.ums_user_management_system.controller;

import az.iktlab.ums_user_management_system.model.User;
import az.iktlab.ums_user_management_system.model.UserDto;
import az.iktlab.ums_user_management_system.service.UmsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ums")
public class UmsController {
    private final UmsService service;

    public UmsController(UmsService service) {
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody UserDto user){
        service.save(user);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable("id") Long id){
        service.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        service.deleteAll();
    }

    @GetMapping
    public List<UserDto> getAll(){
        return service.getAll();
    }

    @GetMapping("/id/{id}") //pathvariableda {} hisse ve parameter hissesi adi eynidise  @Pat@PathVariable  ->>("id") bu hisseni yazmaqa ehtiyac yoxdur.
    public UserDto getById(@PathVariable("id") Long id){
        return service.getById(id);
    }

    @GetMapping("/fin/{fin}")
    public UserDto getByFin(@PathVariable("fin") String fin){
        return service.getByFin(fin);
    }

}
