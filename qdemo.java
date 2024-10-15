//очередь

class queue {
	char[] q;
	int putloc, getloc; //указатели на элементы очереди
	
	queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	//метод для помещения символа в очередь
	
	void put(char ch) {
		if (putloc==q.length) {
			System.out.println("очередь переполнена, невозможно вставить символ");
			return;
		}
		q[putloc++] = ch;
	}

	//метод для извлечения символа из очереди
	
	char get() {
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
	}
}
