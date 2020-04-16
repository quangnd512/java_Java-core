package BT_QuanLySanPham;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.nio.file.OpenOption;
import java.awt.event.ActionEvent;

public class Products extends JFrame {

	private JPanel contentPane;
	private JTable tableProduct;
	private JTextField name;
	private JTextField price;
	private JTextField description;
	
	List<ListCategory> listCat = new ArrayList<>();
	List<ListProduct> listPro = new ArrayList<>();
	DefaultTableModel model;

	
	private void loadCategoryData() {
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
	
	public void search(String strName) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC","root","");
			
			stm = conn.createStatement();
			
			String sql = "select * from products where name = '"+strName+"'";
			
			ResultSet result = stm.executeQuery(sql);
			
			while (result.next()) {
				name.setText(result.getString("name"));
				price.setText(result.getString("price"));
				description.setText(result.getString("description"));
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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products frame = new Products();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void insertProduct(String name, String prdPrice, String description, int idCat) {
		Connection conn = null;
		PreparedStatement stm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC","root","");
			
			String sql = "insert into products (name, price, description, id_category) VALUES (?,?,?,?)";
			
			stm = conn.prepareStatement(sql);
			stm.setString(1, name);
			stm.setString(2, prdPrice);
			stm.setString(3, description);
			stm.setString(4, String.valueOf(idCat));
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

	private void loadProduct() {
		listPro.clear(); //Clear list
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");

			String getData = "select products.*, categories.id idCat, categories.name categoryName from categories, products where products.id_category = categories.id";

			stm = conn.createStatement();

			ResultSet resul = stm.executeQuery(getData);

			while (resul.next()) {
				ListProduct product = new ListProduct(
						resul.getInt("id"), 
						resul.getString("name"), 
						resul.getInt("price"), 
						resul.getString("description"), 
						resul.getInt("idCat"), 
						resul.getString("categoryName"));
				listPro.add(product);
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
	
	private void showProduct() {
		model.setRowCount(0); // Xoa toan bdd data
		for (ListProduct listPro1 : listPro) {
			model.addRow(new Object[] {
					listPro1.getId(),
					listPro1.getName(),
					listPro1.getCategoryName(),
					listPro1.getPrice(),
					listPro1.getDescription()
				});
		}
	}
	/**
	 * Create the frame.
	 */
	public Products() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Nhap thong tin san pham", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 473, 255);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lb_name = new JLabel("Ten SP");
		lb_name.setBounds(21, 28, 46, 14);
		panel.add(lb_name);
		
		JLabel lb_danhMuc = new JLabel("Danh muc SP");
		lb_danhMuc.setBounds(21, 70, 93, 14);
		panel.add(lb_danhMuc);
		
		JLabel lb_price = new JLabel("Gia SP");
		lb_price.setBounds(21, 112, 46, 14);
		panel.add(lb_price);
		
		JLabel lb_description = new JLabel("Mo ta SP");
		lb_description.setBounds(21, 154, 93, 14);
		panel.add(lb_description);
		
		name = new JTextField();
		name.setBounds(124, 25, 321, 20);
		panel.add(name);
		name.setColumns(10);
		
		price = new JTextField();
		price.setBounds(124, 109, 321, 20);
		panel.add(price);
		price.setColumns(10);
		
		description = new JTextField();
		description.setBounds(124, 151, 321, 20);
		panel.add(description);
		description.setColumns(10);
		
		JComboBox optionCategory = new JComboBox();
		optionCategory.setModel(new DefaultComboBoxModel(new String[] {"Item 1", "Item 2", "Item 3"}));
		optionCategory.setBounds(124, 66, 163, 22);
		panel.add(optionCategory);
		
		JButton btnDelete = new JButton("Xoa");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete
				int index = tableProduct.getSelectedRow();
				ListProduct product = listPro.get(index);
				
				//delete
				Connection conn = null;
				PreparedStatement stm = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");

					String sql = "delete from products where id = ?";

					stm = conn.prepareStatement(sql);
					stm.setInt(1, product.getId());
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
				name.setText("");
				price.setText("");
				description.setText("");
				loadProduct();
				showProduct();
				btnDelete.setEnabled(false);
			}
		});
		btnDelete.setBounds(253, 196, 89, 23);
		panel.add(btnDelete);
		
		JButton btnEdit = new JButton("Sua");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = tableProduct.getSelectedRow();
				ListProduct product = listPro.get(index);
//				update
				ListCategory listCategory = listCat.get(optionCategory.getSelectedIndex());
				int idCat = listCategory.getId();
				Connection conn = null;
				PreparedStatement stm = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC","root","");
					
					String sql = "update products set name = ?, price = ?, description = ?, id_category = ? where id = ?";
					
					stm = conn.prepareStatement(sql);
					stm.setString(1, name.getText().toString());
					stm.setString(2, price.getText().toString());
					stm.setString(3, description.getText().toString());
					stm.setString(4, String.valueOf(idCat));
					stm.setInt(5, product.getId());
					stm.execute(); 
				} catch (Exception ex) {
					// TODO: handle exception
				}finally {
					try {
						stm.close();
						conn.close();
					} catch (SQLException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				}
//				end update
				name.setText("");
				price.setText("");
				description.setText("");
				loadProduct();
				showProduct();
				btnEdit.setEnabled(false);
				btnDelete.setEnabled(false);
			}
		});
		btnEdit.setEnabled(false);
		btnEdit.setBounds(146, 196, 89, 23);
		panel.add(btnEdit);
		
		JButton btnSearch = new JButton("Tim kiem");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String StrName = name.getText().toString();
				if(StrName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Phai nhap name de thuc hien tim kiem", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
				}else {
					try {
						search(StrName);
						btnEdit.setEnabled(true);
						btnDelete.setEnabled(true);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				btnDelete.setEnabled(true);
				btnEdit.setEnabled(true);
			}
		});
		btnSearch.setEnabled(true);
		btnSearch.setBounds(352, 196, 89, 23);
		panel.add(btnSearch);
		
		JButton btnAdd = new JButton("Them");
