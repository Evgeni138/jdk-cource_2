package lesson02;

public class ClientListenerImplementation implements SocketThreadListener{
    @Override
    public void pressBtn(String btnName) {
        System.out.println("Client log: pressed button " + btnName);
    }
}
