package ro.uvt.lockin;

import java.util.List;

public class Locker {
    private int id;
    private String location;
    private List<Compartment> compartments;

    public Locker() {}

    public Locker(int id, String location, List<Compartment> compartments) {
        this.id = id;
        this.location = location;
        this.compartments = compartments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Compartment> getCompartments() {
        return compartments;
    }

    public void setCompartments(List<Compartment> compartments) {
        this.compartments = compartments;
    }
}
