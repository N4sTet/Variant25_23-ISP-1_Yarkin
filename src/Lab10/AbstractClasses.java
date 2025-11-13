package Lab10;

import Lab10.AbstractShipment.*;
import java.time.LocalDate;

public class AbstractClasses {
    public static void main(String[] args) {
        TruckShipment truck = new TruckShipment(
                Shipment.generateId("ГЗП"),
                "Электроника для Электростали",
                LocalDate.of(2025, 11, 15),
                "Иван Петров",
                "ПОП-123"
        );

        AirShipment air = new AirShipment(
                Shipment.generateId("ЭЙР"),
                "Посылки в Новосибирск",
                LocalDate.of(2025, 11, 12),
                "СК-445",
                "Брянский"
        );

        System.out.println(truck);
        truck.assignTransport();
        truck.processShipment();
        truck.loadCargo();
        System.out.println("Детали доставки: " + truck.getDeliveryDetails());
        System.out.println("Дата отгрузки: " + truck.getShipmentDate().format(Shipment.formdate));
        truck.updateStatus("В пути");
        System.out.println();

        System.out.println(air);
        air.assignTransport();
        air.processShipment();
        air.checkInCargo();
        System.out.println("Детали доставки: " + air.getDeliveryDetails());
        System.out.println("Дата отгрузки: " + air.getShipmentDate().format(Shipment.formdate));
        air.updateStatus("В полёте");
        System.out.println();

        System.out.println("Всего создано отгрузок: " + Shipment.getTotalShipments());
        System.out.println("Пример нового ID: " + Shipment.generateId("Н"));

    }
}
