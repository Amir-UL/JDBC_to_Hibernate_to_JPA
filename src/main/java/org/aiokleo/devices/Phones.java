package org.aiokleo.devices;

import lombok.*;

//import javax.persistence.*;

//@Entity
@Setter
@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
//@SequenceGenerator(
//        name = "phone_sq",
//        sequenceName = "phone_sq",
//        allocationSize = 1
//)
public class Phones {
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "phone_sq"
//
//    )
//    @Column(name = "id", nullable = false)
    private Long id;
    private String phoneName;

    public Phones(String phoneName) {
        this.phoneName = phoneName;
    }
}
