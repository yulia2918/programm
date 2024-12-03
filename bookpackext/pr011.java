package bookpackext;

class pr011 {
	public static void main(String[] args) {
                bookpack.book[] books = new bookpack.book[5];
                books[0] = new bookpack.book("Иллиада", "Гомер", 1980);
                books[1] = new bookpack.book("Унесённые ветром", "Митчел", 2000);
                books[2] = new bookpack.book("Наедине с собой", "Аврелий", 1950);
                books[3] = new bookpack.book("Собор Парижской богоматери", "Гюго", 1970);
                books[4] = new bookpack.book("Преступление и наказание", "Достоевский", 1950);

                for (int i=0; i< books.length; i++)
                        books[i].Show();

	}
}
