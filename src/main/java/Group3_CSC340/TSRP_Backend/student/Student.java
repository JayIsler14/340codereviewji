package Group3_CSC340.TSRP_Backend.student;

import jakarta.persistence.*;


@Entity
@Table(name ="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int s_id;



    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String major;

    private String profileDescription;


    private int graduationYear;



    public Student() {

    }

    public Student(int s_id, String firstName, String lastName, String email, String password, String profileDescription, String major, int graduationYear) {
        this.s_id = s_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profileDescription = profileDescription;
        this.major = major;
        this.graduationYear = graduationYear;

    }

    public Student(String firstName, String lastName, String email, String password, String profileDescription, String major, int graduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profileDescription = profileDescription;
        this.major = major;
        this.graduationYear = graduationYear;

    }



    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
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

    public String getProfileDescription() {
        return profileDescription;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }



    @Override
    public String toString() {
        return "Student{" +
                "s_Id=" + s_id +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profileDescription='" + profileDescription + '\'' +
                ", major='" + major + '\'' +
                ", password='" + password + '\'' +
                ", graduationYear='" + graduationYear + '\'' +
                '}';
    }
}

