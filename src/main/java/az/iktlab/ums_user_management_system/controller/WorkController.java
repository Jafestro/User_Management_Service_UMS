package az.iktlab.ums_user_management_system.controller;

import az.iktlab.ums_user_management_system.model.WorkDto;
import az.iktlab.ums_user_management_system.service.WorkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work")
public class WorkController {
    private final WorkService service;

    public WorkController(WorkService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/id/{id}")
    public WorkDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody WorkDto work) {
        service.save(work);
    }

    @PutMapping
    public void update(@RequestBody WorkDto work) {
        service.update(work);
    }
}
