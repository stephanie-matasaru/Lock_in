package ro.uvt.lockin;

public class Main {
    private static void test(){
        CustomerRepository repo = Model.getCustomerRepository();

        System.out.println("--- TEST 1: GET ALL ---");
        for (Customer c : repo.getAll()) {
            System.out.println(c.getUsername() + " | " + c.getName() + " | " + c.getEmail());
        }
        System.out.println("\n--- TEST 2: GET BY USERNAME =---");

        try {
            Customer c = repo.getByUsername("gabistan");
            System.out.println("Found: " + c.getName());
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- TEST 3: GET BY USERNAME (NOT FOUND) ---");

        try {
            repo.getByUsername("alinadeac");
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- TEST 4: SAVE ---");
        Customer newCustomer = new Customer("anapopescu", "Ana Popescu", "0777123123", "ana.popescu@gmail.com");
        repo.save(newCustomer);
        System.out.println("Saved Ana.");

        System.out.println("\n--- TEST 5: GET ALL AFTER SAVE ---");
        for (Customer c : repo.getAll()) {
            System.out.println(c.getUsername() + " | " + c.getName() + " | " + c.getEmail());
        }

        System.out.println("\n--- TEST 6: DELETE ---");
        repo.delete("ionutpop");

        System.out.println("After deletion:");
        for (Customer c : repo.getAll()) {
            System.out.println(c.getUsername() + " | " + c.getName());
        }
    }

    public static void main(String[] args) {
        switch(args[0]) {
            case "-t":
                test();
                break;
            case "-o":
                new OperatorMenu().run();
                break;
            case "-c":
                if (args.length < 2) {
                    System.out.println("ERROR: Username missing");
                    System.exit(1);
                }
                new CustomerMenu().run(args[1]);
                break;
            default:
                System.out.println("Usage: java ro.uvt.lockin.Main <-c <username>|-o|-t>");
        }
    }
}
