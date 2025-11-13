package Lab_10.AbstractShipment;

import java.time.LocalDate;

public class TruckShipment extends TransportShipment {
    private LocalDate shipmentDate;
    private String driverName;
    private String licensePlate;

    public TruckShipment(String id, String name, LocalDate shipmentDate, String driverName, String licensePlate) {
        super(id, name, "Грузовик");
        this.shipmentDate = shipmentDate;
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.status = "Готов к отправке";
    }

    @Override
    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    @Override
    public String getDeliveryDetails() {
        return "Грузовик, водитель: " + driverName + ", номер: " + licensePlate + ", дата: " + shipmentDate.format(formdate);
    }

    public void loadCargo() {
        System.out.println("Груз загружен в грузовик " + licensePlate);
        updateStatus("Загружен");
    }
}