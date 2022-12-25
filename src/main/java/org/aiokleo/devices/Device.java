package org.aiokleo.devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.aiokleo.appUser.AppUser;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Device {
    @Id
    private int id;
    private boolean hasElectronicDevice;
    private boolean hasPhone;
    private boolean hasLaptop;
    @ManyToOne
    private AppUser appUser;

    public Device(int id,
                  boolean hasElectronicDevice,
                  boolean hasPhone,
                  boolean hasLaptop) {
        this.id = id;
        this.hasElectronicDevice = hasElectronicDevice;
        this.hasPhone = hasPhone;
        this.hasLaptop = hasLaptop;
    }
}
