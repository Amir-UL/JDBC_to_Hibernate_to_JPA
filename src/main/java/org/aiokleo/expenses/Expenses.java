package org.aiokleo.expenses;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Component
public class Expenses {
    @SequenceGenerator(
            name = "expenses_sequence",
            sequenceName = "expenses_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "expenses_sequence"
    )
   @Id
    private Long id;
    private String expense_des;
    private String expense_type;
    private int amount;
    private String created_at;

    public Expenses(String expense_des,
                    String expense_type,
                    int amount) {
        this.expense_des = expense_des;
        this.expense_type = expense_type;
        this.amount = amount;
    }
}
