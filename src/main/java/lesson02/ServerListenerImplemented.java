package lesson02;

public class ServerListenerImplemented implements ServerListener {

    @Override
    public void onMessageReceived(String message) {
        System.out.println("Message: " + message);
    }
}
