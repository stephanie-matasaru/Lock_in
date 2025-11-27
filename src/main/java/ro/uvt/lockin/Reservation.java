package ro.uvt.lockin;

import java.time.LocalDateTime;

public class Reservation {
    private int id;
    private int customerId;
    private int compartmentId;
    private int lockerId;
    private String size;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;

    public Reservation() {}

    public Reservation(int id, int customerId, int compartmentId, int lockerId,
                       String size, LocalDateTime startTime,
                       LocalDateTime endTime, String status) {
        this.id = id;
        this.customerId = customerId;
        this.compartmentId = compartmentId;
        this.lockerId = lockerId;
        this.size = size;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCompartmentId() {
        return compartmentId;
    }

    public void setCompartmentId(int compartmentId) {
        this.compartmentId = compartmentId;
    }

    public int getLockerId() {
        return lockerId;
    }

    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
