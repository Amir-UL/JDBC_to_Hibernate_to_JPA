package org.aiokleo.devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.aiokleo.appUser.AppUser;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Laptop {
    @Id
    private int id;
    private String laptopName;

}
