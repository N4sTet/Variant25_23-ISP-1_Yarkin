package Lab_10.AbstractShipment;

public abstract class TransportShipment extends Shipment {
    protected String transportType;

    public TransportShipment(String id, String name, String transportType) {
        super(id, name);
        this.transportType = transportType;
        this.status = "В обработке";
    }

    @Override
    public void processShipment() {
        System.out.println("Подготовка транспорта типа '" + transportType + "' для отгрузки " + id);
    }

    public abstract String getDeliveryDetails();

    public void assignTransport() {
        System.out.println("Назначен транспорт: " + transportType + " для " + name);
    }
}
