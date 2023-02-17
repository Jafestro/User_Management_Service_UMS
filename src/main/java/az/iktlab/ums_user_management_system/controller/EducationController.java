package az.iktlab.ums_user_management_system.controller;

import az.iktlab.ums_user_management_system.model.EducationDto;
import az.iktlab.ums_user_management_system.service.EducationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController {

    private final EducationService service;

    public EducationController(EducationService service) {
        this.service = service;
    }

    @GetMapping
    public List<EducationDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/id/{id}")
    public EducationDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody EducationDto education) {
            service.save(education);
    }

    @PutMapping
    public void update(@RequestBody EducationDto education) {
        service.update(education);
    }
}
