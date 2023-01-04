package org.aiokleo.expenses;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpensesServices {
    List<Expenses> findAll();

}
