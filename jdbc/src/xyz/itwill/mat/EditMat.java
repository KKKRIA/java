package xyz.itwill.mat;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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

      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      setTitle("맛집 관리");
      setBounds(100, 100, 510, 460);
      getContentPane().setLayout(null);
      
      
      //버튼들 및 클릭시 작동되는 명령들
      okButton = new JButton("맛집추가");
      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      okButton.setFont(new Font("굴림", Font.PLAIN, 11));
      okButton.setActionCommand("OK");
      okButton.setBounds(382, 33, 97, 23);
      getContentPane().add(okButton);
      
      okButton_1 = new JButton("맛집수정");
      okButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      okButton_1.setFont(new Font("굴림", Font.PLAIN, 11));
      okButton_1.setActionCommand("OK");
      okButton_1.setBounds(382, 66, 97, 23);
      getContentPane().add(okButton_1);
      
      okButton_1_1 = new JButton("맛집삭제");
      okButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      okButton_1_1.setFont(new Font("굴림", Font.PLAIN, 11));
      okButton_1_1.setActionCommand("OK");
      okButton_1_1.setBounds(382, 99, 97, 23);
      getContentPane().add(okButton_1_1);
      
      
      
      
      //라벨들
      lblNewLabel = new JLabel("가게 이름");
      lblNewLabel.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel.setBounds(12, 20, 57, 15);
      getContentPane().add(lblNewLabel);
      
      lblNewLabel_1 = new JLabel("대표메뉴");
      lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel_1.setBounds(12, 68, 57, 15);
      getContentPane().add(lblNewLabel_1);
      
      lblNewLabel_2 = new JLabel("음식분류");
      lblNewLabel_2.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel_2.setBounds(12, 116, 57, 15);
      getContentPane().add(lblNewLabel_2);
      
      lblNewLabel_3 = new JLabel("가격");
      lblNewLabel_3.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel_3.setBounds(12, 164, 57, 15);
      getContentPane().add(lblNewLabel_3);
      
      lblNewLabel_4 = new JLabel("평점");
      lblNewLabel_4.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel_4.setBounds(12, 212, 57, 15);
      getContentPane().add(lblNewLabel_4);
      
      lblNewLabel_5 = new JLabel("가게 연락처");
      lblNewLabel_5.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel_5.setBounds(12, 260, 70, 15);
      getContentPane().add(lblNewLabel_5);
      
      lblNewLabel_6 = new JLabel("상세주소");
      lblNewLabel_6.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel_6.setBounds(12, 308, 57, 15);
      getContentPane().add(lblNewLabel_6);
      
      lblNewLabel_7 = new JLabel("동 이름");
      lblNewLabel_7.setFont(new Font("돋움", Font.BOLD, 12));
      lblNewLabel_7.setBounds(12, 356, 57, 15);
      getContentPane().add(lblNewLabel_7);
      
      
      
      
      //텍스트 필드들
      nameTF = new JTextField();
      nameTF.setBounds(22, 37, 137, 21);
      getContentPane().add(nameTF);
      nameTF.setColumns(10);
      
      menuTF = new JTextField();
      menuTF.setColumns(10);
      menuTF.setBounds(22, 83, 137, 21);
      getContentPane().add(menuTF);
      
      categoryTF = new JTextField();
      categoryTF.setColumns(10);
      categoryTF.setBounds(22, 133, 137, 21);
      getContentPane().add(categoryTF);
      
      priceTF = new JTextField();
      priceTF.setColumns(10);
      priceTF.setBounds(22, 181, 137, 21);
      getContentPane().add(priceTF);
      
      reviewTF = new JTextField();
      reviewTF.setColumns(10);
      reviewTF.setBounds(22, 229, 137, 21);
      getContentPane().add(reviewTF);
      
      phoneTF = new JTextField();
      phoneTF.setColumns(10);
      phoneTF.setBounds(22, 277, 137, 21);
      getContentPane().add(phoneTF);
      
      addressTF = new JTextField();
      addressTF.setColumns(10);
      addressTF.setBounds(22, 325, 457, 21);
      getContentPane().add(addressTF);
      
      locationTF = new JTextField();
      locationTF.setColumns(10);
      locationTF.setBounds(22, 377, 137, 21);
      getContentPane().add(locationTF);
      
      
      //부가 설명들
      JLabel lblNewLabel_8 = new JLabel("-특수문자 사용 금지");
      lblNewLabel_8.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8.setBounds(79, 23, 304, 15);
      getContentPane().add(lblNewLabel_8);
      
      JLabel lblNewLabel_8_1 = new JLabel("-한글로 작성,특수문자 사용 금지");
      lblNewLabel_8_1.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8_1.setBounds(79, 68, 304, 15);
      getContentPane().add(lblNewLabel_8_1);
      
      JLabel lblNewLabel_8_2 = new JLabel("-한식, 양식, 중식, 일식, 분식 중 택 1");
      lblNewLabel_8_2.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8_2.setBounds(79, 116, 304, 15);
      getContentPane().add(lblNewLabel_8_2);
      
      JLabel lblNewLabel_8_3 = new JLabel("-ex) 12,000");
      lblNewLabel_8_3.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8_3.setBounds(79, 164, 304, 15);
      getContentPane().add(lblNewLabel_8_3);
      
      JLabel lblNewLabel_8_4 = new JLabel("-5,4,3,2,1 중 택 1");
      lblNewLabel_8_4.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8_4.setBounds(79, 212, 304, 15);
      getContentPane().add(lblNewLabel_8_4);
      
      JLabel lblNewLabel_8_5 = new JLabel(" -ex)02-1234-1234");
      lblNewLabel_8_5.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8_5.setBounds(79, 260, 304, 15);
      getContentPane().add(lblNewLabel_8_5);
      
      JLabel lblNewLabel_8_6 = new JLabel("-특수문자 사용 금지");
      lblNewLabel_8_6.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8_6.setBounds(79, 308, 304, 15);
      getContentPane().add(lblNewLabel_8_6);
      
      JLabel lblNewLabel_8_7 = new JLabel("-강남구 내 동입력 ex)역삼동");
      lblNewLabel_8_7.setFont(new Font("굴림", Font.PLAIN, 11));
      lblNewLabel_8_7.setBounds(79, 356, 304, 15);
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