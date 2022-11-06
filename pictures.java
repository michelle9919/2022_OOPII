import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

class MyJFrame extends JFrame implements ActionListener {
  private JPanel contentPane;
  String[] picturesName = { "shibades.jpg", "manto.jpg", "bulldog.jpg" };
  JLabel label;
  JButton btn1, btn2;
  int num = 1;

  MyJFrame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Pictures");
    setSize(900, 600);
    setLayout(null);

    label = new JLabel(new ImageIcon(picturesName[num]));
    label.setBounds(20, 10, 900, 500);
    add(label);

    contentPane = new JPanel();
    contentPane.setBounds(0, 520, 900, 30);
    contentPane.setLayout(new GridLayout(1, 2));
    add(contentPane);

    btn1 = new JButton("previous");
    btn1.addActionListener(this);
    contentPane.add(btn1);

    btn2 = new JButton("next");
    btn2.addActionListener(this);
    contentPane.add(btn2);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btn1 && num == 0) {
      JOptionPane.showMessageDialog(null, "There is no picture", "previous", JOptionPane.WARNING_MESSAGE);
    } else if (e.getSource() == btn1) {
      num--;
      label.setIcon(new ImageIcon(picturesName[num]));
    }

    if (e.getSource() == btn2 && num == picturesName.length - 1) {
      JOptionPane.showMessageDialog(null, "There is no picture", "next", JOptionPane.WARNING_MESSAGE);
    } else if (e.getSource() == btn2) {
      num++;
      label.setIcon(new ImageIcon(picturesName[num]));
    }

  }
}

public class pictures {
  public static void main(String[] args) {
    MyJFrame f1 = new MyJFrame();
  }
}