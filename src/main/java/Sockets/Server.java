package Sockets;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8181)){
            System.out.println("Server started");

                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String incomeText = in.readUTF();
                System.out.println(incomeText);
                out.writeUTF("I got your message! It is { " + incomeText+" }");
            }

        } catch (IOException e) {
            System.out.println("Server was drop...");
        }
    }


}
