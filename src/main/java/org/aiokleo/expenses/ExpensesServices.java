package org.aiokleo.expenses;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ExpensesServices {
    List<Expenses> findAll();
    void save(Expenses expenses);
    Expenses findById(Long id);

}
