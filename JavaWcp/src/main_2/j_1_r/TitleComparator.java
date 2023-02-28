package main_2.j_1_r;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
	public int compare(Book x, Book y) {
		return x.getTitle().compareTo(y.getTitle());
	}

}
