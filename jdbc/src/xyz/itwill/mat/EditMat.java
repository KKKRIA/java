package xyz.itwill.mat;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class EditMat extends JDialog {
   private static final long serialVersionUID = 1L;
   
   public static final int ADD = 1;
   public static final int UPDATE = 2;
   public static final int UPDATE_CHANGE = 3;
   public static final int DELETE = 4;
   
   //사용하는 변수들 선언
   JTextField nameTF,menuTF,categoryTF,priceTF,reviewTF,phoneTF,addressTF,locationTF;
   JButton okButton,okButton_1,okButton_1_1;
   JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7;


   
   public EditMat(JFrame frame) {
      super(frame, true);
      getContentPane().setBackground(new Color(255, 255, 255));
      getContentPane().setFont(new Font("맑은 고딕", Font.PLAIN, 12));

      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      setTitle("맛집 관리");
      setBounds(100, 100, 603, 478);
      
      
      //버튼들 및 클릭시 작동되는 명령들
      okButton = new JButton("맛집추가");
      okButton.setBackground(new Color(234, 234, 234));
      okButton.setBounds(462, 27, 97, 23);
      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      getContentPane().setLayout(null);
      okButton.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      okButton.setActionCommand("OK");
      getContentPane().add(okButton);
      
      okButton_1 = new JButton("맛집수정");
      okButton_1.setBackground(new Color(234, 234, 234));
      okButton_1.setBounds(462, 60, 97, 23);
      okButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      okButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      okButton_1.setActionCommand("OK");
      getContentPane().add(okButton_1);
      
      okButton_1_1 = new JButton("맛집삭제");
      okButton_1_1.setBackground(new Color(234, 234, 234));
      okButton_1_1.setBounds(462, 93, 97, 23);
      okButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      okButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      okButton_1_1.setActionCommand("OK");
      getContentPane().add(okButton_1_1);
      
      
      
      
      //라벨들
      lblNewLabel = new JLabel("■ 가게 이름");
      lblNewLabel.setBounds(22, 27, 100, 15);
      lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel);
      
      lblNewLabel_1 = new JLabel("■ 대표메뉴");
      lblNewLabel_1.setBounds(22, 76, 100, 15);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_1);
      
      lblNewLabel_2 = new JLabel("■ 음식분류");
      lblNewLabel_2.setBounds(22, 125, 100, 15);
      lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_2);
      
      lblNewLabel_3 = new JLabel("■ 가격");
      lblNewLabel_3.setBounds(22, 174, 100, 15);
      lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_3);
      
      lblNewLabel_4 = new JLabel("■ 평점");
      lblNewLabel_4.setBounds(22, 223, 100, 15);
      lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_4);
      
      lblNewLabel_5 = new JLabel("■ 전화번호");
      lblNewLabel_5.setBounds(22, 272, 100, 15);
      lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_5);
      
      lblNewLabel_6 = new JLabel("■ 상세주소");
      lblNewLabel_6.setBounds(22, 321, 100, 15);
      lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_6);
      
      lblNewLabel_7 = new JLabel("■ 동 이름");
      lblNewLabel_7.setBounds(22, 370, 100, 15);
      lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_7);
      
      
      
      
      //텍스트 필드들
      nameTF = new JTextField();
      nameTF.setBounds(115, 24, 318, 21);
      nameTF.setBackground(new Color(255, 255, 255));
      getContentPane().add(nameTF);
      nameTF.setColumns(10);
      
      menuTF = new JTextField();
      menuTF.setBounds(115, 73, 318, 21);
      menuTF.setBackground(new Color(255, 255, 255));
      menuTF.setColumns(10);
      getContentPane().add(menuTF);
      
      categoryTF = new JTextField();
      categoryTF.setBounds(115, 122, 318, 21);
      categoryTF.setBackground(new Color(255, 255, 255));
      categoryTF.setColumns(10);
      getContentPane().add(categoryTF);
      
      priceTF = new JTextField();
      priceTF.setBounds(115, 171, 318, 21);
      priceTF.setBackground(new Color(255, 255, 255));
      priceTF.setColumns(10);
      getContentPane().add(priceTF);
      
      reviewTF = new JTextField();
      reviewTF.setBounds(115, 220, 318, 21);
      reviewTF.setBackground(new Color(255, 255, 255));
      reviewTF.setColumns(10);
      getContentPane().add(reviewTF);
      
      phoneTF = new JTextField();
      phoneTF.setBounds(115, 269, 318, 21);
      phoneTF.setBackground(new Color(255, 255, 255));
      phoneTF.setColumns(10);
      getContentPane().add(phoneTF);
      
      addressTF = new JTextField();
      addressTF.setBounds(116, 318, 318, 21);
      addressTF.setBackground(new Color(255, 255, 255));
      addressTF.setColumns(10);
      getContentPane().add(addressTF);
      
      locationTF = new JTextField();
      locationTF.setBounds(114, 367, 318, 21);
      locationTF.setBackground(new Color(255, 255, 255));
      locationTF.setColumns(10);
      getContentPane().add(locationTF);
      
      
      //부가 설명들
      JLabel lblNewLabel_8 = new JLabel("* 특수문자 사용 금지");
      lblNewLabel_8.setBounds(115, 46, 304, 15);
      lblNewLabel_8.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8);
      
      JLabel lblNewLabel_8_1 = new JLabel("* 한글로 작성,특수문자 사용 금지");
      lblNewLabel_8_1.setBounds(115, 95, 304, 15);
      lblNewLabel_8_1.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_1);
      
      JLabel lblNewLabel_8_2 = new JLabel("* 한식, 양식, 중식, 일식, 분식 중 택 1");
      lblNewLabel_8_2.setBounds(115, 143, 304, 15);
      lblNewLabel_8_2.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_2);
      
      JLabel lblNewLabel_8_3 = new JLabel("* ex) 12,000");
      lblNewLabel_8_3.setBounds(115, 191, 304, 15);
      lblNewLabel_8_3.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_3);
      
      JLabel lblNewLabel_8_4 = new JLabel("* 5,4,3,2,1 중 택 1");
      lblNewLabel_8_4.setBounds(115, 242, 304, 15);
      lblNewLabel_8_4.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_4);
      
      JLabel lblNewLabel_8_5 = new JLabel("* ex)02-1234-1234");
      lblNewLabel_8_5.setBounds(111, 290, 304, 15);
      lblNewLabel_8_5.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_5);
      
      JLabel lblNewLabel_8_6 = new JLabel("* 특수문자 사용 금지");
      lblNewLabel_8_6.setBounds(115, 340, 304, 15);
      lblNewLabel_8_6.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_6);
      
      JLabel lblNewLabel_8_7 = new JLabel("* 강남구 내 동입력 ex)역삼동");
      lblNewLabel_8_7.setBounds(115, 389, 304, 15);
      lblNewLabel_8_7.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_7);
      
      initialize();
   }

   
   
   //모든 JTextField 컴퍼넌트를 비활성화 처리하는 메소드
   public void initialize() {
      nameTF.setEditable(false);
      menuTF.setEditable(false);
      categoryTF.setEditable(false);
      priceTF.setEditable(false);
      reviewTF.setEditable(false);
      phoneTF.setEditable(false);
      addressTF.setEditable(false);
      locationTF.setEditable(false);
   }
