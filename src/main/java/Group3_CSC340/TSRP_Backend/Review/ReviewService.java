package Group3_CSC340.TSRP_Backend.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(int review_id) {
        return reviewRepository.findById(review_id).orElse(null);
    }

    public void addNewReview(Review review) {
        reviewRepository.save(review);

    }

    public void deleteReviewById(int review_id) {
        reviewRepository.deleteById(review_id);
    }
}
