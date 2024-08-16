package customer.example.customer.repository;
import customer.example.customer.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
