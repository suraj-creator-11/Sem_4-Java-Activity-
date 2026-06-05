import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulator extends JFrame implements ActionListener {

    JLabel message;
    JRadioButton red, yellow, green;
    ButtonGroup group;

    TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Message Label (Initially Empty)
        message = new JLabel("");
        message.setFont(new Font("Arial", Font.BOLD, 24));

        // Radio Buttons
        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        // Group Radio Buttons
        group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

        // Add Action Listeners
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        add(message);
        add(red);
        add(yellow);
        add(green);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (red.isSelected()) {
            message.setText("STOP");
            message.setForeground(Color.RED);
        }
        else if (yellow.isSelected()) {
            message.setText("READY");
            message.setForeground(Color.ORANGE);
        }
        else if (green.isSelected()) {
            message.setText("GO");
            message.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLightSimulator();
    }
}