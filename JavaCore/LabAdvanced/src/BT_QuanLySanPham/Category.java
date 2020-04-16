package BT_QuanLySanPham;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Category extends JFrame {

	private JPanel contentPane;
	private JTextField categoryName;
	private JTable categoryTable;
	List<ListCategory> listCat = new ArrayList<>();
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Category frame = new Category();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Insert data to database
	private void insert(String name) {
		Connection conn = null;
		PreparedStatement stm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC","root","");
			
			String sql = "insert into categories (name) VALUES (?)";
			
			stm = conn.prepareStatement(sql);
			stm.setString(1, name);
			stm.execute(); 
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stm.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void loadData() {
		listCat.clear(); //Clear list
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");

			String getData = "select * from categories";

			stm = conn.createStatement();

			ResultSet resul = stm.executeQuery(getData);

			while (resul.next()) {
				ListCategory lct = new ListCategory(resul.getInt("id"), resul.getString("name"));
				listCat.add(lct);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				conn.close();
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void showData() {
		model.setRowCount(0); // Xoa toan bo du lieu trong bang

		// add data
		for (int i = 0; i < listCat.size(); i++) {
			model.addRow(new String[] { 
				String.valueOf(listCat.get(i).id), 
				listCat.get(i).name 
				});
		}
	}

	/**
	 * Create the frame.
	 */
	public Category() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Nhap thong tin danh muc", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 455, 111);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel categoryTitle = new JLabel("Ten danh muc");
		categoryTitle.setBounds(35, 31, 78, 14);
		panel.add(categoryTitle);
		
		categoryName = new JTextField();
		categoryName.setBounds(140, 28, 266, 20);
		panel.add(categoryName);
		categoryName.setColumns(10);
		
		JButton categoryAdd = new JButton("Them");
		categoryAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtName = categoryName.getText().toString();
				if (txtName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nhap ten danh muc can them",  "Thong bao", JOptionPane.INFORMATION_MESSAGE);
				}else {
					insert(txtName);
				}
				categoryName.setText("");
				loadData();
				showData();
			}
		});
		categoryAdd.setBounds(46, 77, 89, 23);
		panel.add(categoryAdd);
		
		JButton categoryEdit = new JButton("Sua");
		categoryEdit.setEnabled(false);
		categoryEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = categoryTable.getSelectedRow();
				ListCategory category = listCat.get(index);
				
				//update
				Connection conn = null;
				PreparedStatement stm = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");

					String sql = "update categories set name = ? where id = ?";

					stm = conn.prepareStatement(sql);
					stm.setString(1, categoryName.getText().toString());
					stm.setInt(2, category.getId());
					stm.execute();
				} catch (Exception ex) {
					// TODO: handle exception
				} finally {
					try {
						conn.close();
						stm.close();
					} catch (SQLException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				}
				//end update
				loadData();
				showData();
				categoryEdit.setEnabled(false);
				
			}
		});
		categoryEdit.setBounds(196, 77, 89, 23);
		panel.add(categoryEdit);
		
		JButton categoryDelete = new JButton("Xoa");
		categoryDelete.setEnabled(false);
		categoryDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = categoryTable.getSelectedRow();
				ListCategory category = listCat.get(index);
				
				//delete
				Connection conn = null;
				PreparedStatement stm = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");

					String sql = "delete from categories where id = ?";

					stm = conn.prepareStatement(sql);
					stm.setInt(1, category.getId());
					stm.execute();
				} catch (Exception ex) {
					// TODO: handle exception
				} finally {
					try {
						conn.close();
						stm.close();
					} catch (SQLException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				}
				//end delete
				loadData();
				showData();
				categoryName.setText("");
				categoryEdit.setEnabled(false);
			}
		});
		categoryDelete.setBounds(331, 77, 89, 23);
		panel.add(categoryDelete);
		
		categoryTable = new JTable();
		categoryTable.setToolTipText("");
		categoryTable.setBackground(Color.WHITE);
		categoryTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Caterory Name"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		categoryTable.getColumnModel().getColumn(0).setPreferredWidth(181);
		categoryTable.getColumnModel().getColumn(1).setPreferredWidth(441);
		categoryTable.setBounds(10, 121, 455, 200);
		contentPane.add(categoryTable);
		
		model = (DefaultTableModel)categoryTable.getModel();
		loadData();
		showData();
		
		categoryTable.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int index = categoryTable.getSelectedRow();
				ListCategory category = listCat.get(index);
				
				categoryName.setText(category.getName());
				categoryEdit.setEnabled(true);
				categoryDelete.setEnabled(true);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
