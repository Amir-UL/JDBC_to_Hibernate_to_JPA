package org.aiokleo.appUser;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "admins")
@Table(name = "admins")
public class Admins {
    @Id
    private Long id;
    private String name;
    private String roll;

    public Admins(String name,
                  String roll) {
        this.name = name;
        this.roll = roll;
    }
}
