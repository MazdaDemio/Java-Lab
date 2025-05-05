/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fedor Khvorov
 */

import java.net.*;


public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);
        System.out.println("Server Zapushen i ozhidaet rezultatov");

        while (true) {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            
             String message = new String(packet.getData(), 0, packet.getLength());
            
            if (message.equals("CLIENT_CONNECTED")) {
                
                String response = "SERVER_ACK";
                byte[] responseData = response.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(
                    responseData, responseData.length, 
                    packet.getAddress(), packet.getPort()
                );
                socket.send(responsePacket);
            } else {
                
                System.out.println("Result from " + packet.getAddress() + ": " + message);
            }
        }
    }
}