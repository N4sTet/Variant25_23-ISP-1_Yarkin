package Lab_10.AbstractShipment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Shipment {
    protected String id;
    protected String name;
    protected String status;
    protected static int totalShipments = 0;
    public static final DateTimeFormatter formdate = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Shipment(String id, String name) {
        this.id = id;
        this.name = name;
        this.status = "Создано";
        totalShipments++;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Отгрузка " + id + ": статус обновлён -> " + status);
    }

    public abstract LocalDate getShipmentDate();
    public abstract void processShipment();

    public static int getTotalShipments() {
        return totalShipments;
    }

    public static String generateId(String prefix) {
        return prefix + "-" + (totalShipments + 1000);
    }


    @Override
    public String toString() {
        return "Отгрузка{id='" + id + "', name='" + name + "', status='" + status + "'}";
    }
}
