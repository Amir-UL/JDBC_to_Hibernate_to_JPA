package org.aiokleo.appUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.lang.*;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Admins, Long> {
//    Creating Custom methods for Fetching Data
    // We NEED to flow some Protocols
    // 1. Method Name Have to start With findBy___
    // 2. METHOD can be created, if the METHOD has a SAME attribute in DB. (If I want to create a method of findByEmail(String email);
                                                                            // DB have to have a Column named Email
    List<Admins> findByName(String name);
    List<Admins> findByIdGreaterThan(Long id);

//    custom Methods with Query SQL->HQL->JQL
    @Query("FROM admins WHERE roll =?1 ORDER BY name") // The value wil come from END user to {?1}
    List<Admins> findByRoll(String roll);
}
