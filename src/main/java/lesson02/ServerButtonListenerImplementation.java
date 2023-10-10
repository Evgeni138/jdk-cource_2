package lesson02;

public class ServerButtonListenerImplementation implements SocketThreadListener{
    @Override
    public void pressBtn(String btnName) {
        System.out.println("Server log: cmd received from " + btnName);
    }
}
