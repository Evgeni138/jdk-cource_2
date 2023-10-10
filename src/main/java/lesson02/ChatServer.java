package lesson02;

public class ChatServer {
    public boolean serverWorking;
    private final ServerListener serverListener;
    private final ServerSocketThreadListener serverSocketThreadListener;
    private final SocketThreadListener socketThreadListener;

    public ChatServer(boolean serverWorking,
                      ServerListener serverListener,
                      ServerSocketThreadListener serverSocketThreadListener,
                      SocketThreadListener socketThreadListener) {
        this.serverWorking = serverWorking;
        this.serverListener = serverListener;
        this.serverSocketThreadListener = serverSocketThreadListener;
        this.socketThreadListener = socketThreadListener;
    }

    public void start() {
        socketThreadListener.pressBtn("btnStart");
        if (serverWorking) {
            serverListener.onMessageReceived("Server already started!");
        } else {
            serverSocketThreadListener.onStart();
            serverListener.onMessageReceived("Server started!");
            serverWorking = true;
        }
    }

    public void stop() {
        socketThreadListener.pressBtn("btnStop");
        if (serverWorking) {
            serverWorking = false;
            serverSocketThreadListener.onStop();
            serverListener.onMessageReceived("Server stopped!");
        } else {
            serverListener.onMessageReceived("Server already stopped!");
        }
    }
}

interface ServerListener {
    void onMessageReceived(String message);
}
