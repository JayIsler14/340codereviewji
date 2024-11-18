package Group3_CSC340.TSRP_Backend.Posts;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private PostsService PostsService;

    @GetMapping("/all")
    public String getAllPosts(Model model) {
        model.addAttribute("postList", PostsService.getAllPosts());
        return "student";
    }

    @GetMapping("/{postId}")
    public String getOnePost(@PathVariable int postId, Model model) {
        model.addAttribute("post", PostsService.getPostById(postId));
        return "student";
    }

    @GetMapping("/createForm")
    public String showCreateForm(){
        return "student";
    }

    @PostMapping("/new")
    public String addNewPost(Posts post) {
        PostsService.savePost(post);
        return "redirect:/posts/all";
    }

    @GetMapping("/delete/{postId}")
    public String deletePostById(@PathVariable int postId) {
        PostsService.deletePostById(postId);
        return "redirect:/posts/all";
    }

}
