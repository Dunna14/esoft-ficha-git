import javax.swing.*;
import java.awt.*;

public class Experimental extends JFrame {

    private JPanel panel;
    private JLabel lblHelloWorld,lblMesangem2;

    public Experimental(){
        panel = new JPanel(new GridLayout(1, 1));
        lblHelloWorld = new JLabel("Experiência");
        lblMesangem2 = new JLabel("eia");
        System.out.println("Olá");

        lblHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
        lblMesangem2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblMesangem2);
        panel.add(lblHelloWorld);
        setContentPane(panel);

        setPreferredSize(new Dimension(600, 600));
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
