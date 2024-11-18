package Group3_CSC340.TSRP_Backend.Review;

import Group3_CSC340.TSRP_Backend.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>  {
}
