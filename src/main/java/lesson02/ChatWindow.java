package lesson02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    private final SocketThreadListener chatListener;
    private final ChatServer chatServer;
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 200;

    public ChatWindow(SocketThreadListener chatListener, ChatServer chatServer) {

        this.chatListener = chatListener;

        this.chatServer = chatServer;

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocation(WINDOW_POSX, WINDOW_POSY);

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setTitle("Server");

        setResizable(false);

        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        JTextArea field = new JTextArea();

        JPanel panButton = new JPanel(new GridLayout(1, 1));
        panButton.add(btnStart);
        panButton.add(btnStop);

        add(panButton, BorderLayout.CENTER);

        setVisible(true);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatServer.start();
                chatListener.pressBtn("btnStart");
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatServer.stop();
                chatListener.pressBtn("BtnStop");
            }
        });
    }
}

