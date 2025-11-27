package ro.uvt.lockin;

import java.util.List;

public interface CompartmentRepository {
    List<Compartment> getAll();
    Compartment getById(int id);
    void save(Compartment compartment);
    void delete(int id);
}
