package com.example.SpringbootAPI1.repository;

import com.example.SpringbootAPI1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

// jpaRepository<Entity type,primarykey type> you can find in model class.
    // we don't need add @Repository above. Because we have already annotated in JpaRepository class.
    // which extends EmployeeRepository.

  List<Employee> findBylastname(String lastname); // these created by user with protocol.
  // proptcol is findByPropertyname(); // it creates query automatically.

  @Query("from Employee where id>0")// jpql query.
    // like above here spring can't create query automatically. but we can declare query iscalled jpql.
    // where we created query for findByGreaterthan()method().see in EmployeeRepository interface.
  List<Employee> findByGreaterthan(Long id);
}
