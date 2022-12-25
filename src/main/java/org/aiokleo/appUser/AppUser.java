package org.aiokleo.appUser;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "appUser")
@Table(name = "app_user")

//Entity is object-oriented and Table is relation-oriented.
//You can only use the Entity name="appUser" in the HQL (Hibernate Query Language) to query objects,
//And the Table name="" in the native SQL.

// In Other words:  Writing Queries you have to use the name given in @Entity and the name given in
// @Table will be used to name the table in the DB.

// If the 2 name is similar that will allow you to access your table with the same name as the entity while writing HQL or JPQL.

public class AppUser { // Also called POJO/BEAN
    @Id
    private int id;
//    @Transient // This annotation will not store the name in the DB.
    private AllNames name;
//    @Column(nullable = false)
    private String email;
    private LocalDate date_of_birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AllNames getName() {
        return name;
    }

    public void setName(AllNames name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = LocalDate.parse(date_of_birth);
    }

    public AppUser(int id, AllNames name, String email, String date_of_birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date_of_birth = LocalDate.parse(date_of_birth);
    }

    public AppUser() {
    }
    @Override
    public String toString() {
        return "UserService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date_of_birth=" + date_of_birth +
                '}';
    }

}
