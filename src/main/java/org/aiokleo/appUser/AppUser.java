package org.aiokleo.appUser;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppUser { // Also called POJO/BEAN
    @Id
    private int id;
    private String name;
    private String email;
    private String date_of_birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public AppUser(int id,
                   String name,
                   String email,
                   String date_of_birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }

    public AppUser() {
    }
}
