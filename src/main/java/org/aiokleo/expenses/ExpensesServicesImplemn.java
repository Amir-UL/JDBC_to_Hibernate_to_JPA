package org.aiokleo.expenses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ExpensesServicesImplemn implements ExpensesServices {

    @Autowired
    ExpensesRepository expensesRepository;

    @Override
    public List<Expenses> findAll() {
        return expensesRepository.findAll();
    }
    @Override
    public void save(Expenses expenses) {
        expenses.setCreated_at(String.valueOf(System.currentTimeMillis()));
        expensesRepository.save(expenses);
    }
    @Override
    public Expenses findById(Long id) {
        if (expensesRepository.findById(id).isPresent()){
            return expensesRepository.findById(id).get();
        }
        return null;
    }
}
