package Lab8.Shipment;

public class InternationalShipment extends Shipment {
    private String customsInfo;
    private double customsDuty;

    public InternationalShipment(String transport, String deliveryStatus,
                                 String customsInfo, double customsDuty) {
        super(transport, deliveryStatus);
        setCustomsInfo(customsInfo);
        setCustomsDuty(customsDuty);
    }

    public String getCustomsInfo() {
        return customsInfo;
    }

    public void setCustomsInfo(String customsInfo) {
        if (customsInfo == null || customsInfo.trim().isEmpty()) {
            throw new IllegalArgumentException("Таможенная информация не может быть пустой");
        }
        this.customsInfo = customsInfo.trim();
    }

    public double getCustomsDuty() {
        return customsDuty;
    }

    public void setCustomsDuty(double customsDuty) {
        if (customsDuty < 0) {
            throw new IllegalArgumentException("Таможенная пошлина не может быть отрицательной");
        }
        this.customsDuty = customsDuty;
    }

    @Override
    public String getShipmentInfo() {
        return super.getShipmentInfo() +
                ", Таможенная информация: " + customsInfo +
                ", Пошлина: $" + customsDuty;
    }

    public void processCustoms() {
        updateStatus("На таможне");
        System.out.println("Обработка таможенных процедур: " + customsInfo);
    }
}