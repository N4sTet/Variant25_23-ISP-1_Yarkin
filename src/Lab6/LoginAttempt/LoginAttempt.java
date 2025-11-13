package Lab6.LoginAttempt;

public class LoginAttempt {

    String user;
    int attempts;
    boolean locked = false;

    public LoginAttempt() {
        this("Без имени", 0);
    }

    public LoginAttempt(String user, int attempts) {
        this.user = user;
        this.attempts = attempts;
        this.locked = shouldLock();
    }

    public LoginAttempt(LoginAttempt other) {
        this.user = other.user;
        this.attempts = other.attempts;
        this.locked = other.locked;
    }

    public boolean shouldLock(){
        return this.attempts >= 5;
    }

    public String status() {
        return !locked ?"активен":"заблокирован";
    }

    @Override
    public String toString() {
        return "LoginAttempt{" +
                "user='" + user + '\'' +
                ", attempts=" + attempts +
                ", locked=" + locked +
                '}';
    }
}
