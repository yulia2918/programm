//основы наследования

class TwoDShape {
	private double width;
	private double  height;
	int common;
	//конструктор без параметров
	TwoDShape() {
		width = height = 0.0;
	}

	//конструктор с двумя параметрами
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	//конструктр объекта с одинаковыми высотой и шириной
	TwoDShape(double x) {
		width = height = x;
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
}

class Triangle extends TwoDShape {
	String style;

	//конструктор по умолчанию
	Triangle() {
		super();
		style = "отсуствует";
	}
	//конструктор с тремы параметрамии
	Triangle(String s, double w, double h) {
		//вызов конструктор супер класса
		super(w, h);
		style = s;
		
		/*setWidth(w);
		setHeight(h);*/
	}

	//конструктор с одним параметром
	Triangle(double x) {
		super(x);
		style = "закрашенный";
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

class Rectangle extends TwoDShape {
	String outline;
	
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
		super(w, h);
		outline = o;
		/*setWidth(w);
                setHeight(h);*/
	}

	Rectangle (double x) {
		super(x);
		outline = "сплошной";
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
	}
}
