package customer.example.customer.controller;
import customer.example.customer.entity.Order;
import customer.example.customer.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> get_all_orders(){
        return orderRepository.findAll();
    }
    @PostMapping
    public Order create_order(@RequestBody Order order){
        return orderRepository.save(order);
    }
}