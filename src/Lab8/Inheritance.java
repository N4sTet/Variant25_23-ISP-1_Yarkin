package Lab8;

import Lab8.Shipment.*;

public class Inheritance {
    public static void main(String[] args) {
        try {
            Shipment regularShipment = new Shipment(
                    "Грузоперевозка",
                    "В пути"
            );

            InternationalShipment internationalShipment = new InternationalShipment(
                    "Авиаперевозка",
                    "В обработке",
                    "Документы на экспорт",
                    1000.1
            );

            ExpressShipment expressShipment = new ExpressShipment(
                    "Курьерская служба",
                    "Подготовка",
                    3
            );

            System.out.println("Обычная отгрузка:");
            System.out.println(regularShipment.getShipmentInfo());
            regularShipment.updateStatus("Доставлено");
            System.out.println();

            System.out.println("Международная отгрузка:");
            System.out.println(internationalShipment.getShipmentInfo());
            internationalShipment.processCustoms();
            System.out.println();

            System.out.println("Срочная отгрузка:");
            System.out.println(expressShipment.getShipmentInfo());
            expressShipment.updateStatus("В доставке");
            System.out.println(expressShipment.calcDeliveryTime());

            try {
                regularShipment.setTransport("");
            } catch (IllegalArgumentException e) {
                System.out.println("\nОшибка: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
