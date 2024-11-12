//рекурсия

class Factorial {
	int factR (int n) {
		int result;

		if (n==1) return 1;
		result = factR(n-1) * n;
		return result;
	}

	int factI (int n) {
		int t, result;
		result = 1;

		for (t =1; t <= n; t++)
			result *= t;
		return result;
	}
}

//статические переменные
class Static_D {
	int x;
	static int y;

	int sum() {
		return x + y;
	}
}

class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	static {
		System.out.println("Внутри статического блока");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}

class Outer {
	int [] nums;
	Outer(int[] n) {
		nums = n;
	}

	void analitic() {
		Inner inOb = new Inner();
		System.out.println("Минимальное значение: " + inOb.min());
		System.out.println("Максимальное значение: " + inOb.max());
		System.out.println("Среднее значение: " + inOb.avg());
	}

	//Внутренний класс
	
	class Inner {
		int min() {
			int m = nums[0];
			for(int i = 1; i < nums.length; i++)
				if (nums[i] < m) m = nums[i];
			return m;
		}

		int max() {
                        int m = nums[0];
                        for(int i = 1; i < nums.length; i++)
                                if (nums[i] > m) m = nums[i];
                        return m;
		}

		int avg() {
                        int a = 0;
                        for(int i = 0; i < nums.length; i++)
                                a += nums[i];
                        return a/nums.length;
		}
	}
}

class VarArgs {
	static void vaTest(int ... v) {
		System.out.println("Количество аргументов: " + v.length);
		System.out.print("Содержимое массива аргументов:\n");
		for(int i = 0;  i < v.length; i++)
			System.out.println("аргумент " + i + ": " + v[i]);
		System.out.println();
	}

	static void vaTest2(String msg, int ... v) {
		System.out.println(msg + v.length);
		System.out.print("Содержимое массива аргументов:\n");
                for(int i = 0;  i < v.length; i++)
                        System.out.println("аргумент " + i + ": " + v[i]);
                System.out.println();
	}

	static void vaTest3(int ... v) {
                System.out.println("vaTest3(int ...)" + "\nКоличество аргументов: " + v.length);
                System.out.print("Содержимое массива аргументов:\n");
                for(int i = 0;  i < v.length; i++)
                        System.out.println("аргумент " + i + ": " + v[i]);
                System.out.println();
	}
	
	static void vaTest3(boolean ... v) {
                System.out.println("vaTest3(boolean ...)" + "\nКоличество аргументов: " + v.length);
                System.out.print("Содержимое массива аргументов:\n");
                for(int i = 0;  i < v.length; i++)
                        System.out.println("аргумент " + i + ": " + v[i]);
                System.out.println();
	}

	static void vaTest3(String msg, int ... v) {
                System.out.println("vaTest3(String, int ...)"+ "\n" + msg + v.length);
                System.out.print("Содержимое массива аргументов:\n");
                for(int i = 0;  i < v.length; i++)
                        System.out.println("аргумент " + i + ": " + v[i]);
                System.out.println();
	}
}
class pr008 {
	public static void main (String[] args) {
		Factorial f = new Factorial();

		System.out.println("Вычисление факториала рекурсивным методом:");
		System.out.println("Факториал 3 равен " + f.factR(3));
		System.out.println("Факториал 4 равен " + f.factR(4));
		System.out.println("Факториал 5 равен " + f.factR(5));
		System.out.println("Факториал 6 равен " + f.factR(6));

		System.out.println("\nВычисление факториала итеративным методом:");
                System.out.println("Факториал 3 равен " + f.factI(3));
                System.out.println("Факториал 4 равен " + f.factI(4));
                System.out.println("Факториал 5 равен " + f.factI(5));
                System.out.println("Факториал 6 равен " + f.factI(6));

		//демонстрация использования статической переменной

		Static_D ob1 = new Static_D();
		Static_D ob2 = new Static_D();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println("\nob1.x and ob2.x независимы друг от друга");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);

		System.out.println("\nСтатическая переменная у является общей");
		Static_D.y = 19;
		System.out.println("\nДля у = 19");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());

		Static_D.y = 100;
		System.out.println("\nДля у = 100");

		System.out.println("ob1.sum(): " + ob1.sum());
                System.out.println("ob2.sum(): " + ob2.sum());

		//демонстрация работы статического блока

		System.out.println("\nДемонстрация работы статического блока");
		StaticBlock ob9 = new StaticBlock("Внyтри конструктора: ");

		System.out.println("Квадратный корень из 2: " + StaticBlock.rootOf2);
		System.out.println("Квадратный корень из 3: " + StaticBlock.rootOf3);

		//демонстрация работы внутреннего класса

		System.out.println("\nДемонстрация работы внутреннего класса");
		int[] x = {3, 6, 1, 7, 4, 2, 5, 8};
		Outer outOb = new Outer(x);

		outOb.analitic();

		class showBt {
		        int numbits;
        		showBt(int n) {
                		numbits = n;
        		}
			void show(long val) {
                		long mask = 1;

                //сдвиг влево значения 1
				mask <<=numbits-1;

                		int spacer = 0;
				for(;mask != 0; mask >>>=1) {
                        		if(( val & mask) != 0)
                                		System.out.print("1");
                        		else
                                		System.out.print("0");
                        		spacer++;
					if((spacer%8) == 0) {
                                		System.out.print(" ");
                                		spacer = 0;
					}
                		}
                		System.out.println();
        		}
		}
		System.out.println();
		for(byte b = 0; b < 10; b++) {
			showBt byteval = new showBt(8);
			System.out.println(b + " в двоичном виде: ");
			byteval.show(b);
		}

		System.out.println("\nДемонстрация вызова метода с переменным количеством аргументов");
		VarArgs.vaTest(10);
		VarArgs.vaTest(1, 2, 3);
		VarArgs.vaTest();

		System.out.println();
		VarArgs.vaTest2("Один аргумент переменной длины: ", 10);
                VarArgs.vaTest2("Два аргумента переменной длины: ", 1, 2, 3);
                VarArgs.vaTest2("Без аргументов переменной длины: ");

		System.out.println();
                VarArgs.vaTest3(10, 20);
                VarArgs.vaTest3("Два аргумента переменной длины: ", 1, 2, 3);
                VarArgs.vaTest3(true, false, false);
	}
}
