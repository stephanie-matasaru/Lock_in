package ro.uvt.lockin;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAll();
    Customer getByUsername(String username) throws CustomerNotFoundException;
    void save(Customer customer);
    void delete(String username);
}
