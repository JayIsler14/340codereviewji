package Group3_CSC340.TSRP_Backend.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<User> getAllUsers() {
        return adminRepository.findAll();
    }

    public User getUserById(int userId) {
        return adminRepository.findById(userId).orElse(null);
    }

    public void addNewUser(User user) {
        adminRepository.save(user);
    }

    public void updateUser(int userId, User user) {
        User existing = getUserById(userId);
        existing.setFirstName(user.getFirstName());
        existing.setLastName(user.getLastName());
        existing.setUserType(user.getUserType());
        existing.setAccountStatus(user.getAccountStatus());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());
        existing.setDescription(user.getDescription());

        adminRepository.save(existing);
    }

    public void deleteUserById(int userId) {
        adminRepository.deleteById(userId);
    }
}
