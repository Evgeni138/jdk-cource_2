package lesson02;

public class ServerSockedImplementation implements ServerSocketThreadListener{
    @Override
    public void onStart() {
        System.out.println("Log: Received command to start!");
    }

    @Override
    public void onStop() {
        System.out.println("Log: Received command to stop!");
    }
}
