package Group3_CSC340.TSRP_Backend.teacher;

import jakarta.persistence.*;

@Entity
@Table(name="teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int t_id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String profileDescription;

    public Teacher(int t_id, String firstName, String lastName, String email, String password, String profileDescription){
        this.t_id = t_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profileDescription = profileDescription;
    }

    public Teacher(String firstName, String lastName, String email, String password, String profileDescription){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profileDescription = profileDescription;
    }

    public Teacher(){

    }

    public int getTeacherId(){
        return t_id;
    }

    public void setTeacherId(int t_id){
        this.t_id = t_id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getProfileDescription(){
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription){
        this.profileDescription = profileDescription;
    }
}
