import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
public class confirmDail {
   public static void main(String[] args) {
      ImageIcon icon = new ImageIcon("C:\\Users\\Acutec 14\\Desktop\\ew.jpg");
      JPanel panel = new JPanel();
      panel.setSize(new Dimension(250, 100));
      panel.setLayout(null);
      JLabel label1 = new JLabel("The file may contain virus.");
      label1.setVerticalAlignment(SwingConstants.BOTTOM);
      label1.setBounds(20, 20, 200, 30);
      label1.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(label1);
      JLabel label2 = new JLabel("Duplicate Transactions Found !! \r\n Do You Still Want to Proceed with Duplicate Transactions ?");
      label2.setVerticalAlignment(SwingConstants.TOP);
      label2.setHorizontalAlignment(SwingConstants.CENTER);
      label2.setBounds(20, 80, 200, 20);
      panel.add(label2);
      UIManager.put("OptionPane.minimumSize", new Dimension(400, 200));
      int res = JOptionPane.showConfirmDialog(null, label2);
      if(res == 0) {
         System.out.println("Pressed YES");
      } else if (res == 1) {
         System.out.println("Pressed NO");
      } else {
         System.out.println("Pressed CANCEL");
      }
   }
}