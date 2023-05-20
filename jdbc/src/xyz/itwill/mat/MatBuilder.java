package xyz.itwill.mat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JProgressBar;

public class MatBuilder extends JFrame {

	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTable table;
	private JScrollPane sp;

	SelectSearch selectSearch=new SelectSearch(this);
	SelectLocation selectLocation=new SelectLocation(this);
	SelectCategory selectCategory=new SelectCategory(this);
	SelectReview selectReview=new SelectReview(this);
	Info info=new Info(this);
	
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
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 12));
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
		btnNewButton.setBounds(12, 116, 101, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("음식분류로!");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectCategory.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(12, 227, 101, 23);
		panel.add(btnNewButton_1);
		
		
		JButton btnNewButton_2_1 = new JButton("평점으로!");
		btnNewButton_2_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectReview.setVisible(true);
			}
		});
		
		btnNewButton_2_1.setBounds(12, 260, 101, 23);
		panel.add(btnNewButton_2_1);
		
		
		
		JButton btnNewButton_2_1_1 = new JButton("상세정보");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
			}
		});
		btnNewButton_2_1_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_2_1_1.setBounds(12, 330, 101, 23);
		panel.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("골라 골라");
		lblNewLabel_2.setFont(new Font("돋움", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(30, 164, 64, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("들여다 보고");
		lblNewLabel_3.setFont(new Font("돋움", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(24, 293, 76, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("빨리 찾아가");
		lblNewLabel_4.setFont(new Font("돋움", Font.BOLD, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(21, 311, 82, 15);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1_1 = new JButton("지역별로!");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				selectLocation.setVisible(true);
				
				List<MatDTO> matList=MatDAOImpl.getDAO().selectLocation(selectLocation.location);
				
				if(matList.isEmpty()) {JOptionPane.showMessageDialog(null, "검색 결과가 없다.");
				
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
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(12, 194, 101, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_2 = new JButton("맛집관리");
		btnNewButton_2_2.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2.setBounds(12, 365, 101, 23);
		panel.add(btnNewButton_2_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(142, 5, 630, 24);
		contentPane.add(textArea_1);
		
	
		
		
		table = new JTable();
		String[] columnName={"음식분류","가게이름","대표메뉴","지역","평점"};

		
		table=new JTable(new DefaultTableModel(columnName, 0));
		table.setEnabled(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		
		sp=new JScrollPane(table);
		sp.setBounds(142, 34, 630, 382);
		contentPane.add(sp);
		
		displayAll();
			
	}
		
	
	
	
	public void displayAll() {
		List<MatDTO> matList=MatDAOImpl.getDAO().selectAll();

		if(matList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "저장된 맛집 없음.");
			return;
		}
		
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		
		
	
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
