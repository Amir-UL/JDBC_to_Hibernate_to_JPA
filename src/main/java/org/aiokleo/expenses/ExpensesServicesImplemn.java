package org.aiokleo.expenses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesServicesImplemn implements ExpensesServices {

    @Autowired
    ExpensesRepository expensesRepository;
    @Override
    public List<Expenses> findAll() {
        return expensesRepository.findAll();
    }
}
