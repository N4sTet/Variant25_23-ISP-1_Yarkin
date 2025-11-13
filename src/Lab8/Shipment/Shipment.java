package Lab8.Shipment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Shipment {
    private LocalDate shipmentDate;
    private String transport;
    private String deliveryStatus;

    public Shipment(String transport, String deliveryStatus) {
        setShipmentDate(LocalDate.now());
        setTransport(transport);
        setDeliveryStatus(deliveryStatus);
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDate shipmentDate) {
        if (shipmentDate == null) {
            throw new IllegalArgumentException("Дата отгрузки не может отсутствовать");
        }
        this.shipmentDate = shipmentDate;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        if (transport == null || transport.trim().isEmpty()) {
            throw new IllegalArgumentException("Тип доставки не может отсутствовать");
        }
        this.transport = transport.trim();
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        if (deliveryStatus == null || deliveryStatus.trim().isEmpty()) {
            throw new IllegalArgumentException("Статус доставки не может отсутствовать");
        }
        this.deliveryStatus = deliveryStatus.trim();
    }

    public void updateStatus(String newStatus) {
        setDeliveryStatus(newStatus);
        System.out.println("Статус отгрузки обновлен: " + newStatus);
    }

    public String getShipmentInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Дата: " + shipmentDate.format(formatter) +
                ", Тип доставки: " + transport +
                ", Статус: " + deliveryStatus;
    }
}
