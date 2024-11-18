package Group3_CSC340.TSRP_Backend.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService service;

    @GetMapping("/all")
    public List<Class> getAllClasses() {
        return service.getAllClasses();
    }

    @GetMapping("/{class_id}")
    public Class getClassViaId(@PathVariable int class_id) {
        return service.getClassById(class_id);
    }

    @PostMapping("/new")
    public List<Class> addNewClass(@RequestBody Class classes) {
        service.addNewClass(classes);
        return service.getAllClasses();
    }

    @PutMapping("/update/{class_id}")
    public Class updateClass(@PathVariable int class_id, @RequestBody Class classes) {
        service.updateClass(class_id, classes);
        return service.getClassById(class_id);
    }

    @DeleteMapping("/delete/{class_id}")
    public List<Class> deleteClassById(@PathVariable int class_id) {
        service.deleteClassById(class_id);
        return service.getAllClasses();
    }
}
