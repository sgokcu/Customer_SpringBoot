package customer.example.customer.controller;
import customer.example.customer.entity.Product;
import customer.example.customer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> get_all_products(){
        return productRepository.findAll();
    }
    @PostMapping
    public Product create_product(@RequestBody Product product){
        return productRepository.save(product);
    }
}