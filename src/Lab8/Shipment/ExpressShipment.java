package Lab8.Shipment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExpressShipment extends Shipment {
    private int priorityLevel;
    private LocalDate expectedDeliveryDate;

    public ExpressShipment(String transport, String deliveryStatus, int priorityLevel) {
        super(transport, deliveryStatus);
        setPriorityLevel(priorityLevel);
        setExpectedDeliveryDate(calcExpectedDeliveryDate(priorityLevel));
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        if (priorityLevel < 1 || priorityLevel > 5) {
            throw new IllegalArgumentException("Уровень приоритета должен быть от 1 до 5");
        }
        this.priorityLevel = priorityLevel;
    }

    public LocalDate getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
        if (expectedDeliveryDate == null || expectedDeliveryDate.isBefore(getShipmentDate())) {
            throw new IllegalArgumentException("Дата доставки некорректна");
        }
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    private LocalDate calcExpectedDeliveryDate(int priorityLevel) {
        return LocalDate.now().plusDays(priorityLevel);
    }

    @Override
    public void updateStatus(String newStatus) {
        super.updateStatus(newStatus + " (Срочная доставка, приоритет " + priorityLevel + ")");
    }


    public String calcDeliveryTime() {
        long days = java.time.temporal.ChronoUnit.DAYS.between(getShipmentDate(), expectedDeliveryDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Ожидаемая дата доставки: " + expectedDeliveryDate.format(formatter) +
                " (" + days + " дней)";
    }
}
