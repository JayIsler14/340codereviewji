package Group3_CSC340.TSRP_Backend.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping("/all")
    public List<Teacher> getAllTeachers() {

        return service.getAllTeachers();
    }

    @GetMapping("/{t_id}")
    public Teacher getATeacher(@PathVariable int t_id){

        return service.getTeacherById(t_id);
    }

    @PostMapping("/new")
    public List<Teacher> addTeacher(Teacher teacher){
        service.addNewTeacher(teacher);
        return service.getAllTeachers();
    }

    @PutMapping("/update/{t_id}")
    public Teacher updateTeacher(@PathVariable int t_id, @RequestBody Teacher teacher){

        service.updateTeacherById(t_id, teacher);
        return service.getTeacherById(t_id);
    }

    @DeleteMapping("/delete/{t_id}")
    public void deleteTeacher(@PathVariable int t_id){

        service.deleteTeacherById(t_id);
    }

}
