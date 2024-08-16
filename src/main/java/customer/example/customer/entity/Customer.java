package customer.example.customer.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customers")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    private String name;
    private String last_name;
    private String email;
    private String p_number;

    public void setId(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getId() {
        return customer_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setP_number(String p_number) {
        this.p_number = p_number;
    }

    public String getP_number() {
        return p_number;
    }
}
