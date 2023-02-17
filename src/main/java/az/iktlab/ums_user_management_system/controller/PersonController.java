package az.iktlab.ums_user_management_system.controller;

import az.iktlab.ums_user_management_system.model.PersonDto;
import az.iktlab.ums_user_management_system.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonDto> getAll() {
        return null;
    }

    @GetMapping("/id/{id}")
    public PersonDto findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public void save(@RequestBody PersonDto person) {

    }

    @PutMapping
    public void update(@RequestBody PersonDto person) {
    }
}
