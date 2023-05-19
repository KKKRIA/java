package xyz.itwill.mat;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SelectLocation extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	
	
	String location = ""; 
	
	
	
	
	
	
	
	public SelectLocation(JFrame frame) {
		super(frame, true);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		 
		
		
		
		
		
		

		
		setTitle("아따 배고프다잉 빨리 검색해라");
		setBounds(100, 100, 553, 196);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 537, 157);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("지역을 선택하세요");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("HY견고딕", Font.BOLD, 15));
		lblNewLabel_1.setBounds(17, 10, 151, 15);
		contentPanel.add(lblNewLabel_1);
		
		JButton lButton1 = new JButton("신사");
		lButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="신사동";
				dispose();
				
			}
		});
		lButton1.setBounds(8, 35, 80, 46);
		contentPanel.add(lButton1);
		
		JButton btnNewButton_1 = new JButton("압구정");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="압구정동";
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(96, 35, 80, 46);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("청담");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="청담동";
				dispose();
				
			}
		});
		btnNewButton_1_1.setBounds(184, 35, 80, 46);
		contentPanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("논현");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="논현동";
				dispose();
				
			}
		});
		btnNewButton_1_1_1.setBounds(272, 35, 80, 46);
		contentPanel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("삼성");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="삼성동";
				dispose();
				
			}
		});
		btnNewButton_1_1_1_1.setBounds(360, 35, 80, 46);
		contentPanel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("역삼");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="역삼동";
				dispose();
				
			}
		});
		btnNewButton_1_1_1_1_1.setBounds(448, 35, 80, 46);
		contentPanel.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("도곡");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="도곡동";
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(8, 91, 80, 46);
		contentPanel.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("대치");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="대치동";
				dispose();
				
			}
		});
		btnNewButton_1_2.setBounds(96, 91, 80, 46);
		contentPanel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("개포");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="개포동";
				dispose();
				
			}
		});
		btnNewButton_1_1_2.setBounds(184, 91, 80, 46);
		contentPanel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("일원");
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="일원동";
				dispose();
				
			}
		});
		btnNewButton_1_1_1_2.setBounds(272, 91, 80, 46);
		contentPanel.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("수서");
		btnNewButton_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="수서동";
				dispose();
				
			}
		});
		btnNewButton_1_1_1_1_2.setBounds(360, 91, 80, 46);
		contentPanel.add(btnNewButton_1_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("세곡");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				location="세곡동";
				dispose();
				
			}
		});
		btnNewButton_1_1_1_1_1_1.setBounds(448, 91, 80, 46);
		contentPanel.add(btnNewButton_1_1_1_1_1_1);
	}
}
