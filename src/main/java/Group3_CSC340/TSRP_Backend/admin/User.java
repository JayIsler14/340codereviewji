package Group3_CSC340.TSRP_Backend.admin;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String userType;

    @Column(nullable = false)
    private String accountStatus;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String description;

    public User(int userId, String firstName, String lastName, String userType, String accountStatus, String email, String password, String description) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.accountStatus = accountStatus;
        this.email = email;
        this.password = password;
        this.description = description;
    }

    public User(String firstName, String lastName, String userType, String accountStatus, String email, String password, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.accountStatus = accountStatus;
        this.email = email;
        this.password = password;
        this.description = description;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
