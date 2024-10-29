// управление доступом к членам класса

class mod {
	private int alpha; //закрытая переменная
                public int beta; //открытая переменная
                int gamma; //переменная с доступом по умолчанию

	void setA(int a) {
                        alpha = a;
                }

                int getA() {
			return alpha;
		}
}

class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;

	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	public int get(int index) {
		if ( indexOK(index))
			return a[index];
		return errval;
	}

	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	private boolean indexOK(int index) {
		if(index >= 0 & index < length)
			return true;
		return false;
	}
}

class pr007 {
	public static void main(String[] args) {
		mod ob = new mod();

		//изменение закрытой переменной осуществляется через методы, заданный внутри класса МОД

		ob.setA(777);
		System.out.println("Значение ob.alpha: " + ob.getA());
		
		// прямой доступ к переменной запрещён: ob.alpha = 100;
		
		ob.beta = 242;
		ob.gamma = 34;

		//пример использования класса отказоустойчивого поведения массива

		System.out.println();

		FailSoftArray fs = new FailSoftArray(5, -999);

		int x;

		//пример работы класса без выввода сообщений о неправильных индексах

		System.out.println("скрытая от пользователя обработка ошибок: ");

		for(int i = 0; i < (fs.length * 2); i++)
			fs.put(i, i * 10);
		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -999)
				System.out.print(x + " ");
		}
		System.out.println();

		//пример работы класс с выводом сообщений об ошибках

		for(int i = 0; i < (fs.length * 2); i++)
			if(!fs.put(i, i * 10))
				System.out.println(" Индекс " + i + " выходит за раницы массива");

		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -999)
				System.out.print(x + " ");
			else
				System.out.println(" Индекс " + i + " выходит за границы массива");
		}
		System.out.println();
	}
}
