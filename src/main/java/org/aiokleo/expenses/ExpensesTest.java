package org.aiokleo.expenses;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ExpensesTest {
    @Bean
    CommandLineRunner commandLineRunner(ExpensesRepository expensesRepository){
        return args -> {
            Expenses e1 = new Expenses(
                    "Food",
                    "Food for the month",
                    10000,
                    "2000-01-01"
            );
            Expenses e2 = new Expenses(
                    "Rent",
                    "Rent for the month",
                    100000,
                    "2000-01-01"
            );
            Expenses e3 = new Expenses(
                    "Electricity",
                    "Electricity for the month",
                    100000,
                    "2000-01-01"
            );
            Expenses e4 = new Expenses(
                    "Water",
                    "Water for the month",
                    1000,
                    "2000-01-01"
            );
            expensesRepository.saveAll(
                    List.of(e1, e2, e3, e4)
            );
        };
    }
}
