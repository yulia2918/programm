package bookpackext;

//импорт класса из пакета bookpack

import bookpack.book;

//импорт всех классов из пакета bookpack
//import bookpack

class pr011 {
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
