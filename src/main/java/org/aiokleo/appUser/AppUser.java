package org.aiokleo.appUser;

import lombok.*;
import org.aiokleo.devices.Device;
import org.aiokleo.devices.Laptop;
import org.aiokleo.devices.Phones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component // By Adding this Annotation
// I am telling Spring, this is a Class I want Object of.
//@Scope(value = "prototype") // By Default the Constructor AccountDetails() is Singleton
// If I want to be all method and Constructors to Prototype
// I have to Specify with this Annotation.
// Now I can call theAccountDetails() as many as I want

@ComponentScan(basePackages = {"org.aiokloe"})
//Entity is object-oriented and Table is relation-oriented.
//You can only use the Entity name="appUser" in the HQL (Hibernate Query Language) to query objects,
//And the Table name="" in the native SQL.

// In Other words:  Writing Queries you have to use the name given in @Entity and the name given in
// @Table will be used to name the table in the DB.

// If the 2 name is similar that will allow you to access your table with the same name as the entity while writing HQL or JPQL.

public class AppUser { // Also called POJO/BEAN
//    @Id
//    @SequenceGenerator(
//            name = "app_usr_sq",
//            sequenceName = "app_usr_sq",
//            allocationSize = 1)
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "app_usr_sq"
//    )
//    @Column(name = "id", nullable = false)
    private Long id;
//    @Transient // This annotation will not store the name in the DB.
//    @Embedded

//    @Autowired // AKA the Dependency Injection.
//    private AllNames name;
//    @Column(nullable = false)
    private String email;
    private LocalDate date_of_birth;

//    @OneToMany()
    private List<Device> device = new ArrayList<>();

//    @OneToMany()
    private List<Phones> phones = new ArrayList<>();
//    @OneToMany()
    private List<Laptop> laptop = new ArrayList<>();

    public AppUser(
//            AllNames name,
                   String email,
                   String date_of_birth,
                   Device device,
                   Phones phones,
                   Laptop laptop) {
//        this.name = name;
        this.email = email;
        this.date_of_birth = LocalDate.parse(date_of_birth);
        this.device = Collections.singletonList(device);
        this.phones = Collections.singletonList(phones);
        this.laptop = Collections.singletonList(laptop);
    }
}
