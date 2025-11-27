package ro.uvt.lockin;

public class Model {

    private final static CustomerRepositoryFile customerRepositoryFile = new CustomerRepositoryFile();

    public static CustomerRepository getCustomerRepository() {
        return customerRepositoryFile;
    }
}
