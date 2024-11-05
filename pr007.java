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

//пример передачи объектов методам

class Block {
	int a, b, c, V;

	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		V = a * b * c;
	}
	//проверка эквивалентности двух параллелепипедов
	boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else
			return false;
	}
	//проверка равенства объёмов
	boolean sameV(Block ob) {
		if(ob.V == V) return true;
		else return false;
	}
}
//класс отказоустойчивого массива
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
//класс для вызова метода с передачей параметров по значению
class CallByValue {
	void noCh(int i1, int j1) {
		i1 = i1 + j1;
		j1 = -j1;
	}
}

//лкасс для вызова с передачей параметров метода по ссылке
class CallByRef {
	int a2, b2;
	CallByRef (int i2, int j2) {
		a2 = i2;
		b2 = j2;
	}
	void Ch(CallByRef ob5) {
                ob5.a2 = ob5.a2+ ob5.b2;
                ob5.b2 = -ob5.b2;
	}
}

//класс для возвращения объекта при возврате метода
class ErrorMsg {
	String[] msgs = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Переполнение диска",
		"Выход индекса за границы диапазона"
	};
	//возврат сообщения об ошибке
	
	String getErrorMsg(int i3) {
		if ((i3 >= 0) & (i3 < msgs.length)) return msgs[i3];
		else return "Отсутствует код для ошибки";
	}
}

//возврат объекта, определённого в программе
class Err {
	String msg;	//cообщение об ошибке
	int severity;	//уровень серьёзности
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrInf {
	String[] msgs1 = {
                "Ошибка вывода",
                "Ошибка ввода",
                "Переполнение диска",
                "Выход индекса за границы диапазона"
        };

	int[] howBad = {3, 3, 2, 4};

	Err getErrInf(int i4) {
		if (i4 >= 0 & i4 < msgs1.length)
			return new Err(msgs1[i4], howBad[i4]);
		else
			return new Err("Отсутствует код для ошибки", 0);
	}

}

//перегрузка методов

class Overload {
	void ovlDemo() {
		System.out.println("Без параметров");
	}

	void ovlDemo(int a3) {
		System.out.println("Один параметр типа int: " + a3);
	}

	int ovlDemo(int a3, int b3) {
		System.out.println("Два параметра типа int: " + a3 + ", " + b3);
		return a3 + b3;
	}

	double ovlDemo(double a3, double b3) {
		System.out.println("Два параметра типа double: " + a3 + ", " + b3);
		return a3 - b3;
	}
}

//влияние преобразования типов на перегрузку методов

class Overload2 {
	void f(int x) {
		System.out.println("Внутри f(int): " +  x);
	}

	void f(double x) {
		System.out.println("Внутри f(double): " + x);
	}

	void f(byte x) {
		System.out.println("Внутри f(byte): " + x);
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

		//пример использования методов класса с параметрами в виде объектов

		System.out.println();

		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		System.out.println("ob1 эквивалентен по размерам ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob1 эквивалентен по размерам ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob1 эквивалентен по объёму ob3: " + ob1.sameV(ob3));

		//пример передачи параметров объектов по значению

		System.out.println();

		CallByValue ob4 = new CallByValue();
		int a1 = 15, b1 = 20;

		System.out.println("a1 и b1 перед вызовом: " + a1 + ", " + b1);
		
		ob4.noCh(a1, b1);
		System.out.println("a1 and b1 после вызова метода ob.noCh: " + a1 + ", " + b1);
		// при передаче параметров метожу объекту по значению, значение аргументов не изменяется
		
		//пример передачи параметров по ссылке

		System.out.println();
		CallByRef ob6 = new CallByRef(15, 20);
		
		System.out.println("ob6.a2 и ob6.b2 перед вызовом: " + ob6.a2 + ", " + ob6.b2);
		ob6.Ch(ob6);
		System.out.println("ob6.a2 and ob6.b2 после вызова метода ob6.change: " + ob6.a2 + ", " + ob6.b2);
		//пример возврата строки при выполнении метода ErrorMsg

		System.out.println();

		ErrorMsg err = new ErrorMsg();
		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(20));

		//пример возврата произвольного объекта, определённого в программе

		System.out.println();
	
		ErrInf err2 = new ErrInf();
		Err e;
		e = err2.getErrInf(2);
		System.out.println(e.msg + ", уровень серьёзности: " + e.severity);

		e = err2.getErrInf(20);
                System.out.println(e.msg + ", уровень серьёзности: " + e.severity);

		//демонстрация перегрузки методов (overload)

		Overload ob7 = new Overload();

		int resi;
		double resd;

		ob7.ovlDemo();
		System.out.println();

		ob7.ovlDemo(2);
		System.out.println();

		resi = ob7.ovlDemo(4, 6);
                System.out.println("Результат вызова ob7.ovlDemo(4, 6): " + resi);
		System.out.println();

		resd = ob7.ovlDemo(5.1, 3.5);
		System.out.println("Результат вызова ob7.ovlDemo(5,1, 3.5): " + resd);
		System.out.println();

		//перегрузка с автопреобразованием типов

		Overload2 ob8 = new Overload2();

		int i18 = 10;
		double d18 = 10.1;
		byte b18 = 99;
		short s18 = 10;
		float f18 = 11.5F;

		ob8.f(i18);
		ob8.f(d18);
		ob8.f(b18);
		ob8.f(s18);
		ob8.f(f18);
	}
}
