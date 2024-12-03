package bookpack;
class book {
	private String title;
	private String author;
	private int pubDate;

	book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	void Show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}

class pr010 {
	public static void main(String[] args) {
		book[] books = new book[5];
		books[0] = new book("Иллиада", "Гомер", 1980);
		books[1] = new book("Унесённые ветром", "Митчел", 2000);
		books[2] = new book("Наедине с собой", "Аврелий", 1950);
		books[3] = new book("Собор Парижской богоматери", "Гюго", 1970);
		books[4] = new book("Преступление и наказание", "Достоевский", 1950);

		for (int i=0; i< books.length; i++)
			books[i].Show();
	}
}
