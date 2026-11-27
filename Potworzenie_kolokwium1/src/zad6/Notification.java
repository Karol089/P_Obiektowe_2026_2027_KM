package zad6;

public abstract class Notification {
    protected String recipient;
    protected String createdAt;

    public abstract void send();
}
