package Group3_CSC340.TSRP_Backend.Posts;

import Group3_CSC340.TSRP_Backend.student.Student;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "posts")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;

    @ManyToOne
    @JoinColumn(name = "s_id")
    private Student student;

    @Column(nullable = false)
    private String postText;



    public Posts(int postId, Student student, String postText) {
        this.postId = postId;
        this.student = student;
        this.postText = postText;
    }

    public Posts(Student student, String postText) {
        this.student = student;
        this.postText = postText;
    }

    public Posts() {

    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}
