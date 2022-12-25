package org.aiokleo.devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.aiokleo.appUser.AppUser;

@Entity
@Setter
@NoArgsConstructor
@Getter
@ToString
public class Phones {
    @Id
    private int Pid;
    private String phoneName;
    @ManyToOne
    private AppUser appUser;

    public Phones(int pid, String phoneName) {
        Pid = pid;
        this.phoneName = phoneName;
    }
}
