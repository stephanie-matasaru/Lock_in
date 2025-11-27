package ro.uvt.lockin;

import java.util.List;

public interface LockerRepository {
    List<Locker> getAll();
    Locker getById(int id);
    void save(Locker locker);
    void delete(int id);
}
