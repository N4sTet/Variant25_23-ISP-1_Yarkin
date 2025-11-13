package Lab7.Messenger;

public class AdvancedMessengerApp extends MessengerApp {

    private String time;


    public AdvancedMessengerApp(String name, String time) {
        super(name);
        this.time = time;
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение (с временем): " + message + " | " + time);
    }

    public String getTime() {
        return time;
    }

    @Override
    public void notify1(){
        System.out.println("Метод 2");
    }
    public void notify4(){
        System.out.println("Метод 4");
    }

    @Override
    public String toString() {
        return "AdvancedMessengerApp{" + "name='" + name +  "', time=" + time + '}';
    }

}
