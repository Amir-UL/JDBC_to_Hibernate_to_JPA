package org.aiokleo.devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.aiokleo.appUser.AppUser;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    private int Lid;
    private String laptopName;
    @ManyToOne
    private AppUser appUser;

    public Laptop(int lid, String laptopName) {
        Lid = lid;
        this.laptopName = laptopName;
    }
}
