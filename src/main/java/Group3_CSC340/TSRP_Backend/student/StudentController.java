package Group3_CSC340.TSRP_Backend.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/index")
    public String home(){
        return "index";

    }


    @GetMapping("/all")
    public String getAllStudents(Model model) {
        model.addAttribute( "studentList",service.getAllStudents());
        return "s_profile";
    }

    @GetMapping("/{s_id}")
    public String getOneStudent(@PathVariable int s_id, Model model) {
       model.addAttribute("student",  service.getStudentById(s_id));
       return "s_profile";
    }

    @GetMapping("/createForm")
    public String showCreateForm() {return "s_signup";}

    @PostMapping("/new")
    public String addNewStudent(Student student) {
        service.saveStudent(student);
        return "redirect:/students/all";
    }

    @GetMapping("/update/{s_id}")
    public String showUpdateForm(@PathVariable int s_id, Model model) {
        model.addAttribute("student", service.getStudentById(s_id));
        return "s_profile-update";
    }

    @PostMapping("/update")
    public String updateStudent(Student student) {
        service.saveStudent(student);
        return "redirect:/students/" + student.getS_id();
    }

    @GetMapping("/delete/{s_id}")
    public String deleteStudentById(@PathVariable int s_id) {
        service.deleteStudentById(s_id);
        return "redirect:/students/all";
    }


}
