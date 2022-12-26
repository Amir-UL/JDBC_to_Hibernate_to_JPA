package org.aiokleo.devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.aiokleo.appUser.AppUser;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@AllArgsConstructor
public class Device {
    @Id
    private int id;
    private boolean hasElectronicDevice;
    private boolean hasPhone;
    private boolean hasLaptop;
}
