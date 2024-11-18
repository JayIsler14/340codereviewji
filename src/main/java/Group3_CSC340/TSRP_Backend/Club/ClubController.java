package Group3_CSC340.TSRP_Backend.Club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
public class ClubController {

    @Autowired
    private ClubService service;

    @GetMapping("/all")
    public List<Club> getAllClubs() {
        return service.getAllClubs();
    }

    @GetMapping("/{club_id}")
    public Club getClubViaId(@PathVariable int club_id) {
        return service.getClubById(club_id);
    }

    @PostMapping("/new")
    public List<Club> addNewClub(@RequestBody Club club) {
        service.addNewClub(club);
        return service.getAllClubs();
    }

    @PutMapping("/update/{club_id}")
    public List<Club> updateClub(@PathVariable int club_id, @RequestBody Club club) {
        service.updateClub(club_id, club);
        return service.getAllClubs();
    }

    @DeleteMapping("/delete/{club_id}")
    public List<Club> deleteClubById(@PathVariable int club_id) {
        service.deleteClubById(club_id);
        return service.getAllClubs();
    }
}
