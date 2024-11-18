package Group3_CSC340.TSRP_Backend.Posts;


import Group3_CSC340.TSRP_Backend.student.Student;
import Group3_CSC340.TSRP_Backend.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;

    public List<Posts> getAllPosts() {
        return postsRepository.findAll();
    }

    public Posts getPostById(int postId) {
        return postsRepository.findById(postId).orElse(null);
    }

    public void savePost(Posts post) {postsRepository.save(post);}

    public void deletePostById(int postId) {
        postsRepository.deleteById(postId);
    }
}
