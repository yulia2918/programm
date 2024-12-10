class IQDemo {
	public static void main (String[] args) {
		FIxedQ q1 = new FIxedQ(10);
		CircularQ q2 = new CircularQ(10);
		ICharQ iQ;
		char ch;
		int i;
		iQ = q1;

		for (i=0; i<10; i++)
			iQ.put((char)('A' + i));
		System.out.println("Содержимое фиксированной очереди: ");

		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();

		iQ = q2;

		for (i = 0; i < 10; i++)
			iQ.put((char)('A' + i));
                System.out.println("Содержимое кольцевой очереди: ");

		for (i = 0; i < 10; i++) {
                        ch = iQ.get();
                        System.out.print(ch);
                }
                System.out.println();
	}
}
