//основы наследования

class TwoDShape {
	private double width;
	private double  height;
	private String name;
	int common;

	//конструктор без параметров
	TwoDShape() {
		width = height = 0.0;
		name = "абстрактная двумерная фигура";
	}

	//конструктор с двумя параметрами
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
		System.out.println("Внутри конструктора TwoDShape (double w, double h)");
	}

	//конструктр объекта с одинаковыми высотой и шириной
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	//конструктор объекта на базе существующего объекта
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	void showDim() {
		System.out.println("Ширина и высота: " +  width + " и " + height);
	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		if (w > 200)
			width = 200;
		else width = w;
	}
	
	void setHeight(double h) {
                if (h > 290)
                        height = 290;
                else height = h;
        }

	double area() {
		System.out.println("Метод area() должен быть переопределён в подклассе");
		return 0.0;
	}

	String getName() {
		return name;
	}
}

class Triangle extends TwoDShape {
	String style;
	int common;

	//конструктор по умолчанию
	Triangle() {
		super();
		style = "отсуствует";
	}
	//конструктор с тремя параметрамии
	Triangle(String s, double w, double h) {
		//вызов конструктор супер класса
		super(w, h, "треугольник");
		style = s;
		System.out.println("Внутри конструктора TwoDShape (String s, double w, double h)");

		/*setWidth(w);
		setHeight(h);*/
	}

	//конструктор с одним параметром
	Triangle(double x) {
		super(x, "треугольник");
		style = "закрашенный";
	}
	
	//конструктор на базе существующего треугольника
	
	Triangle(Triangle ob) {
		super (ob);
		style = ob.style;
	}
	

	//конструктор с демонстрацией доступа к переменной супер класса
	
	Triangle(int a, int b) {
		super.common = a;
		common = b;
	}
	double area() {
		return getWidth()*getHeight()/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}
//демонстрация строгой типизации при присваивании ссылок на объект
class X {
	int a;
	X(int i) {
		a = i;
	}

	void show() {
		System.out.println("Значение а: " + a);
	}

	void show(String msg) {

	}
}

class Y {
	int a;
	Y (int i) {
		a = i;
	}
}

class Z extends X {
	int b;
	Z(int i, int j) {
		super(j);
		b = i;
	}

	/*void show() {
		super.show(); //вызов одноимённого метода из супер класса
		System.out.println("Значение a и b: " + a + " " + b);
	}*/

	void show(String msg) {
		System.out.println(msg + b);
	}
}

class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle (String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
		System.out.println("Внутри конструктора ColorTriangle (String c, String s, double w, double h)");
	}

	ColorTriangle (ColorTriangle ob) {
		super(ob);
		color = ob.color;
	}

	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("Цвет: " + color);
	}
}

class Rectangle extends TwoDShape {
	String outline;
	int common;
	
	Rectangle(int a, int b) {
                super.common = a;
                common = b;
		
		System.out.println("Значение common в суперклассе: " + super.common);
		System.out.println("Значение common в суперклассе: " + common);

	}
	
	//конструкторы
	Rectangle() {
		super();
		outline = "отсутствует";
	}
	
	Rectangle (String o, double w, double h) {
		//вызов конструктора суперкласса
		super(w, h, "прямоугольние");
		outline = o;
		/*setWidth(w);
                setHeight(h);*/
	}

	Rectangle (double x) {
		super(x, "прямоугольник");
		outline = "сплошной";
	}
	
	//конструктор для создания прямоугольника из существующего объекта
	
	Rectangle (Rectangle ob) {
		super(ob);
		outline = ob.outline;
	}

	double area() {
		return getWidth()*getHeight();
	}

	boolean isSquare() {
		if (getWidth() == getHeight()) return true;
		return false;
	}

	void showOutline() {
                System.out.println("Рамка: " + outline);
	}
}

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		Triangle t4 = new Triangle(5, 10);

		ColorTriangle t5 = new ColorTriangle("синий", "контурный", 8.0, 12.0);
		ColorTriangle t6 = new ColorTriangle("красный", "закрашенный", 2.0, 5.0);	
		Triangle t7 = new Triangle(t2);
		ColorTriangle t8 = new ColorTriangle(t5);

		Rectangle r1 = new Rectangle("сплошная", 4.0, 4.0);
		Rectangle r2 = new Rectangle(5.0);
		System.out.println();

		/*t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "закрашенный";

		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "контурный";

		r1.setWidth(4.0);
		r1.setHeight(4.0);
		r1.outline = "сплошная";

		r2.setWidth(8.0);
                r2.setHeight(12.0);
                r2.outline = "пунктирная";*/

		t1 = t2;

		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();

		System.out.println("Площадь: " + t1.area());
		
		System.out.println("\nИнформация об объекте t2: ");
                t2.showStyle();
                t2.showDim();

                System.out.println("Площадь: " + t2.area() + "\n");

		System.out.println("\nИнформация об объекте t3: ");
                t3.showStyle();
                t3.showDim();

                System.out.println("Площадь: " + t3.area() + "\n");

		System.out.println("\nИнформация об объекте t5: ");
                t5.showStyle();
                t5.showDim();
		t5.showColor();
		System.out.println();

		System.out.println("\nИнформация об объекте t7: ");
                t7.showStyle();
                t7.showDim();
                System.out.println("Площадь: " + t7.area() + "\n");
                System.out.println();

		System.out.println("\nИнформация об объекте t8: ");
                t8.showStyle();
                t8.showDim();
		t8.showColor();
                System.out.println("Площадь: " + t8.area() + "\n");
                System.out.println();

		System.out.println("\nИнформация об объекте r2: ");
                r1.showOutline();
                r1.showDim();
		if(r1.isSquare())
			System.out.println("Является квадратом");
		else
			System.out.println("Не является квадратом");
                System.out.println("Площадь: " + r1.area());

		System.out.println("\nИнформация об объекте r2: ");
                r2.showOutline();
                r2.showDim();
                if(r2.isSquare())
                        System.out.println("Является квадратом");
                else
                        System.out.println("Не является квадратом");
                System.out.println("Площадь: " + r2.area());

		//демонстрация строгого контроля типов

		X x = new X(10);
		X x2;
		Y y = new Y(5);
		Z z = new Z(5, 6);
		x2 = x;
		x2 = z; // допустимое присваивание ссылки на объект подкласса

		System.out.println();
		x.show();
		System.out.println("\nвыполнение show() при ссылке на объект подкласса");	//демонстрация демонической диспетчеризации метода
		System.out.println();
		x2.show();
		x2.show("Перегруженная версия метода из подкласса ");
		
		x2 = x;
		System.out.println("\nвыполнение show() при ссылке на объект super класса");
		x2.show();

		System.out.println();
		System.out.println("x2.a: " + x2.a);
		//System.out.println("x2.b: " + x2.b);	переменная подкласса недоступна ссылочной переменной родительского класса
		//x2 = y;     недопустимое присваивание ссылки на объект другого типа
		
		//демнострация вызова метода вычисления площади для переменной суперкласса

		TwoDShape[] shapes = new TwoDShape[5];
		shapes[0] = new Triangle("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle(10.0);
		shapes[2] = new Rectangle("сплошная", 10.0, 4.0);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new TwoDShape(10.0, 20.0, "абстрактная");

		for (int i = 0; i<shapes.length; i++) {
			System.out.println("Имя объекта: " + shapes[i].getName());
			System.out.println("Площадь: " + shapes[i].area());
			System.out.println();
		}
	}
}
