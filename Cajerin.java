package cajero;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Emmanuel Oropeza
 */
public class Cajerin extends JFrame implements ActionListener {

    public Cajerin() {

        setSize(500, 300);
        setTitle("Cajero");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());

        JButton btn = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();
        JButton btn4 = new JButton();

        btn.setForeground(Color.BLUE);
        setLayout(null);
        btn = new JButton("retirar");
        btn.setBounds(100, 150, 100, 30);
        add(btn);
        btn.addActionListener(this);

        btn2.setForeground(Color.RED);
        setLayout(null);
        btn2 = new JButton("Abonar");
        btn2.setBounds(200, 150, 100, 30);
        add(btn2);
        btn2.addActionListener(this);

        btn3.setForeground(Color.RED);
        setLayout(null);
        btn3 = new JButton("Crear cuenta");
        btn3.setBounds(300, 150, 100, 30);
        add(btn3);
        btn3.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opc = e.getActionCommand();
        if (opc.equals("Crear cuenta")) {
            dispose();
            CuentaNueva cn = new CuentaNueva();
            cn.setVisible(true);
        } else if (opc.equals("Abonar")) {
            dispose();
            Abono abo = new Abono();
            abo.setVisible(true);
        } else if (opc.equals("Retirar")) {
            dispose();
            Retirar ret = new Retirar();
            ret.setVisible(true);

        }
    }
}
