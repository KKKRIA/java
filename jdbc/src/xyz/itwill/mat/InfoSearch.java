package xyz.itwill.mat;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InfoSearch extends JDialog {
   private static final long serialVersionUID = 1L;

   
   private final JPanel contentPanel = new JPanel();

   JTextField infoSearchTF;
   String infoSearch="";

   public InfoSearch(JFrame frame) {
      super(frame, true);

      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      setTitle("아따 배고프다잉 빨리 검색해라");
      setBounds(100, 100, 450, 142);
      getContentPane().setLayout(null);
      contentPanel.setBounds(0, 0, 434, 103);
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel);
      contentPanel.setLayout(null);
      
      
      {
         JButton okButton = new JButton("검색");
         okButton.setFont(new Font("굴림", Font.PLAIN, 11));
         okButton.setBounds(296, 66, 57, 23);
         contentPanel.add(okButton);
         okButton.setActionCommand("OK");
         getRootPane().setDefaultButton(okButton);
         okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
               infoSearch=infoSearchTF.getText();
               dispose();
               
            }   
         });
         
      }
      {
         JButton cancelButton = new JButton("닫기");
         cancelButton.setFont(new Font("굴림", Font.PLAIN, 11));
         cancelButton.setBounds(365, 66, 57, 23);
         cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
         });
         contentPanel.add(cancelButton);
         cancelButton.setActionCommand("Cancel");
      }
      
      
      JLabel lblNewLabel = new JLabel("가게 이름을 입력해주세요.");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(115, 6, 152, 23);
      contentPanel.add(lblNewLabel);
 
      infoSearchTF = new JTextField();
      infoSearchTF.setBounds(22, 35, 400, 23);
      contentPanel.add(infoSearchTF);
      infoSearchTF.setColumns(10);

      JLabel lblNewLabel_1 = new JLabel("상세정보 검색");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("HY견고딕", Font.BOLD, 15));
      lblNewLabel_1.setBounds(17, 7, 97, 18);
      contentPanel.add(lblNewLabel_1);
   }


   

   
}