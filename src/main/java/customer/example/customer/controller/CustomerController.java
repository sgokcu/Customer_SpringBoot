package customer.example.customer.controller;
import customer.example.customer.entity.Customer;
import customer.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> get_all_customers(){
        return customerRepository.findAll();
    }
    @PostMapping
    public Customer create_customer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