//		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prdName = name.getText().toString();
				String prdPrice = price.getText().toString();
				String prdDescription = description.getText().toString();
				ListCategory listCategory = listCat.get(optionCategory.getSelectedIndex());
				int idCat = listCategory.getId();
				insertProduct(prdName, prdPrice, prdDescription, idCat);
				name.setText("");
				price.setText("");
				description.setText("");
				loadProduct();
				showProduct();
			}
		});
		btnAdd.setBounds(37, 196, 89, 23);
		panel.add(btnAdd);
		
		tableProduct = new JTable();
		tableProduct.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Ten SP", "Danh muc", "Gia", "Mo ta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableProduct.getColumnModel().getColumn(1).setPreferredWidth(135);
		tableProduct.getColumnModel().getColumn(2).setPreferredWidth(126);
		tableProduct.getColumnModel().getColumn(3).setPreferredWidth(194);
		tableProduct.getColumnModel().getColumn(4).setPreferredWidth(94);
		tableProduct.setBounds(10, 268, 473, 176);
		contentPane.add(tableProduct);
		
		model = (DefaultTableModel)tableProduct.getModel();
		loadCategoryData();
		DefaultComboBoxModel<String> comboBox = (DefaultComboBoxModel<String>) optionCategory.getModel();
		comboBox.removeAllElements();
		for (ListCategory listCategory : listCat) {
			comboBox.addElement(listCategory.getName());
		}
		loadProduct();
		showProduct();
		
		tableProduct.addMouseListener(new MouseListener() {
			
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
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int index = tableProduct.getSelectedRow();
				ListProduct productList = listPro.get(index);
				name.setText(productList.getName());
				price.setText(String.valueOf(productList.getPrice()));
				description.setText(productList.getDescription());
				btnEdit.setEnabled(true);
				btnDelete.setEnabled(true);
			}
		});
	}
}
