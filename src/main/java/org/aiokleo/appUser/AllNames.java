package org.aiokleo.appUser;

import lombok.*;
import org.springframework.stereotype.Component;

//import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
//@Embeddable
public class AllNames {
    private String firstName;
    private String MiddleName;
    private String LastName;
    public void show(){
        System.out.println("Showing!");
    }
}
