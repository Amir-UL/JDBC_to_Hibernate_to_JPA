package org.aiokleo.appUser;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AllNames {
    private String firstName;
    private String MiddleName;
    private String LastName;
}
