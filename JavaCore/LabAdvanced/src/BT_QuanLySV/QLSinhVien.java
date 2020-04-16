package BT_QuanLySV;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class QLSinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField hoTen;
	private JTextField gioiTinh;
	private JTextField rollNo;
	private JTextField email;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSinhVien frame = new QLSinhVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void search(String rollNo) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC","root","");
			
			stm = conn.createStatement();
			
			String sql = "select * from students where rollno = '"+rollNo+"'";
			
			ResultSet result = stm.executeQuery(sql);
			
			while (result.next()) {
				hoTen.setText(result.getString("fullname"));
				gioiTinh.setText(result.getString("gender"));
				email.setText(result.getString("email"));
				address.setText(result.getString("address"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {	
			stm.close();
			conn.close();
		}
	}
	
	
	/**
	 * Create the frame.
	 */
	public QLSinhVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_hoTen = new JLabel("H\u1ECD t\u00EAn");
		lb_hoTen.setBounds(21, 23, 46, 14);
		contentPane.add(lb_hoTen);
		
		JLabel lb_gioiTinh = new JLabel("Gi\u1EDBi t\u00EDnh");
		lb_gioiTinh.setBounds(21, 74, 61, 14);
		contentPane.add(lb_gioiTinh);
		
		JLabel lb_rollNo = new JLabel("Roll no");
		lb_rollNo.setBounds(21, 127, 46, 14);
		contentPane.add(lb_rollNo);
		
		JLabel lb_email = new JLabel("Email");
		lb_email.setBounds(21, 181, 46, 14);
		contentPane.add(lb_email);
		
		JLabel lb_address = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lb_address.setBounds(21, 235, 46, 14);
		contentPane.add(lb_address);
		
		hoTen = new JTextField();
		hoTen.setBounds(105, 20, 145, 20);
		contentPane.add(hoTen);
		hoTen.setColumns(10);
		
		gioiTinh = new JTextField();
		gioiTinh.setBounds(105, 71, 145, 20);
		contentPane.add(gioiTinh);
		gioiTinh.setColumns(10);
		
		rollNo = new JTextField();
		rollNo.setBounds(105, 124, 145, 20);
		contentPane.add(rollNo);
		rollNo.setColumns(10);
		
		email = new JTextField();
		email.setBounds(105, 178, 145, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		address = new JTextField();
		address.setBounds(105, 232, 145, 20);
		contentPane.add(address);
		address.setColumns(10);
		
		JButton btn_update = new JButton("Update");
		btn_update.setEnabled(false);
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fullname = hoTen.getText().toString();
				String gender = gioiTinh.getText().toString();
				String add = address.getText().toString();
				String email1 = email.getText().toString();
				String rollno = rollNo.getText().toString();
				
				Connection conn = null;
				PreparedStatement stm = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC","root","");
					
					String sql = "UPDATE students SET fullname=?,gender=?,email=?,address=? WHERE rollno = ?";
					
					stm = conn.prepareStatement(sql);
					stm.setString(1, fullname);
					stm.setString(2, gender);
					stm.setString(3, email1);
					stm.setString(4, add);
					stm.setString(5, rollno);
					stm.execute();
				} catch (Exception ex) {
					// TODO: handle exception
					ex.printStackTrace();
				}finally {	
					try {
						stm.close();
						conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btn_update.setBounds(49, 283, 89, 23);
		contentPane.add(btn_update);
		
		
		JButton btn_search = new JButton("Search");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String StrRollNo = rollNo.getText().toString();
				if(StrRollNo.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Phai nhap RollNo", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
				}else {
					try {
						search(StrRollNo);
						btn_update.setEnabled(true);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
					
			}
		});
		btn_search.setBounds(260, 19, 89, 23);
		contentPane.add(btn_search);
		
		JButton btn_reset = new JButton("Reset");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hoTen.setText("");
				gioiTinh.setText("");
				rollNo.setText("");
				email.setText("");
				address.setText("");
				btn_update.setEnabled(false);
			}
		});
		btn_reset.setBounds(208, 283, 89, 23);
		contentPane.add(btn_reset);
	}
}
