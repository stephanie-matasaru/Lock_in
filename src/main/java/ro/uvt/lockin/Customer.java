package ro.uvt.lockin;

public class Customer {
    private String username;
    private String name;
    private String phoneNumber;
    private String email;

    public Customer() {}

    public Customer(String username, String name, String phoneNumber, String email) {
        this.username = username;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validate() {
        if (username == null || username.isBlank()) return false;
        if (name == null || name.isBlank()) return false;
        if (phoneNumber == null || phoneNumber.length() < 6) return false;
        if (email == null || !email.contains("@")) return false;
        return true;
    }

}
