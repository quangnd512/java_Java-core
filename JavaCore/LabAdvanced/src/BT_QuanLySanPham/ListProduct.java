package BT_QuanLySanPham;

public class ListProduct {
	int id;
	String name;
	int price;
	String description;
	int optionList;
	String categoryName;
	
	public ListProduct() {
	}

	public ListProduct(int id, String name, int price, String description, int optionList, String categoryName) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.optionList = optionList;
		this.categoryName = categoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOptionList() {
		return optionList;
	}

	public void setOptionList(int optionList) {
		this.optionList = optionList;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
