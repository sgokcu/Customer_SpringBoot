package customer.example.customer.controller;
import customer.example.customer.entity.Payment;
import customer.example.customer.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping
    public List<Payment> get_all_payments(){
        return paymentRepository.findAll();
    }
    @PostMapping
    public Payment create_payment(@RequestBody Payment payment){
        return paymentRepository.save(payment);
    }
}