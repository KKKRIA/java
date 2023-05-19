package xyz.itwill.mat;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditMat extends JDialog {

	public static final int NONE = 0;
	public static final int ADD = 1;
	public static final int DELETE = 2;
	public static final int UPDATE = 3;
	public static final int UPDATE_CHANGE = 4;
	
	
	private final JPanel contentPanel = new JPanel();
	private JTextField nameTF;
	private JTextField catagoryTF;
	private JTextField menuTF;
	private JTextField locationTF;
	private JTextField reviewTF;
	private JTextField addressTF;
	private JTextField priceTF;
	private JTextField phoneTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EditMat dialog = new EditMat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EditMat() {
		setBounds(100, 100, 554, 442);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 538, 20);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		{
			nameTF = new JTextField();
			nameTF.setBounds(115, 30, 247, 28);
			getContentPane().add(nameTF);
			nameTF.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("가게이름");
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(40, 30, 63, 28);
			getContentPane().add(lblNewLabel);
		}
		{
			catagoryTF = new JTextField();
			catagoryTF.setColumns(10);
			catagoryTF.setBounds(115, 73, 247, 28);
			getContentPane().add(catagoryTF);
		}
		{
			JLabel lblNewLabel = new JLabel("대표메뉴");
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(40, 114, 63, 28);
			getContentPane().add(lblNewLabel);
		}
		{
			menuTF = new JTextField();
			menuTF.setColumns(10);
			menuTF.setBounds(115, 116, 247, 28);
			getContentPane().add(menuTF);
		}
		{
			JLabel lblNewLabel = new JLabel("지역");
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(40, 157, 63, 28);
			getContentPane().add(lblNewLabel);
		}
		{
			locationTF = new JTextField();
			locationTF.setColumns(10);
			locationTF.setBounds(115, 159, 247, 28);
			getContentPane().add(locationTF);
		}
		{
			JLabel lblNewLabel = new JLabel("평점");
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(40, 200, 63, 28);
			getContentPane().add(lblNewLabel);
		}
		{
			reviewTF = new JTextField();
			reviewTF.setColumns(10);
			reviewTF.setBounds(115, 202, 247, 28);
			getContentPane().add(reviewTF);
		}
		{
			JLabel lblNewLabel = new JLabel("상세주소");
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(40, 243, 63, 28);
			getContentPane().add(lblNewLabel);
		}
		{
			addressTF = new JTextField();
			addressTF.setColumns(10);
			addressTF.setBounds(115, 245, 247, 28);
			getContentPane().add(addressTF);
		}
		{
			JLabel lblNewLabel = new JLabel("금액");
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(40, 286, 63, 28);
			getContentPane().add(lblNewLabel);
		}
		{
			priceTF = new JTextField();
			priceTF.setColumns(10);
			priceTF.setBounds(115, 288, 247, 28);
			getContentPane().add(priceTF);
		}
		{
			phoneTF = new JTextField();
			phoneTF.setColumns(10);
			phoneTF.setBounds(115, 331, 247, 28);
			getContentPane().add(phoneTF);
		}
		{
			JLabel lblNewLabel = new JLabel("연락처");
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(40, 329, 63, 28);
			getContentPane().add(lblNewLabel);
		}
		{
			JButton btnNewButton = new JButton("맛집추가");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nameTemp=nameTF.getText();//JTextField 컴퍼넌트의 입력값을 반환받아 저장
					if(nameTemp.equals("")) {
						JOptionPane.showInputDialog( this, "가게이름을 반드시 입력해 주세요.");
						//nameTemp.requestFocus();//JTextField 컴퍼넌트에 입력촛점을 제공하는 메소드
						return;
					}
					
				}
			});
			btnNewButton.setBounds(409, 32, 97, 23);
			getContentPane().add(btnNewButton);
			
		}
		{
			JButton btnNewButton = new JButton("정보수정");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
				}
			});
			btnNewButton.setBounds(409, 65, 97, 23);
			getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton = new JButton("삭제");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				}
			});
			btnNewButton.setBounds(409, 94, 97, 23);
			getContentPane().add(btnNewButton);
		}
		{
			JLabel lblNewLabel = new JLabel("음식분류");
			lblNewLabel.setBounds(40, 76, 56, 18);
			getContentPane().add(lblNewLabel);
			lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
		}
	}

}
