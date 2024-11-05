//очередь

class queue {
	private char[] q;
	private int putloc, getloc; //указатели на элементы очереди
	

	//конструктор. создающий очередь на базе массива с размером size
	
	public queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	//конструктор очереди на основе объекта queue
	
	queue(queue ob) {
		
		//установка указателей
		putloc = ob.putloc;
		getloc = ob.getloc;

		//выделение места под массив
		q = new char [ob.q.length];

		//копирование элементов
		for (int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}

	//конструктор в очереди с начальными значениями
	
	queue (char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];

		for (int i = 0; i < a.length; i++)
			put(a[i]);
	}

	//метод для помещения символа в очередь
	
	public void put(char ch) {
		if (putloc==q.length) {
			System.out.println("очередь переполнена, невозможно вставить символ");
			return;
		}
		q[putloc++] = ch;
	}

	//метод для извлечения символа из очереди
	
	public char get() {
		if (getloc == putloc) {
			System.out.println("невозможно извлечь символ, т.к. очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class qdemo {
	public static void main (String args[]) {
		queue bigQ = new queue(100);
		queue smQ = new queue(4);
		
		char ch;
		int i;

		System.out.println("Использование очереди biqQ для сохранения символов:");
		for (i=0; i<26; i++)
			bigQ.put((char) ('A' + i));

		//извлекаем элементы из очереди bigQ

		System.out.println("Содержимое bigQ:");
		for (i=0; i<26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		//использование очереди smQ

		for (i=0; i<5; i++) {
			System.out.println("попытка сохранения " + (char) ('Z' - i));
			smQ.put((char) ('Z' - i));
			System.out.println();
		}
		 System.out.println();
		 System.out.println("Содержимое smQ: ");
		 
		 for ( i=0; i<5; i++) {
			 ch = smQ.get();
			 if(ch != (char) 0) System.out.println(ch);
		 }

		 //bigQ.q[3] = 'E'; попытка изменения значения у закрытой переменной класса очередь

		 queue q1 = new queue(10);
		 char [] name = {'I', 'v', 'a', 'n'};

		 queue q2 = new queue(name);
		 
		 for (int i2 = 0; i2 < 10; i2++)
			 q1.put((char) ('A' + i2));
		 
		 queue q3 = new queue(q1);

		 System.out.println("Содержимое q1: ");
		 for (int i2 = 0; i2 < 10; i2++) {
			 ch = q1.get();
			 System.out.println(ch);
		 }
		 System.out.println("\n");

		 System.out.println("Содержимое q2 (на базе массива): ");
		 for (int i2 = 0; i2 < 4; i2++) {
                         ch = q2.get();
                         System.out.println(ch);
                 }
                 System.out.println("\n");

		 System.out.println("Содержимое q3 (на базе очереди q1): ");
		 for (int i2 = 0; i2 < 10; i2++) {
                         ch = q3.get();
                         System.out.println(ch);
                 }
                 System.out.println("\n");
	}
}
