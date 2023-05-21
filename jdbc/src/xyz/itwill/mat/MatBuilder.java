package xyz.itwill.mat;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JSeparator;

public class MatBuilder extends JFrame {
   private static final long serialVersionUID = 1L;
   private JPanel contentPane;
   JTable table;
   private JTable table_1;
   private JScrollPane sp;

   SelectSearch selectSearch=new SelectSearch(this);
   SelectLocation selectLocation=new SelectLocation(this);
   SelectCategory selectCategory=new SelectCategory(this);
   SelectReview selectReview=new SelectReview(this);
   InfoSearch infoSearch=new InfoSearch(this);
   Info info=new Info(this);
   EditMat editMat=new EditMat(this);
   
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

   
   
   
   
   public MatBuilder() {
      setFont(new Font("Dialog", Font.PLAIN, 15));
      setTitle("MOA : 강남구 맛집만 모아 한번에!");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 800, 460);
      contentPane = new JPanel();
      contentPane.setBackground(new Color(255, 255, 255));
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(255, 255, 255));
      panel.setBounds(5, 5, 141, 411);
      contentPane.add(panel);
      panel.setLayout(null);
      
      
      
      
      //라벨들 모음
      JLabel lblNewLabel = new JLabel("MOA");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 31));
      lblNewLabel.setBounds(15, 25, 113, 38);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("강남구 맛집");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
      lblNewLabel_1.setBounds(15, 54, 113, 38);
      panel.add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel("검색 카테고리 ");
      lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2.setBounds(15, 114, 113, 15);
      panel.add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("자세한 정보가");
      lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_3.setBounds(15, 266, 113, 15);
      panel.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("궁금하다면");
      lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_4.setBounds(15, 280, 113, 15);
      panel.add(lblNewLabel_4);
      
      
      
      
      //맛집의 정보들이 나열되는 테이블
      table = new JTable();
      String[] columnName={"음식분류","가게이름","대표메뉴","지역","평점"};

      
      table_1=new JTable(new DefaultTableModel(columnName, 0));
      table_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
      table_1.setEnabled(false);
      table_1.getTableHeader().setReorderingAllowed(false);
      table_1.getTableHeader().setResizingAllowed(false);
      
      sp=new JScrollPane(table_1);
      sp.setBounds(152, 34, 620, 357);
      contentPane.add(sp);
      
      
      
      
      //버튼 생성 및 클릭시 작동하는 코드
      
      //빠르게 검색 버튼 클릭시 통합검색 작동코드 실행
      JButton btnNewButton = new JButton("빠른 통합검색");
      btnNewButton.setBackground(new Color(234, 234, 234));
      btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            selectSearch.setVisible(true);   
            
            List<MatDTO> matList=MatDAOImpl.getDAO().selectSearch(selectSearch.search);
            
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            
            for(int i=model.getRowCount();i>0;i--) {
               model.removeRow(0);
            }
            
            for(MatDTO mat : matList) {
               Vector<Object> matData=new Vector<>();
               matData.add(mat.getCategory());
               matData.add(mat.getName());
               matData.add(mat.getMenu());
               matData.add(mat.getLocation());
               matData.add(mat.getReview());
               model.addRow(matData);
            }   
         }
      });
      btnNewButton.setBounds(15, 139, 113, 23);
      panel.add(btnNewButton);
      
      
      
      //음식분류로! 버튼 클릭시 음식분류별로 검색해주는 코드 실행
      JButton btnNewButton_1 = new JButton("음식분류 검색");
      btnNewButton_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            selectCategory.setVisible(true);
            
            List<MatDTO> matList=MatDAOImpl.getDAO().selectCategory(selectCategory.category);
            
            if(matList.isEmpty()) JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
            
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            
            for(int i=model.getRowCount();i>0;i--) model.removeRow(0);
            
            for(MatDTO mat : matList) {
               Vector<Object> matData=new Vector<>();
               matData.add(mat.getCategory());
               matData.add(mat.getName());
               matData.add(mat.getMenu());
               matData.add(mat.getLocation());
               matData.add(mat.getReview());
               model.addRow(matData);
            }
         }
      });
      btnNewButton_1.setBounds(15, 199, 113, 23);
      panel.add(btnNewButton_1);
      
      
      //평점으로! 버튼 클릭시 평점별로 검색하는 코드 실행
      JButton btnNewButton_2_1 = new JButton("평점 검색");
      btnNewButton_2_1.setBackground(new Color(234, 234, 234));
      btnNewButton_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      btnNewButton_2_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            selectReview.setVisible(true);

            List<MatDTO> matList=MatDAOImpl.getDAO().selectReview(selectReview.review);
            
            if(matList.isEmpty()) JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
            
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            
            for(int i=model.getRowCount();i>0;i--) model.removeRow(0);
            
            for(MatDTO mat : matList) {
               Vector<Object> matData=new Vector<>();
               matData.add(mat.getCategory());
               matData.add(mat.getName());
               matData.add(mat.getMenu());
               matData.add(mat.getLocation());
               matData.add(mat.getReview());
               model.addRow(matData);
            }
         }
      });
      btnNewButton_2_1.setBounds(15, 229, 113, 23);
      panel.add(btnNewButton_2_1);
      
      
      //지역별로! 버튼 클릭시 지역별로 검색하는 코드 실행
      JButton btnNewButton_1_1 = new JButton("지역별 검색");
      btnNewButton_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            selectLocation.setVisible(true);
                  
            List<MatDTO> matList=MatDAOImpl.getDAO().selectLocation(selectLocation.location);
                  
            if(matList.isEmpty()) JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
                  
            DefaultTableModel model=(DefaultTableModel)table.getModel();
                  
            for(int i=model.getRowCount();i>0;i--) model.removeRow(0);
                  
            for(MatDTO mat : matList) {
               Vector<Object> matData=new Vector<>();
               matData.add(mat.getCategory());
               matData.add(mat.getName());
               matData.add(mat.getMenu());
               matData.add(mat.getLocation());
               matData.add(mat.getReview());
               model.addRow(matData);
            }
         }
      });
      btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      btnNewButton_1_1.setBounds(15, 169, 113, 23);
      panel.add(btnNewButton_1_1);
      
      
      //상세검색 버튼 클릭시 가게이름으로 상세정보를 찾아주는 코드 실행
      JButton btnNewButton_2_1_1 = new JButton("상세정보 보기");
      btnNewButton_2_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_2_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            infoSearch.setVisible(true);

            List<MatDTO> matList=MatDAOImpl.getDAO().info(infoSearch.infoSearch);
            
            DefaultTableModel model=(DefaultTableModel)info.table.getModel();
            
            for(int i=model.getRowCount();i>0;i--) model.removeRow(0);
            
            for(MatDTO mat : matList) {
               Vector<Object> matData=new Vector<>();
               matData.add(mat.getName());
               matData.add(mat.getAddress());
               matData.add(mat.getPhone());
               matData.add(mat.getMenu());
               matData.add(mat.getPrice());
               matData.add(mat.getReview());
               matData.add(mat.getCategory());
               model.addRow(matData);
            }
            
            info.setVisible(true);
         }
      });
      btnNewButton_2_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      btnNewButton_2_1_1.setBounds(15, 299, 113, 23);
      panel.add(btnNewButton_2_1_1);
      
      
      
      //상세검색 버튼 클릭시 가게이름으로 상세정보를 찾아주는 코드 실행
      JButton btnNewButton_2_2 = new JButton("맛집관리");
      btnNewButton_2_2.setBackground(new Color(234, 234, 234));
      btnNewButton_2_2.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      btnNewButton_2_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            editMat.setVisible(true);
            
         }
      });
      btnNewButton_2_2.setBounds(15, 364, 113, 23);
      panel.add(btnNewButton_2_2);
      
      JSeparator separator = new JSeparator();
      separator.setForeground(new Color(229, 229, 229));
      separator.setBounds(15, 353, 113, 1);
      panel.add(separator);
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBounds(152, 5, 620, 24);
      contentPane.add(textArea_1);
      
      
      
      //처음 프로그램 생성이 되었을 때 ORACLE에 저장되어 있는 맛집 리스트 전부 출력
      displayAll();
         
   }
      
   
   
   
   //ORACLE내에 저장된 모든 맛집을 출력해주는 메소드
   //저장된 맛집정보가 없을 경우 '저장된 맛집 없음.' 메세지 출력
   public void displayAll() {
      List<MatDTO> matList=MatDAOImpl.getDAO().selectAll();

      if(matList.isEmpty()) {
         JOptionPane.showMessageDialog(this, "저장된 맛집 없음.");
         return;
      }
      
      DefaultTableModel model=(DefaultTableModel)table_1.getModel();
   
      for(MatDTO mat : matList) {
         Vector<Object> matData=new Vector<>();
         matData.add(mat.getCategory());
         matData.add(mat.getName());
         matData.add(mat.getMenu());
         matData.add(mat.getLocation());
         matData.add(mat.getReview());
      
         model.addRow(matData);
      }
   }
}