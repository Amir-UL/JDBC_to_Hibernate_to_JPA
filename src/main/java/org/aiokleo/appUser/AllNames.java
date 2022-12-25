package org.aiokleo.appUser;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;

@Embeddable
public class AllNames {
    private String firstName;
    private String MiddleName;
    private String LastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public AllNames() {
    }

    public AllNames(String firstName,
                    String middleName,
                    String lastName) {
        this.firstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "AllNames{" +
                "firstName='" + firstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