/*
   //이벤트에 따른 JTextField 컴퍼넌트의 활성화 상태 변경
   public void setEditable(int n) {
      switch (n) {
      case ADD:
         noTF.setEditable(true);
         nameTF.setEditable(true);
         phoneTF.setEditable(true);
         addressTF.setEditable(true);
         birthdayTF.setEditable(true);
         break;
      case DELETE:
         noTF.setEditable(true);
         break;
      case UPDATE:
         noTF.setEditable(true);
         break;
      case UPDATE_CHANGE:
         noTF.setEditable(false);
         nameTF.setEditable(true);
         phoneTF.setEditable(true);
         addressTF.setEditable(true);
         birthdayTF.setEditable(true);
         break;
      case SEARCH:
         nameTF.setEditable(true);
         break;
      case NONE:
         noTF.setEditable(false);
         nameTF.setEditable(false);
         phoneTF.setEditable(false);
         addressTF.setEditable(false);
         birthdayTF.setEditable(false);
      }
   }

   //이벤트에 따른 JTextField 컴퍼넌트와 JButton 컴퍼넌트의 활성화 상태 변경
   public void setEnable(int n) {
      addB.setEnabled(false);
      deleteB.setEnabled(false);
      updateB.setEnabled(false);
      searchB.setEnabled(false);

      switch (n) {
      case ADD:
         addB.setEnabled(true);
         setEditable(ADD);
         cmd = ADD;
         break;
      case DELETE:
         deleteB.setEnabled(true);
         setEditable(DELETE);
         cmd = DELETE;
         break;
      case UPDATE:
         updateB.setEnabled(true);
         setEditable(UPDATE);
         cmd = UPDATE;
         break;         
      case UPDATE_CHANGE:
         updateB.setEnabled(true);
         setEditable(UPDATE_CHANGE);
         cmd = UPDATE_CHANGE;
         break;         
      case SEARCH:
         searchB.setEnabled(true);
         setEditable(SEARCH);
         cmd = SEARCH;
         break;
      case NONE:
         addB.setEnabled(true);
         deleteB.setEnabled(true);
         updateB.setEnabled(true);
         searchB.setEnabled(true);
      }
   }

   //JTextField 컴퍼넌트의 입력값 초기화
   public void clear() {
      noTF.setText("");
      nameTF.setText("");
      phoneTF.setText("");
      addressTF.setText("");
      birthdayTF.setText("");
   }

   //모든 컴퍼넌트의 상태 초기화
   public void initDisplay() {
      setEnable(NONE);
      clear();
      cmd = NONE;
      initialize();      
   }
   */
}