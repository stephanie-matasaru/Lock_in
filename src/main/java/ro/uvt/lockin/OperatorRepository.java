package ro.uvt.lockin;

import java.util.List;

public interface OperatorRepository {
    List<Operator> getAll();
    Operator getById(int id);
    void save(Operator operator);
    void delete(int id);
}
