package cajero;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CuentaNueva extends JFrame {

    JTextField pantalla, pantalla2;
    

    public CuentaNueva() {

        setSize(500, 100);
        setTitle("Calculadora Tarea");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());

        pantalla = new JTextField("Ingresa el Nombre", 20);
        pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
        pantalla.setFont(new Font("Arial", Font.BOLD, 15));
        pantalla.setHorizontalAlignment(JTextField.CENTER);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.GRAY);

        pantalla2 = new JTextField(20);
        pantalla2.setBorder(new EmptyBorder(4, 4, 4, 4));
        pantalla2.setFont(new Font("Arial", Font.BOLD, 15));
        pantalla2.setHorizontalAlignment(JTextField.CENTER);
        pantalla2.setEditable(true);
        pantalla2.setBackground(Color.WHITE);
       

        panel.add("North", pantalla);
        panel.add("Center", pantalla2);

    }
}