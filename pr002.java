class pr002 {
	public static void main(String args[]) {
		byte b, bb, bbb; //8-битная переменная
		short s, ss, sss; //16-битная переменная
		int i, ii, I; //32-битная переменная
		long l, ll, L; //64-битная переменная
		
		b = 127;
		bb = (byte)130; 
		s = 32000;
		ss = (short)33000;

		System.out.println("bb = "+ bb + "\nss = " + ss);

		sss = 100;
		//bbb = sss; автоматическое преобразование типов запрещено, т.к. может привести к искажению значений
		bbb = (byte)sss;

		System.out.println("bbb = "+ bbb + "\nsss = " + sss);
		System.out.println();

		//пример использования различный целых типов
		ii = 700000; //длина  стороны куба в миллиметрах
		int V = ii*ii*ii; // объём куба в кубических мм
		System.out.println("объём куба: " + V);

		long v = (long)ii*ii*ii;
		System.out.println("правильно вычисленный объём куба: " + v);
		
		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);


	}
}

