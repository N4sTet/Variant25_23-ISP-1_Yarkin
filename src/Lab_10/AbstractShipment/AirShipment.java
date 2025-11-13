package Lab_10.AbstractShipment;

import java.time.LocalDate;

public class AirShipment extends TransportShipment {
    private LocalDate shipmentDate;
    private String flightNumber;
    private String airport;

    public AirShipment(String id, String name, LocalDate shipmentDate, String flightNumber, String airport) {
        super(id, name, "Самолёт");
        this.shipmentDate = shipmentDate;
        this.flightNumber = flightNumber;
        this.airport = airport;
        this.status = "Ожидает рейс";
    }

    @Override
    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    @Override
    public String getDeliveryDetails() {
        return "Рейс " + flightNumber + ", аэропорт: " + airport + ", вылет: " + shipmentDate.format(formdate);
    }

    public void checkInCargo() {
        System.out.println("Груз зарегистрирован на рейс " + flightNumber);
        updateStatus("Зарегистрирован");
    }
}
