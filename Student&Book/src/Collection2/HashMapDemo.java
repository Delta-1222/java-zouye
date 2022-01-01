package Collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Collection2.Book;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Book> books = new HashMap<String, Book>();
		books.put("1", new Book("1", "����ɽ����", 96, "���������"));
		books.put("2", new Book("2", "��", 65, "���������"));
		books.put("3", new Book("4", "����¶�", 78, "���������"));
		books.put("4", new Book("3", "��¥��", 89, "���������"));
		
		// ͨ��Iterator����key-value
		Iterator iter = books.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Book book = (Book) entry.getValue();
			System.out.println(book.getId()+" "+book.getName()+" "+book.getPublisher());
		}
	}

}
