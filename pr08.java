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
	}
}
