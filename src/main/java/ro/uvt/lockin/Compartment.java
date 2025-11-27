package ro.uvt.lockin;

public class Compartment {
    private int id;
    private int lockerId;
    private int position;
    private Integer customerId;
    private Integer reservationId;
    private String size;

    public Compartment() {}

    public Compartment(int id, int lockerId, int position,
                       Integer customerId, Integer reservationId, String size) {
        this.id = id;
        this.lockerId = lockerId;
        this.position = position;
        this.customerId = customerId;
        this.reservationId = reservationId;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLockerId() {
        return lockerId;
    }

    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
