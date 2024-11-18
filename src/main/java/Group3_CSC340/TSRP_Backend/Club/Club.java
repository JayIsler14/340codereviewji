package Group3_CSC340.TSRP_Backend.Club;

import jakarta.persistence.*;

@Entity
@Table(name = "clubs")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int club_id;

    private String description;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    String name;

    public Club(int club_id, String description, String location, String name){
        this.club_id = club_id;

        this.description = description;
        this.location = location;
        this.name = name;
    }

    public Club(String description, String location, String name){
        this.description = description;
        this.location = location;
        this.name = name;
    }

    public Club(){

    }

    public int getClub_id(){
        return club_id;
    }

    public void setClub_id(int club_id){
        this.club_id = club_id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
