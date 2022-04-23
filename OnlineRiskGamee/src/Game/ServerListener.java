/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Message.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static Game.Client.sInput;

/**
 *
 * @author kbusra
 */
public class ServerListener extends Thread {

    @Override
    public void run() {
        while (Client.socket.isConnected()) {
            try {
                Message received = (Message) (sInput.readObject()); //Blocking

                switch (received.type) {

                    case OpponentFound:
                        sleep(1000);
                        Board.board.OpponentArrived(received.content);
                        System.out.println("Opponent Arrived...");
                        break;
                    case SoldierPlacement:
                        Board.board.ReadPlacementInfo(received.content);
                        System.out.println("Opponent Made Placement...");
                        break;
                    case SkipTurn:
                        Board.board.ReadSkipTurnInfo();
                        break;

                }

            } catch (IOException | ClassNotFoundException ex) {

                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                break;
            } catch (InterruptedException ex) {
                Logger.getLogger(ServerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
