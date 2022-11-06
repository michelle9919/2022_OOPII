import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.List;

class MyJFrame extends JFrame{
  private JPanel contentPane;
  private JTextArea jta;
  private JList<String> jl1;
  private JList<String> copylist;
  
  MyJFrame(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Famous Mountains in Taiwan");
    setBounds(50, 50, 300, 400);
    
    contentPane=new JPanel();
    setContentPane(contentPane);
    contentPane.setLayout(new FlowLayout());
    
    JLabel lab1=new JLabel("Find the famous mountains everywhere:");
    contentPane.add(lab1);

    String[] city={"Taipei","Taichung","NewTaipei","Tainan","Kaohsiung","Hsinchu","Changhua","Nantou","Chiayi","Taitung"};
    String[] mountains={"Yangmingshan","Dadushan","Qixingshan","Dadongshan","Monkey Mountain","Snowwhiteshan","Baguashan","Yushan","Alishan","Dulanshan"};
    jl1=new JList<>(city);
  jl1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    JPanel jp1=new JPanel();
    contentPane.add(jp1);
    jp1.setBounds(80, 10, 140, 100);
    jp1.add(jl1);
    jl1.setVisibleRowCount(6);

    JScrollPane jsp=new JScrollPane(jl1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    jsp.setBounds(80,10,140,100);
    contentPane.add(jsp);
  
    String st="You can choose the city.\n\n\n\n";

    jta=new JTextArea(st);
    contentPane.add(jta);
    jta.setBounds(20,170,300,100);

    JScrollPane jsp2=new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    jsp2.setBounds(20,170,300,100);
    contentPane.add(jsp2);

    jl1.addListSelectionListener(new ListSelectionListener(){
      @Override
      public void valueChanged(ListSelectionEvent e){
        List<String> selectedCity=jl1.getSelectedValuesList();

        String str="";
      for(int i=0;i<selectedCity.size();i++){
        str=str+"Famous mountain in "+selectedCity.get(i)+" is "+mountains[i]+"\n\n";
        str=str.substring(0,str.length()-1);
        jta.setText(str);
      }
      }
    });
    setVisible(true);
  }

} 

public class taiwanFamousMountain {
  public static void main(String[] args) {
    MyJFrame f1 = new MyJFrame();
  }
}