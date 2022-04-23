/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Game;

import Message.Message;
import Message.Message.Message_Type;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import jdk.nashorn.internal.runtime.Debug;

/**
 *
 * @author Passion Punch Studio
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public static Board board;
    public ArrayList<JButton> buttons;
    public ArrayList<Country> playerCountries;
    public ArrayList<Country> opponentCountries;
    public boolean isPlayerTurn = false;
    public String opponentName;
    public String playerName;
    public int placeCount;

    public Board() {
        initComponents();
        board = this;
        playerCountries = new ArrayList<>();
        opponentCountries = new ArrayList<>();
        placeCount = 20;
        System.out.println(jButton1.getName());
    }

    public Board(String userName) {
        initComponents();
        playerCountries = new ArrayList<>();
        opponentCountries = new ArrayList<>();
        buttons = new ArrayList<>();
        placeCount = 20;
        board = this;
        playerName = userName;
        labelPlayerName.setText(userName);

        buttons.add(jButton1);
        buttons.add(jButton2);
        buttons.add(jButton3);
        buttons.add(jButton4);
        buttons.add(jButton5);
        buttons.add(jButton6);
        buttons.add(jButton7);
        buttons.add(jButton8);
        buttons.add(jButton9);
        buttons.add(jButton10);
        buttons.add(jButton11);
        buttons.add(jButton12);
        buttons.add(jButton13);
        buttons.add(jButton14);
        buttons.add(jButton15);
        buttons.add(jButton16);
        buttons.add(jButton17);
        buttons.add(jButton18);
        buttons.add(jButton19);
        buttons.add(jButton20);
        buttons.add(jButton21);
        buttons.add(jButton22);
        for (JButton button : buttons) {
            button.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        }
    }
    

    public void OpponentArrived(Object content) {
        ArrayList msgContent = (ArrayList) content;
        opponentName = (String) msgContent.get(0);
        labelEnemyName.setText(opponentName);
        isPlayerTurn = (Boolean) msgContent.get(1);// Sıra kimde olduğunu belirten mesaj.
        SetTextTurn();
        InitCountries();
    }

    private void SetTextTurn() {
        if (isPlayerTurn) {
            textTurn.setText("Your Turn...");
        } else {
            textTurn.setText(opponentName + "'s Turn...");
        }
    }

    private void InitCountries() {
        if (isPlayerTurn) {
            Country c1 = new Country("jButton1");
            Country c2 = new Country("jButton7");
            Country c3 = new Country("jButton5");
            Country c4 = new Country("jButton3");
            Country c5 = new Country("jButton11");
            Country c6 = new Country("jButton9");
            Country c7 = new Country("jButton18");
            Country c8 = new Country("jButton13");
            Country c9 = new Country("jButton15");
            Country c10 = new Country("jButton21");
            Country c11 = new Country("jButton17");

            playerCountries.add(c1);
            playerCountries.add(c2);
            playerCountries.add(c3);
            playerCountries.add(c4);
            playerCountries.add(c5);
            playerCountries.add(c6);
            playerCountries.add(c7);
            playerCountries.add(c8);
            playerCountries.add(c9);
            playerCountries.add(c10);
            playerCountries.add(c11);

            Country c12 = new Country("jButton2");
            Country c13 = new Country("jButton4");
            Country c14 = new Country("jButton6");
            Country c15 = new Country("jButton8");
            Country c16 = new Country("jButton10");
            Country c17 = new Country("jButton12");
            Country c18 = new Country("jButton14");
            Country c19 = new Country("jButton16");
            Country c20 = new Country("jButton19");
            Country c21 = new Country("jButton20");
            Country c22 = new Country("jButton22");

            opponentCountries.add(c12);
            opponentCountries.add(c13);
            opponentCountries.add(c14);
            opponentCountries.add(c15);
            opponentCountries.add(c16);
            opponentCountries.add(c17);
            opponentCountries.add(c18);
            opponentCountries.add(c19);
            opponentCountries.add(c20);
            opponentCountries.add(c21);
            opponentCountries.add(c22);
        } else {
            Country c1 = new Country("jButton1");
            Country c2 = new Country("jButton7");
            Country c3 = new Country("jButton5");
            Country c4 = new Country("jButton3");
            Country c5 = new Country("jButton11");
            Country c6 = new Country("jButton9");
            Country c7 = new Country("jButton18");
            Country c8 = new Country("jButton13");
            Country c9 = new Country("jButton15");
            Country c10 = new Country("jButton21");
            Country c11 = new Country("jButton17");

            opponentCountries.add(c1);
            opponentCountries.add(c2);
            opponentCountries.add(c3);
            opponentCountries.add(c4);
            opponentCountries.add(c5);
            opponentCountries.add(c6);
            opponentCountries.add(c7);
            opponentCountries.add(c8);
            opponentCountries.add(c9);
            opponentCountries.add(c10);
            opponentCountries.add(c11);

            Country c12 = new Country("jButton2");
            Country c13 = new Country("jButton4");
            Country c14 = new Country("jButton6");
            Country c15 = new Country("jButton8");
            Country c16 = new Country("jButton10");
            Country c17 = new Country("jButton12");
            Country c18 = new Country("jButton14");
            Country c19 = new Country("jButton16");
            Country c20 = new Country("jButton19");
            Country c21 = new Country("jButton20");
            Country c22 = new Country("jButton22");

            playerCountries.add(c12);
            playerCountries.add(c13);
            playerCountries.add(c14);
            playerCountries.add(c15);
            playerCountries.add(c16);
            playerCountries.add(c17);
            playerCountries.add(c18);
            playerCountries.add(c19);
            playerCountries.add(c20);
            playerCountries.add(c21);
            playerCountries.add(c22);
        }

        for (Country playerCountry : playerCountries) {
            JButton btn = GetButton(playerCountry.btnName);
            btn.setBackground(Color.green);
            btn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isPlayerTurn) {
                        if (placeCount > 0) {
                            Country c = GetPlayerCountry((JButton) e.getSource());
                            c.soldiers++;
                            btn.setText(String.valueOf(c.soldiers));
                            placeCount--;
                            SetPlaceCount();
                            SendPlacementInfo(c);
                        }
                    }
                }
            });
        }

        for (Country opponentCountry : opponentCountries) {
            JButton btn = GetButton(opponentCountry.btnName);
            btn.setBackground(Color.red);
        }

    }

    private Country GetPlayerCountry(JButton btn) {
        for (Country playerCountry : playerCountries) {
            if (playerCountry.btnName.equals(btn.getName())) {
                return playerCountry;
            }
        }

        return null;
    }

    private JButton GetButton(String btnName) {
        for (JButton button : buttons) {
            if (btnName.equals(button.getName())) {
                return button;
            }
        }
        return null;
    }

    private void SetPlaceCount() {
        textPlaceCount.setText("Place Soldier Count: " + String.valueOf(placeCount));
    }

    private void SendPlacementInfo(Country c) {
        Message msg = new Message(Message_Type.SoldierPlacement);
        msg.content = c;
        System.out.println("Soldier placement info send...");
        Client.Send(msg);
    }

    public void ReadPlacementInfo(Object content) {
        Country c = (Country) content;
        Country cr = GetOpponentCountry(c.btnName);
        cr.soldiers++;
        JButton btn = GetButton(c.btnName);
        btn.setText(String.valueOf(cr.soldiers));
        placeCount--;
        SetPlaceCount();
    }

    public void ReadSkipTurnInfo() {
        placeCount = 20;
        SetPlaceCount();
        isPlayerTurn = true;
        SetTextTurn();

    }

    private Country GetOpponentCountry(String btnName) {
        for (Country opponentCountry : opponentCountries) {
            if (opponentCountry.btnName.equals(btnName)) {
                return opponentCountry;
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        labelEnemyName = new javax.swing.JLabel();
        labelPlayerName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        skipButton = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        textTurn = new javax.swing.JLabel();
        textPlaceCount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        jButton21.setText("1");
        jButton21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton21.setName("jButton21"); // NOI18N
        getContentPane().add(jButton21);
        jButton21.setBounds(210, 200, 80, 50);

        jButton22.setText("1");
        jButton22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.setName("jButton22"); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(280, 120, 80, 60);

        labelEnemyName.setFont(new java.awt.Font("Rockwell Nova Extra Bold", 3, 18)); // NOI18N
        labelEnemyName.setForeground(new java.awt.Color(0, 204, 204));
        labelEnemyName.setText("Waiting...");
        getContentPane().add(labelEnemyName);
        labelEnemyName.setBounds(320, 0, 200, 60);

        labelPlayerName.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        labelPlayerName.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(labelPlayerName);
        labelPlayerName.setBounds(70, 10, 130, 40);

        jLabel2.setFont(new java.awt.Font("Rockwell Nova Extra Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText(" You: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 200, 60);

        jLabel3.setFont(new java.awt.Font("Rockwell Nova Extra Bold", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText(" Enemy:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 0, 340, 60);

        skipButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        skipButton.setForeground(new java.awt.Color(51, 102, 255));
        skipButton.setText("Skip");
        skipButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });
        getContentPane().add(skipButton);
        skipButton.setBounds(370, 590, 420, 40);

        jButton9.setText("1");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setName("jButton9"); // NOI18N
        getContentPane().add(jButton9);
        jButton9.setBounds(540, 470, 90, 60);

        jButton10.setText("1");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setName("jButton10"); // NOI18N
        getContentPane().add(jButton10);
        jButton10.setBounds(750, 260, 90, 40);

        jButton11.setText("1");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setName("jButton11"); // NOI18N
        getContentPane().add(jButton11);
        jButton11.setBounds(350, 390, 70, 50);

        jButton12.setText("1");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setName("jButton12"); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(190, 130, 80, 50);

        jButton13.setText("1");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setName("jButton13"); // NOI18N
        getContentPane().add(jButton13);
        jButton13.setBounds(250, 380, 70, 50);

        jButton14.setText("1");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.setName("jButton14"); // NOI18N
        getContentPane().add(jButton14);
        jButton14.setBounds(320, 340, 80, 50);

        jButton15.setText("1");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.setName("jButton15"); // NOI18N
        getContentPane().add(jButton15);
        jButton15.setBounds(280, 430, 80, 60);

        jButton16.setText("1");
        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.setName("jButton16"); // NOI18N
        getContentPane().add(jButton16);
        jButton16.setBounds(710, 130, 70, 60);

        jButton17.setText("1");
        jButton17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.setName("jButton17"); // NOI18N
        getContentPane().add(jButton17);
        jButton17.setBounds(490, 230, 60, 60);

        jButton18.setText("1");
        jButton18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.setName("jButton18"); // NOI18N
        getContentPane().add(jButton18);
        jButton18.setBounds(620, 120, 70, 60);

        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setName("jButton1"); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(820, 110, 80, 60);

        jButton2.setText("1");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setName("jButton2"); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(780, 310, 70, 60);

        jButton3.setText("1");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setName("jButton3"); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(790, 200, 80, 60);

        jButton4.setText("1");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setName("jButton4"); // NOI18N
        getContentPane().add(jButton4);
        jButton4.setBounds(860, 510, 70, 70);

        jButton5.setText("1");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(630, 280, 80, 60);

        jButton6.setText("1");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setName("jButton6"); // NOI18N
        getContentPane().add(jButton6);
        jButton6.setBounds(500, 350, 70, 60);

        jButton7.setText("1");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setName("jButton7"); // NOI18N
        getContentPane().add(jButton7);
        jButton7.setBounds(550, 230, 70, 40);

        jButton8.setText("1");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setName("jButton8"); // NOI18N
        getContentPane().add(jButton8);
        jButton8.setBounds(470, 130, 80, 60);

        jButton19.setText("1");
        jButton19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.setName("jButton19"); // NOI18N
        getContentPane().add(jButton19);
        jButton19.setBounds(620, 210, 90, 50);

        jButton20.setText("1");
        jButton20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.setName("jButton20"); // NOI18N
        getContentPane().add(jButton20);
        jButton20.setBounds(210, 250, 70, 60);

        textTurn.setFont(new java.awt.Font("Rockwell Nova Extra Bold", 3, 18)); // NOI18N
        textTurn.setForeground(new java.awt.Color(51, 153, 255));
        textTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTurn.setText("Turn...");
        textTurn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        textTurn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(textTurn);
        textTurn.setBounds(540, 0, 290, 60);

        textPlaceCount.setFont(new java.awt.Font("Rockwell Nova Extra Bold", 3, 14)); // NOI18N
        textPlaceCount.setForeground(new java.awt.Color(0, 204, 153));
        textPlaceCount.setText(" Place Soldier Count: ");
        textPlaceCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        textPlaceCount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(textPlaceCount);
        textPlaceCount.setBounds(828, 0, 260, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevse\\OneDrive\\Masaüstü\\mappp2.jpg")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(3000, 1500));
        jLabel4.setMinimumSize(new java.awt.Dimension(1100, 600));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -30, 1190, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        if (isPlayerTurn) {
            Message msg = new Message(Message_Type.SkipTurn);
            msg.content = null;
            Client.Send(msg);
            placeCount = 20;
            isPlayerTurn = false;
            SetTextTurn();
            SetPlaceCount();
        }
    }//GEN-LAST:event_skipButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelEnemyName;
    private javax.swing.JLabel labelPlayerName;
    private javax.swing.JButton skipButton;
    private javax.swing.JLabel textPlaceCount;
    private javax.swing.JLabel textTurn;
    // End of variables declaration//GEN-END:variables
}
