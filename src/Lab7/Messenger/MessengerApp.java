package Lab7.Messenger;

public class MessengerApp {
    protected String name;

    public MessengerApp(String name){
        this.name = name;
    }

    public void notify(String message) {
        System.out.println("Ваше сообщение: " + message);
    }

    public void notify(String message, int n) {
        System.out.println("Повторение вашего сообщения " + n + " раз...");
        for(int i = 1; i <= n; i++) {
            System.out.println(message);
        }
    }

    public void notify(String message, String req) {
        System.out.println("Сообщение для " + req + ": " + message);
    }

    public void notify1(){
        System.out.println("Метод 1");
    }

    public void notify3(){
        System.out.println("Метод 1");
    }

    @Override
    public String toString() {
        return "MessengerApp{name='" + name + "'}";
    }

}