package CollectionsAndFile;

import java.util.ArrayList;

public class Controller<E> {
	ArrayList<E> list = new ArrayList<>();

	public Controller() {
	}
	public void add(E e) {
		list.add(e);
	}
	public E get(int index) {
		return list.get(index); 
	}
}
