package xyz.itwill.mat;

import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Info extends JDialog {
   private static final long serialVersionUID = 1L;
   private final JPanel contentPanel = new JPanel();
   JTable table;
   
   public Info(JFrame frame) {
      super(frame, true);
      
      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      
      setTitle("아따 배고프다잉 빨리 검색해라");
      setBounds(100, 100, 800, 146);
      getContentPane().setLayout(null);
      contentPanel.setBounds(0, 0, 784, 126);
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel);
      contentPanel.setLayout(null);
      
      JLabel lblNewLabel_1 = new JLabel("상세정보");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("HY견고딕", Font.BOLD, 15));
      lblNewLabel_1.setBounds(-26, 10, 151, 24);
      contentPanel.add(lblNewLabel_1);
      
      
      
      table = new JTable();
      String[] columnName={"가게이름","상세주소","연락처","대표메뉴","금액","평점","음식분류"};

      
      table=new JTable(new DefaultTableModel(columnName, 0));
      table.setEnabled(false);
      table.getTableHeader().setReorderingAllowed(false);
      table.getTableHeader().setResizingAllowed(false);
      
      JScrollPane sp = new JScrollPane(table);
      sp.setBounds(12, 43, 760, 39);
      contentPanel.add(sp);
      
   }
}