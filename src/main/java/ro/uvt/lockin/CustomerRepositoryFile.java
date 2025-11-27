package ro.uvt.lockin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryFile implements CustomerRepository {
    private final String filename;

    public CustomerRepositoryFile() {
        this.filename = "customers.txt";
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String username = parts[0];
                String name = parts[1];
                String phone = parts[2];
                String email = parts[3];

                Customer c = new Customer(username, name, phone, email);
                customers.add(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename);
        } catch (Exception e) {
            System.out.println("Unknown error: " + e.getMessage());
        }

        return customers;
    }

    @Override
    public Customer getByUsername(String username) throws CustomerNotFoundException {
        List<Customer> all = getAll();

        for (Customer c : all) {
            if (c.getUsername().equals(username)) return c;
        }

        throw new CustomerNotFoundException("Customer with username " + username + " not found.");
    }

    @Override
    public void save(Customer customer) {
        try {
            if (!customer.validate()) {
                throw new InvalidCustomerException("Invalid customer data.");
            }

            List<Customer> customers = getAll();
            boolean updated = false;

            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getUsername().equals(customer.getUsername())) {
                    customers.set(i, customer);
                    updated = true;
                    break;
                }
            }

            if (!updated) {
                customers.add(customer);
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
                for (Customer c : customers) {
                    bw.write(c.getUsername() + "," +
                            c.getName() + "," +
                            c.getPhoneNumber() + "," +
                            c.getEmail());
                    bw.newLine();
                }
            }

        } catch (InvalidCustomerException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error rewriting file: " + filename);
        }
    }

    @Override
    public void delete(String username) {
        List<Customer> customers = getAll();
        boolean removed = customers.removeIf(c -> c.getUsername().equals(username));

        if (!removed) {
            System.out.println("Customer " + username + " not found for deletion.");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Customer c : customers) {
                bw.write(c.getUsername() + "," +
                        c.getName() + "," +
                        c.getPhoneNumber() + "," +
                        c.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error rewriting file: " + filename);
        }
    }
}
