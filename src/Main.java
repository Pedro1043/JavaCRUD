import GUI.MainGUI;
import database.Database;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        MainGUI mainGUI = new MainGUI();
        mainGUI.setContentPane(mainGUI.getPanel1());
        mainGUI.setSize(500,500);
        mainGUI.setVisible(true);
    }
}