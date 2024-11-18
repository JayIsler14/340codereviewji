package Group3_CSC340.TSRP_Backend.Class;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int class_id;

    private int t_id;

    String description;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)

    String name;

    public Class(int class_id, int t_id, String description, String location, String name){
        this.class_id = class_id;
        this.t_id = t_id;
        this.description = description;
        this.location = location;
        this.name = name;
    }

    public Class(String description, String location, String name){
        this.description = description;
        this.location = location;
        this.name = name;
    }

    public Class() {

    }

    public int getClass_id(){
        return class_id;
    }

    public void setClass_id(int class_id){
        this.class_id = class_id;
    }

    public int getT_id(){
        return t_id;
    }

    public void setT_id(int t_id){
        this.t_id = t_id;
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
