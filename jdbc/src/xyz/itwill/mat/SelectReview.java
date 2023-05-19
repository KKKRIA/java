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

public class SelectReview extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	public SelectReview(JFrame frame) {
		super(frame, true);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		
		setTitle("아따 배고프다잉 빨리 검색해라");
		setBounds(100, 100, 450, 142);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 103);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("평점을 선택하세요.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("HY견고딕", Font.BOLD, 15));
		lblNewLabel_1.setBounds(17, 10, 151, 15);
		contentPanel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("5점");
		btnNewButton.setBounds(30, 35, 50, 46);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4점");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(110, 35, 50, 46);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3점");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(190, 35, 50, 46);
		contentPanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("2점");
		btnNewButton_1_1_1.setBounds(270, 35, 50, 46);
		contentPanel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("1점");
		btnNewButton_1_1_1_1.setBounds(350, 35, 50, 46);
		contentPanel.add(btnNewButton_1_1_1_1);
	}
}
