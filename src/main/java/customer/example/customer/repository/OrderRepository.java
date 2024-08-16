package customer.example.customer.repository;
import customer.example.customer.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
