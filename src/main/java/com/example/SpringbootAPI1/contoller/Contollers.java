package com.example.SpringbootAPI1.contoller;

import com.example.SpringbootAPI1.model.Employee;
import com.example.SpringbootAPI1.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
//@RequestMapping annotation on the class defines a base URL for all the REST APIs created in this controller.
// This base URL is followed by individual REST endpoints given to each of the controller methods.
public class Contollers {

    @Autowired
    private Services services1;
   //create
  //http://localhost:8080/api/employee
  //@RequestMapping(value="/emp",method= RequestMethod.POST)
    @PostMapping("/employee")//endpoint// In these id value generated automatically.
    public Employee employee(@RequestBody Employee emp) {
        return services1.empl1(emp);

    }
    //read
    //http://localhost:8080/api/GetDetails
    @GetMapping("/GetDetails")
    public List<Employee> employee1(Employee emp1)
    {
        return services1.empl(emp1);
    }
   //update
   //http://localhost:8080/api/put/1
    @PutMapping("/put/{idnum}")// we are passing primary key because in table can have multiple  primary keys so that we pass id value to indentify to which value to update .Because primary key will be unique in table.(Long id)
    public Employee employed(@PathVariable(value="idnum") Long id, @RequestBody Employee employee)
    {
        return services1.ep2(id,employee);
    }

    // get data using employee id.
    //http://localhost:8080/api/findbyid
    @GetMapping("/findbyid")
    public List<Employee> emp4( @RequestBody Employee emp)
    {
        return services1.emp4(emp);
    }

    //fetching data using lastname;
    @GetMapping("/findbylastname")
    public List<Employee> emp5(@RequestBody Employee emp8)
    {
        return services1.emp7(emp8);
    }

    @GetMapping("/findbygreaterthan")
    public List<Employee>emp8(@RequestBody Employee emp9)
    {
        return services1.empll(emp9);
    }

    @GetMapping("/delete")
    public void  delete()
    {
         services1.del();
    }
}

