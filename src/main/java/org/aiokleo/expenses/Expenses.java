package org.aiokleo.expenses;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Expenses {
    @SequenceGenerator(
            name = "expenses_sequence",
            sequenceName = "expenses_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "expenses_sequence"
    )
   @Id
    private Long id;
    private String expense_name;
    private String expense_type;
    private int amount;
    private LocalDate created_at;



    public Expenses(String expense_name,
                    String expense_type,
                    int amount,
                    String created_at) {
        this.expense_name = expense_name;
        this.expense_type = expense_type;
        this.amount = amount;
        this.created_at = LocalDate.parse(created_at);
    }
}
