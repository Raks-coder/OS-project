// import javax.swing.*;
// public class Client extends JFrame {

//     public Client() {

//         setTitle("My Gui");
//         setSize(400, 400);

//         // Create JButton and JPanel
//         JButton button = new JButton("Flood");
//         //  try {
//         // Image img = ImageIO.read(getClass().getResource("resources/water.jpeg"));
//         // button.setIcon(new ImageIcon(img));
//         // } catch (Exception ex) {
//         // System.out.println(ex);
//         // }

//         JButton button2= new JButton("Drought");
//         JButton button3= new JButton("Fire");
//         JButton button4= new JButton("Wild Animal");
//         JPanel panel = new JPanel();

//         // Add button to JPanel
//         panel.add(button);
//         panel.add(button2);
//         panel.add(button3);
//         panel.add(button4);

//         // And JPanel needs to be added to the JFrame itself!
//         this.getContentPane().add(panel);

//         setVisible(true);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }
    

//     public static void main(String[] args) {

//         Client a = new  Client();
//     }
// }
// 
import javax.swing.*;
import java.awt.*;

public class IconButton{
  public static void main(String[] args){
  JFrame frame = new JFrame("Icon on button");
  JButton button = new JButton("Flood");
  Icon imgicon = new ImageIcon("Desktop/try/water.jpeg");
  JPanel panel = new JPanel();
  button.setIcon(imgicon);
  panel.add(button);
  frame.add(panel, BorderLayout.NORTH);
  frame.setSize(400, 400);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}