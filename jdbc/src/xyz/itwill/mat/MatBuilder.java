package xyz.itwill.mat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JProgressBar;

public class MatBuilder extends JFrame {

   private JPanel contentPane;
   private JTable table;
   private JTable table_1;
   private JTable table_2;
   private JScrollPane sp;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MatBuilder frame = new MatBuilder();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public MatBuilder() {
      setFont(new Font("Dialog", Font.PLAIN, 15));
      setTitle("배가 고플 땐 찾아보아요 내 마음 속 맛집");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 800, 460);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 125, 411);
      contentPane.add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("배가등에붙겠네");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setFont(new Font("돋움", Font.BOLD, 16));
      lblNewLabel.setBounds(0, 44, 125, 38);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("빨리 찾아라");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 15));
      lblNewLabel_1.setBounds(0, 64, 125, 38);
      panel.add(lblNewLabel_1);
      
      JButton btnNewButton = new JButton("빠르게 검색");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton.setBounds(12, 116, 101, 23);
      panel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("음식분류로!");
      btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton_1.setBounds(12, 227, 101, 23);
      panel.add(btnNewButton_1);
      
      JButton btnNewButton_2 = new JButton("위치 별로!");
      btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 12));
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton_2.setBounds(12, 194, 101, 23);
      panel.add(btnNewButton_2);
      
      JButton btnNewButton_2_1 = new JButton("평점으로!");
      btnNewButton_2_1.setFont(new Font("굴림", Font.PLAIN, 12));
      btnNewButton_2_1.setBounds(12, 260, 101, 23);
      panel.add(btnNewButton_2_1);
      
      JButton btnNewButton_2_1_1 = new JButton("즐겨찾기");
      btnNewButton_2_1_1.setFont(new Font("굴림", Font.PLAIN, 12));
      btnNewButton_2_1_1.setBounds(12, 355, 101, 23);
      panel.add(btnNewButton_2_1_1);
      
      JLabel lblNewLabel_2 = new JLabel("골라 골라");
      lblNewLabel_2.setFont(new Font("돋움", Font.BOLD, 13));
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2.setBounds(30, 164, 64, 15);
      panel.add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("내 마음 속에");
      lblNewLabel_3.setFont(new Font("돋움", Font.BOLD, 13));
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_3.setBounds(24, 318, 76, 15);
      panel.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("★저☆장★");
      lblNewLabel_4.setFont(new Font("돋움", Font.BOLD, 13));
      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_4.setBounds(21, 336, 82, 15);
      panel.add(lblNewLabel_4);
      
      JProgressBar progressBar = new JProgressBar();
      progressBar.setBounds(0, 397, 125, 14);
      panel.add(progressBar);
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBounds(142, 5, 630, 37);
      contentPane.add(textArea_1);
      
   
      
      
      table_2 = new JTable();
      String[] columnName={"음식분류","가게이름","대표메뉴","지역","평점"};
      //sp.setViewportView(table_2);
      
      table=new JTable(new DefaultTableModel(columnName, 0));
      table.setEnabled(false);
      table.getTableHeader().setReorderingAllowed(false);
      table.getTableHeader().setResizingAllowed(false);
      
      sp=new JScrollPane(table);
      sp.setBounds(142, 48, 630, 373);
      contentPane.add(sp);
      
      
      
      
      
   
   }
   
}