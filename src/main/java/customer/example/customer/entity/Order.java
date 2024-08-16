package customer.example.customer.entity;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "Orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @Temporal(TemporalType.DATE)
    private Date date;
    private double total_amount;

    public void setId(int order_id) {
        this.order_id = order_id;
    }
    public int getId() {
        return order_id;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
    public double getTotal_amount() {
        return total_amount;
    }
}
