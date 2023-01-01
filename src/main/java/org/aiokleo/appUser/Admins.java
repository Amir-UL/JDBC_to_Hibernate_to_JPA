package org.aiokleo.appUser;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
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
