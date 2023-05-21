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
import java.awt.Color;

public class SelectSearch extends JDialog {
   private static final long serialVersionUID = 1L;
   
   
   private final JPanel contentPanel = new JPanel();

   JTextField searchTF;
   String search=null;
 
   public SelectSearch(JFrame frame) {
      super(frame, true);

      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      setTitle("통합검색");
      setBounds(100, 100, 450, 142);
      getContentPane().setLayout(null);
      contentPanel.setBackground(new Color(255, 255, 255));
      contentPanel.setBounds(0, 0, 434, 103);
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel);
      contentPanel.setLayout(null);
      
      
      {
         JButton okButton = new JButton("검색");
         okButton.setBackground(new Color(234, 234, 234));
         okButton.setFont(new Font("맑은 고딕", Font.BOLD, 11));
         okButton.setBounds(290, 70, 57, 23);
         contentPanel.add(okButton);
         okButton.setActionCommand("OK");
         getRootPane().setDefaultButton(okButton);
         okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
               search=searchTF.getText();
               dispose();
               
         
               
            }   
         });
         
      }
      {
         JButton cancelButton = new JButton("닫기");
         cancelButton.setBackground(new Color(234, 234, 234));
         cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 11));
         cancelButton.setBounds(350, 70, 57, 23);
         cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
         });
         contentPanel.add(cancelButton);
         cancelButton.setActionCommand("Cancel");
      }
      
      
      JLabel lblNewLabel = new JLabel("검색어 입력하세요.");
      lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(87, 10, 117, 23);
      contentPanel.add(lblNewLabel);

      searchTF = new JTextField();
      searchTF.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
      searchTF.setBounds(22, 40, 387, 23);
      contentPanel.add(searchTF);
      searchTF.setColumns(10);

      JLabel lblNewLabel_1 = new JLabel("통합검색");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      lblNewLabel_1.setBounds(17, 14, 74, 15);
      contentPanel.add(lblNewLabel_1);
   }
   

   
}