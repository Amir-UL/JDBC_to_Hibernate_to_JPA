package org.aiokleo.appUser;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class AllNames {
    private String firstName;
    private String MiddleName;
    private String LastName;
}
