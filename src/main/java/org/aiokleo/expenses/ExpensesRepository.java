package org.aiokleo.expenses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.*;

public interface ExpensesRepository extends JpaRepository<Expenses, Long> {
//    Creating Custom methods for Fetching Data
    // We NEED to flow some Protocols
    // 1. Method Name Have to start With findBy___
    // 2. METHOD can be created, if the METHOD has a SAME attribute in DB. (If I want to create a method of findByEmail(String email);
                                                                            // DB have to have a Column named Email
//    List<Admins> findByName(String name);
//    List<Admins> findByIdGreaterThan(Long id);

//    custom Methods with Query SQL->HQL->JQL
//    @Query("FROM admins WHERE roll =?1 ORDER BY name") // The value wil come from END user to {?1}
//    List<Admins> findByRoll(String roll);
}
