package customer.example.customer.repository;
import customer.example.customer.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
