import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyJFrame extends JFrame implements ActionListener{
  private JPanel contentPane;
  private JFrame jf;
  private JTextField jtf;
  JButton[] numberButtons=new JButton[10];
  JButton[] functionButtons=new JButton[5];
  JButton addButton,subButton,mulButton,divButton,equButton;
  double num1=0,num2=0,result=0;
  char operator;
  Font myFont=new Font("Ink Free",Font.BOLD,30);
  
  MyJFrame(){{
    jf=new JFrame("Calculator");    
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(420,500);
    jf.setLayout(null);

    jtf = new JTextField();
    jtf.setBounds(50,25,300,50);
    jtf.setEditable(false);
    jtf.setFont(myFont);
    jf.add(jtf);
    
    contentPane=new JPanel();
    contentPane.setBounds(50,100,300,300);
    contentPane.setLayout(new GridLayout(5,3,10,10));
    jf.add(contentPane);
    
    addButton=new JButton("+");
    subButton=new JButton("-");
    mulButton=new JButton("*");
    divButton=new JButton("/");
    equButton=new JButton("=");

    functionButtons[0]=addButton;
    functionButtons[1]=subButton;
    functionButtons[2]=mulButton;
    functionButtons[3]=divButton;
    functionButtons[4]=equButton;

    for(int i=0;i<5;i++){
      functionButtons[i].addActionListener(this);
      functionButtons[i].setFont(myFont);
      functionButtons[i].setFocusable(false);
    }
      
    for(int i=0;i<10;i++){
      numberButtons[i]=new JButton(String.valueOf(i));
      numberButtons[i].addActionListener(this);
      numberButtons[i].setFont(myFont);
      numberButtons[i].setFocusable(false);
    }

    for(int i=1;i<10;i++){
      contentPane.add(numberButtons[i]);
    }
    contentPane.add(functionButtons[0]);
    contentPane.add(numberButtons[0]);
    contentPane.add(functionButtons[1]);
    contentPane.add(functionButtons[2]);
    contentPane.add(functionButtons[4]);
    contentPane.add(functionButtons[3]);
    
    jf.setVisible(true);
  }}

  public void actionPerformed(final ActionEvent e){
    for(int i=0;i<10;i++){
      if(e.getSource()==numberButtons[i]){
        jtf.setText(jtf.getText().concat(String.valueOf(i)));
      }
    }
      if(e.getSource()==addButton){
        num1=Double.parseDouble(jtf.getText());
        operator='+';
        jtf.setText("");
      }
      if(e.getSource()==subButton){
        num1=Double.parseDouble(jtf.getText());
        operator='-';
        jtf.setText("");
      }
      if(e.getSource()==mulButton){
        num1=Double.parseDouble(jtf.getText());
        operator='*';
        jtf.setText("");
      }
      if(e.getSource()==divButton){
        num1=Double.parseDouble(jtf.getText());
        operator='/';
        jtf.setText("");
      }

      if(e.getSource()==equButton){
        num2=Double.parseDouble(jtf.getText());
        switch(operator){
          case '+':
            result=(num1+num2);
            break;
          case '-':
            result=(num1-num2);
            break;
          case '*':
            result=(num1*num2);
            break;
          case '/':
            result=(num1/num2);
            break;
        }
        jtf.setText(String.valueOf(result));
        num1=result;
    }
  }

public JPanel getContentPane() {
	return contentPane;
}

public void setContentPane(final JPanel contentPane) {
	this.contentPane = contentPane;
}

public JFrame getJf() {
	return jf;
}

public void setJf(final JFrame jf) {
	this.jf = jf;
}

public JTextField getJtf() {
	return jtf;
}

public void setJtf(final JTextField jtf) {
	this.jtf = jtf;
}

public JButton[] getNumberButtons() {
	return numberButtons;
}

public void setNumberButtons(final JButton[] numberButtons) {
	this.numberButtons = numberButtons;
}

public JButton[] getFunctionButtons() {
	return functionButtons;
}

public void setFunctionButtons(final JButton[] functionButtons) {
	this.functionButtons = functionButtons;
}

public JButton getAddButton() {
	return addButton;
}

public void setAddButton(final JButton addButton) {
	this.addButton = addButton;
}

public JButton getSubButton() {
	return subButton;
}

public void setSubButton(final JButton subButton) {
	this.subButton = subButton;
}

public JButton getMulButton() {
	return mulButton;
}

public void setMulButton(final JButton mulButton) {
	this.mulButton = mulButton;
}

public JButton getDivButton() {
	return divButton;
}

public void setDivButton(final JButton divButton) {
	this.divButton = divButton;
}

public JButton getEquButton() {
	return equButton;
}

public void setEquButton(final JButton equButton) {
	this.equButton = equButton;
}

public double getNum1() {
	return num1;
}

public void setNum1(final int num1) {
	this.num1 = num1;
}

public double getNum2() {
	return num2;
}

public void setNum2(final int num2) {
	this.num2 = num2;
}

public double getResult() {
	return result;
}

public void setResult(final int result) {
	this.result = result;
}

public char getOperator() {
	return operator;
}

public void setOperator(final char operator) {
	this.operator = operator;
}

public Font getMyFont() {
	return myFont;
}

public void setMyFont(final Font myFont) {
	this.myFont = myFont;
}
}
public class Calculator {
  public static void main(final String[] args) {
    final MyJFrame f1 = new MyJFrame();
  }
}
