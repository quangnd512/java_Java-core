package Cau2;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	List<Author> author;
	List<Book> book;

	public QuanLy() {
		this.author = new ArrayList<>();
		this.book = new ArrayList<>();
	}
	public void addNameAuthor(Author author) {
		this.author.add(author);
	}
	public void addBook(Book book) {
		this.book.add(book);
	}
	public void displayBook() {
		for (Book book2 : book) {
			book2.display();
		}
	}
	public void findBookInNick(String nick) {
		for (Book book2 : book) {
			if(book2.getNickname().equalsIgnoreCase(nick)) {
				book2.display();
			}
		}
	}
}
