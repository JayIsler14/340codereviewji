package Group3_CSC340.TSRP_Backend.teacher;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(int t_id){
        return teacherRepository.findById(t_id).orElse(null);
    }

    public void addNewTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
    public void updateTeacherById(int t_id, Teacher teacher){
        Teacher subject = getTeacherById(t_id);
        subject.setFirstName(teacher.getFirstName());
        subject.setLastName(teacher.getLastName());
        subject.setEmail(teacher.getEmail());
        subject.setPassword(teacher.getPassword());
        subject.setProfileDescription(teacher.getProfileDescription());

        teacherRepository.save(subject);
    }

    public void deleteTeacherById(int t_id){
        teacherRepository.deleteById(t_id);
    }
}
