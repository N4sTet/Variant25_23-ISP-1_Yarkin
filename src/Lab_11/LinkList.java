package Lab_11;

import Lab8.Shipment.*;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        List<Shipment> shipments = new LinkedList<>();

        shipments.add(new Shipment("Почта России", "В обработке"));
        shipments.add(new ExpressShipment("Курьер DPD", "Отправлено", 1));
        shipments.addFirst(new InternationalShipment("Самолёт", "В пути", "Прошёл таможню в ЕС", 245.50));
        shipments.addLast(new ExpressShipment("СДЭК", "Доставлено", 3));
        shipments.add(new Shipment("Железная дорога", "Ожидает отправки"));
        shipments.add(new InternationalShipment("Морской транспорт", "В порту", "Ожидает растаможки", 1800.00));

        System.out.println("Список отгрузок (после добавления 6 объектов):");
        printShipments(shipments);

        shipments.addFirst(new ExpressShipment("Авиа (сверхсрочно)", "Формируется", 1));
        shipments.addLast(new Shipment("Автотранспорт", "Готов к отправке"));

        System.out.println("\nПосле addFirst() и addLast():");
        printShipments(shipments);

        Shipment removedFirst = shipments.removeFirst();
        Shipment removedLast = shipments.removeLast();
        System.out.println("\nУдалён первый: " + removedFirst.getShipmentInfo());
        System.out.println("Удалён последний: " + removedLast.getShipmentInfo());

        System.out.println("\nПосле удаления первого и последнего:");
        printShipments(shipments);

        System.out.println("\nПервый элемент (getFirst): " + shipments.getFirst().getShipmentInfo());
        System.out.println("Последний элемент (getLast): " + shipments.getLast().getShipmentInfo());

        System.out.println("\nПоиск и удаление международных отправлений с пошлиной > 1000$:");
        shipments.removeIf(shipment -> {
            if (shipment instanceof InternationalShipment intl) {
                boolean match = intl.getCustomsDuty() > 1000;
                if (match) {
                    System.out.println("Удаляется: " + shipment.getShipmentInfo());
                }
                return match;
            }
            return false;
        });

        System.out.println("\nФинальный список после удаления по условию:");
        printShipments(shipments);

        System.out.println("\nСписок пуст? " + shipments.isEmpty());
        System.out.println("Размер списка: " + shipments.size());
    }

    private static void printShipments(List<Shipment> list) {
        if (list.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).getShipmentInfo());
        }
    }
}
