package Group3_CSC340.TSRP_Backend.Club;


import jakarta.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public Club getClubById(int club_id) {
        return clubRepository.findById(club_id).orElse(null);
    }

    public void addNewClub(Club club) {
        clubRepository.save(club);
    }

    public void updateClub(int club_id, Club club) {
        Club exists = getClubById(club_id);
        exists.setName(club.getName());
        exists.setDescription(club.getDescription());
        exists.setLocation(club.getLocation());

        clubRepository.save(exists);
    }

    public void deleteClubById(int club_id) {
        clubRepository.deleteById(club_id);
    }

}
