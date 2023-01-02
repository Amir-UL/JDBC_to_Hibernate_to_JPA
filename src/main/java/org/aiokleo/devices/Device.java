package org.aiokleo.devices;

import lombok.*;

//import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
//@Entity
@AllArgsConstructor
//@SequenceGenerator(
//        name = "device_sq",
//        sequenceName = "device_sq",
//        allocationSize = 1
//)
public class Device {
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "device_sq"
//    )
    private Long id;
    private boolean hasElectronicDevice;
    private boolean hasPhone;
    private boolean hasLaptop;

    public Device(boolean hasElectronicDevice, boolean hasPhone, boolean hasLaptop) {
        this.hasElectronicDevice = hasElectronicDevice;
        this.hasPhone = hasPhone;
        this.hasLaptop = hasLaptop;
    }
}
