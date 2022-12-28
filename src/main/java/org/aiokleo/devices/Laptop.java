package org.aiokleo.devices;

import lombok.*;

//import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
//@Entity
@AllArgsConstructor
//@SequenceGenerator(
//        name = "laptop_sq",
//        sequenceName = "laptop_sq",
//        allocationSize = 1
//)
public class Laptop {
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "laptop_sq"
//    )
    private Long id;
    private String laptopName;

    public Laptop(String laptopName) {
        this.laptopName = laptopName;
    }
}
