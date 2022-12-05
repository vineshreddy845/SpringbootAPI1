package com.example.SpringbootAPI1.contoller;

import com.example.SpringbootAPI1.model.Employee;
import com.example.SpringbootAPI1.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false")// we add these annotation because . backend data is not allowing to display in webpage of angular. the issue is No 'Access-Control-Allow-Origin' cor's.
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
    //http://localhost:8080/api/employee
    @GetMapping("/employee")
    public List<Employee> employee1(Employee emp1)
    {
        return services1.empl(emp1);
    }
   //update
   //http://localhost:8080/api/employee/1
    @PutMapping("/employee/{idnum}")// we are passing primary key because in table can have multiple  primary keys so that we pass id value to indentify to which value to update .Because primary key will be unique in table.(Long id)
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

    //http://localhost:8080/api/findbyids/1

    @GetMapping("/findbyids/{id}")

    public Optional<Employee> emp11(@PathVariable(value="id") Long id)
    {
        return services1.emp11(id);
    }
    //http://localhost:8080/api/findall
    @GetMapping("/findall")

    public List<Employee>emp12(Employee employee)
    {
        return services1.emp12(employee);
    }
    //http://localhost:8080/api/deletebyid
    @DeleteMapping("/deletebyid/{idvalue}")
    public void deletebyid(@PathVariable(value="idvalue") Long id)
    {
          services1.deletebyids(id);
    }

}

