package Group3_CSC340.TSRP_Backend.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService service;

    @GetMapping("/all")
    public List<Review> getAllReviews() {
        return service.getAllReviews();
    }

    @PostMapping("/new")
    public List<Review> addNewReview(@RequestBody Review review) {
        service.addNewReview(review);
        return service.getAllReviews();
    }

    @DeleteMapping("delete/{review_id}")
    public List<Review> deleteReviewById(@PathVariable int review_id) {
        service.deleteReviewById(review_id);
        return service.getAllReviews();
    }
}
