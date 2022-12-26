package org.aiokleo.devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.aiokleo.appUser.AppUser;

@Entity
@Setter
@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
public class Phones {
    @Id
    private int id;
    private String phoneName;

}
