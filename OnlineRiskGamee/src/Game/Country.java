/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import javax.swing.JButton;

/**
 *
 * @author Passion Punch Studio
 */
public class Country implements java.io.Serializable {

    public int soldiers;
    public String btnName;

    public Country(String btnName) {
        this.soldiers = 1;
        this.btnName = btnName;
    }

}
