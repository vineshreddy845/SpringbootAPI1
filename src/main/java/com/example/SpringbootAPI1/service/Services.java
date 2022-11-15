package com.example.SpringbootAPI1.service;

import com.example.SpringbootAPI1.model.Employee;
import com.example.SpringbootAPI1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class Services {

    @Autowired
   private EmployeeRepository employeeRepository;
    //create -save
    public Employee empl1(Employee emp) {
        return employeeRepository.save(emp);
    }

    // Read
    public List<Employee> empl(Employee emp1) {
        return employeeRepository.findAll();
    }

    //update
    public Employee ep2(Long id, Employee employee) {
        Employee em= employeeRepository.findById(id).get();
        em.setFirstname(employee.getFirstname());
        em.setLastname(employee.getLastname());
        em.setEmail(employee.getEmail());
        return employeeRepository.save(em);
    }


    public List<Employee> emp4( Employee emp) {
       return employeeRepository.findAllById(Collections.singleton(emp.getId()));
    }

    // here findBylastname()method is declared in EmployeeRepository interface. which automatically create query for us.
    // we should follow protocal where List<Entity> findBpropertyname(which is dcleared in Employee class).

    public List<Employee> emp7(Employee emp8) {
        return employeeRepository.findBylastname(emp8.getLastname());

    }

    // like above here spring can't create query automatically. but we can declare query iscalled jpql.
    // where we created query for findByGreaterthan()method().see in EmployeeRepository interface.
    public List<Employee> empll(Employee emp9) {
        return employeeRepository.findByGreaterthan(emp9.getId());
    }

    public void del() {
         employeeRepository.deleteAll();
    }
}
