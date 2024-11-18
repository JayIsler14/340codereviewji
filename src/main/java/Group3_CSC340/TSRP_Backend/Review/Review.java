package Group3_CSC340.TSRP_Backend.Review;

import Group3_CSC340.TSRP_Backend.student.Student;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name ="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int review_id;


    @ManyToOne
    @JoinColumn(name = "s_id")
    private Student student;

    private String  reviewText;

    @Column(nullable = false)
    private Date reviewDate;






    public Review(int r_id, Student student, String reviewText, @Nonnull Date reviewDate) {
        this.review_id = review_id;
        this.student = student;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;

    }

    public Review(Student student, String reviewText, @Nonnull Date reviewDate) {
        this.student = student;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
    }

    public Review() {

    }

    public int getR_id() {
        return review_id;
    }

    public void setR_id(int r_id) {
        this.review_id = review_id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    @Nonnull
    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(@Nonnull Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}