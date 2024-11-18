package Group3_CSC340.TSRP_Backend.admin;

import jakarta.persistence.*;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int r_Id;

    @Column(nullable = false)
    private String sender;

    @Column(nullable = false)
    private String r_Status;

    private String description;

    public Request(int r_Id, String sender, String r_Status, String description) {
        this.r_Id = r_Id;
        this.sender = sender;
        this.r_Status = r_Status;
        this.description = description;
    }

    public Request(String sender, String r_Status, String description) {
        this.sender = sender;
        this.r_Status = r_Status;
        this.description = description;
    }

    public Request() {
    }

    public int getR_Id() {
        return r_Id;
    }

    public void setR_Id(int r_Id) {
        this.r_Id = r_Id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getR_Status() {
        return r_Status;
    }

    public void setR_Status(String r_Status) {
        this.r_Status = r_Status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
