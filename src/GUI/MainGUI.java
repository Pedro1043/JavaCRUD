package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame{
    private JButton usuariosButton;
    private JButton categoriasButton;
    private JButton articulosButton;
    private JButton comentariosButton;
    private JButton etiquetasButton;
    private JPanel panel1;

    public JPanel getPanel1() {
        return panel1;
    }

    public MainGUI(){

        usuariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuarioGui usuarioGui = new UsuarioGui();
                usuarioGui.setContentPane(usuarioGui.getPrincipal());
                usuarioGui.setSize(500,500);
                usuarioGui.setVisible(true);
                usuarioGui.setLocationRelativeTo(null);
            }
        });
    }
}
