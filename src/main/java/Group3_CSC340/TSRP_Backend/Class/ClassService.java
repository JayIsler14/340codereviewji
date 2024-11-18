package Group3_CSC340.TSRP_Backend.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class getClassById(int class_id) {
        return classRepository.findById(class_id).orElse(null);
    }

    public void addNewClass( Class classes) {
        classRepository.save(classes);
    }

    public void updateClass(int class_id, Class classes) {
        Class exists = getClassById(class_id);
        exists.setName(classes.getName());
        exists.setDescription(classes.getDescription());
        exists.setLocation(classes.getLocation());

        classRepository.save(exists);
    }

    public void deleteClassById(int animalId) {
        classRepository.deleteById(animalId);
    }
}
