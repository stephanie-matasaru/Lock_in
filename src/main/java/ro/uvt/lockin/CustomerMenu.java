package ro.uvt.lockin;

public class CustomerMenu {
    private String username;

    public void run(String username) {
        try {
            Customer customer = Model.getCustomerRepository().getByUsername(username);
        } catch (CustomerNotFoundException e) {
            System.err.println("Customer " + username + " not found");
            System.exit(1);
        }
        System.out.println("here comes customer menu");
    }
}
