class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		ByThrees ob3 = new ByThrees();
		
		//последовательность через 2
		for (int i = 0; i < 5; i++)
			System.out.println("Следующее число в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее зачение: " + ob.getPrevious());
		System.out.println("\nСброс последовательности к стартовому значению");
		ob.reset();
		
		for (int i = 0; i < 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее зачение: " + ob.getPrevious());
		System.out.println("\nСброс последовательности к стартовому значению");
		ob.reset();

		ob.setStart(100);
		for (int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее зачение: " + ob.getPrevious());

		//последовательность через 3
		System.out.println("Новая последовательность:");
		for (int i = 0; i < 5; i++)
                        System.out.println("Следующее число в последовательности: " + ob3.getNext());
                //System.out.println("Последнее предыдущее зачение: " + ob3.getPrevious());
                System.out.println("\nСброс последовательности к стартовому значению");
                ob3.reset();

                for (int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob3.getNext());
                //System.out.println("Последнее предыдущее зачение: " + ob3.getPrevious());
                System.out.println("\nСброс последовательности к стартовому значению");
                ob3.reset();

                ob3.setStart(100);
                for (int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob3.getNext());
                //System.out.println("Последнее предыдущее зачение: " + ob3.getPrevious());

		//демонстрация использования интерфейсной переменной

		Series obInt;
		for (int i = 0; i < 5; i++) {
			obInt = ob;
                        System.out.println("Следующее значение в последовательности ByTwos: " + obInt.getNext());
			obInt = ob3;
			System.out.println("Следующее значение в последовательности ByThrees: " + obInt.getNext());
		}
	}
}
