package Ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Deflater;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.cj.api.mysqla.result.Resultset;
import com.mysql.cj.api.xdevapi.Result;
import com.mysql.cj.jdbc.PreparedStatement;
import com.mysql.cj.xdevapi.JsonParser;

public class Bai1 extends JFrame {
	
	private JPanel contentPane;
	private JTextField hoTen;
	private JTextField address;
	private JTextField email;
	private JTable tb_Student;
	
	List<Student> studentList = new ArrayList<>();
	DefaultTableModel model;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1 frame = new Bai1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	private void insertIntoDB(Student std) throws SQLException {
		Connection conn = null;
		PreparedStatement stm = null;
		try {
			//open connection to db
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?serverTimezone=UTC","root","");
			
			//query
			String sql = "insert into students(hoTen, address, email) values('"+std.hoTen+"','"+std.address+"','"+std.email+"')";
			stm = (PreparedStatement) conn.prepareStatement(sql);
			stm.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//close db
			try {
				stm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} 
	}
	
	//lay data
	private void loadDatabase() throws SQLException {
		studentList.clear(); //clear data in studentList
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?serverTimezone=UTC","root","");
			
			String getData = "select * from students";
			
			stm = conn.createStatement();
			
			ResultSet resul = stm.executeQuery(getData);
			
			while (resul.next()) {
				Student std1 = new Student(
						resul.getInt("id"), 
						resul.getString("hoTen"), 
						resul.getString("address"), 
						resul.getString("email"));
				studentList.add(std1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			conn.close();
			stm.close();
		}
	}
	
	//lay data
	private void showData() {
		model.setRowCount(0); //Xoa toan bo du lieu trong bang
		
		//add data
		for (int i = 0; i < studentList.size(); i++) {
			model.addRow(new String [] {
					studentList.get(i).hoTen, 
					studentList.get(i).address, 
					studentList.get(i).email
					}
			);
		}
	}

	public Bai1() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Th\u00F4ng tin sinh vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lb_hoTen = new JLabel("H\u1ECD t\u00EAn");
		lb_hoTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb_hoTen.setHorizontalAlignment(SwingConstants.LEFT);
		
		hoTen = new JTextField();
		hoTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hoTen.setColumns(10);
		
		JLabel lb_address = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lb_address.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 15));
		address.setColumns(10);
		
		JLabel lb_email = new JLabel("Email");
		lb_email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setColumns(10);
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ad_hoTen = hoTen.getText().toString();
				String ad_address = address.getText().toString();
				String ad_email = email.getText().toString();
				
				Student std = new Student(ad_hoTen, ad_address, ad_email);
				studentList.add(std);
				
				model.addRow(new String [] {ad_hoTen, ad_address, ad_email});
				
				System.out.println("Thong tin sinh vien: "+ad_hoTen+"; "+ad_address+", "+ad_email);
				try {
					insertIntoDB(std);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hoTen.setText("");
				address.setText("");
				email.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addContainerGap()
								.addComponent(lb_hoTen, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(18))
							.addGroup(gl_panel.createSequentialGroup()
								.addContainerGap()
								.addComponent(lb_address)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lb_email)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(hoTen, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(40)
							.addComponent(btnSave)
							.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
							.addComponent(btnReset)
							.addGap(66))
						.addComponent(address)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(email, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))
					.addGap(22))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(hoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_hoTen, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_address))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_email))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnReset)
						.addComponent(btnSave))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		tb_Student = new JTable();
		tb_Student.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tb_Student.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Ho ten","Dia chi","Email"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
		tb_Student.getColumnModel().getColumn(0).setPreferredWidth(230);
		tb_Student.getColumnModel().getColumn(1).setPreferredWidth(231);
		tb_Student.getColumnModel().getColumn(2).setPreferredWidth(161);
		tb_Student.setToolTipText("");
		tb_Student.setBackground(UIManager.getColor("Table.highlight"));
		contentPane.add(tb_Student, BorderLayout.CENTER);
		
		
		model = (DefaultTableModel) tb_Student.getModel();
		
		loadDatabase(); //lay data
		showData(); //lay data
	}

}
