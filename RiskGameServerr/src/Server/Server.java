/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Message.Message;
import Message.Message.Message_Type;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Game.Country;

/**
 *
 * @author X550V
 */
public class Server {

    public static ServerSocket serverSocket;
    public static int IdClient = 0;
    public static int port = 0;
    public static NewClientListener runThread;
    public static ArrayList<Client> Clients = new ArrayList<>();

    public static void Start(int openport) {
        try {
            Server.port = openport;
            Server.serverSocket = new ServerSocket(Server.port);

            Server.runThread = new NewClientListener();
            Server.runThread.start();

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Send(Client cl, Message msg) {

        try {
            cl.sOutput.writeObject(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void FindValidEnemy(Client c) {
        for (Client client : Clients) {
            if (c != client && client.opponent == null) {
                c.opponent = client;
                client.opponent = c;

                SendOpponentInfo(c, true);
                SendOpponentInfo(client, false);
            }
        }
    }

    private static void SendOpponentInfo(Client cl, boolean whoseTurn) {
        Message msg = new Message(Message_Type.OpponentFound);
        ArrayList msgContent = new ArrayList();
        msgContent.add(cl.opponent.name);
        msgContent.add(whoseTurn);
        msg.content = msgContent;
        Send(cl, msg);
    }
}
