/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;



import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author raulr_000
 */


public class Abono extends JFrame {

    JTextField pantalla;
     JMenu m;
     JMenuBar menuBar;
    String operacion;
    JButton ab;
    JPanel panelNumeros, panelOperaciones;
    boolean nuevaOperacion = true;

    public Abono() {
        setSize(700, 1000);
        setTitle("Abonin");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        // Vamos a dibujar sobre el panel
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());

        pantalla = new JTextField("0", 20);
        pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        panel.add("North", pantalla);

        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3));
        panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));

        for (int n = 9; n >= 0; n--) {
            nuevoBotonNumerico("" + n);
        }

        nuevoBotonNumerico(".");
        nuevoBotonNumerico("Abonar Dinero");

        panel.add("Center", panelNumeros); 
    }

    private void nuevoBotonNumerico(String digito) {
        JButton btn = new JButton();
        btn.setText(digito);
        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                numeroPulsado(btn.getText());
            }
        });

        panelNumeros.add(btn);

    }

    private void numeroPulsado(String digito) {
        if (pantalla.getText().equals("0") || nuevaOperacion) {
            pantalla.setText(digito);
        } else {
            pantalla.setText(pantalla.getText() + digito);
        }
        nuevaOperacion = false;
    }
    /*Menu*/

    public JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenu("Menu"));
         return menuBar;
    
    }
 
    public JMenu createMenu(String title) {
        JMenu m = new JMenu(title);
        m.add("Retirar");
        m.add("Donar");
        m.add("Atras");
        return m;
    }
      private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("MenuGlueDemo");

        //Create and set up the content pane.
        Abono demo = new Abono();
        frame.setContentPane(demo.createMenuBar());
 
        //Display the window.
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
 
    public void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
 
 
    }



