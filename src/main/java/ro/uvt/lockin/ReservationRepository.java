package ro.uvt.lockin;

import java.util.List;

public interface ReservationRepository {
    List<Reservation> getAll();
    Reservation getById(int id);
    void save(Reservation reservation);
    void delete(int id);
}
