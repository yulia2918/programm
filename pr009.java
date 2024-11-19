//основы наследования

class TwoDShape {
	double width;
	double  height;
	void showDim() {
		System.out.println("Ширина и высота: " +  width + " и " + height);
	}
}

class Triangle extends TwoDShape {
	String style;
	double area() {
		return width*height/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}

class Rectangle extends TwoDShape {
	String outline;

	double area() {
		return width*height;
	}

	boolean isSquare() {
		if (width == height) return true;
		return false;
	}

	void showOutline() {
                System.out.println("Рамка: " + outline);
	}
}

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "закрашенный";

		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "контурный";

		r1.width = 4.0;
		r1.height = 4.0;
		r1.outline = "сплошная";

		r2.width = 8.0;
                r2.height = 12.0;
                r2.outline = "пунктирная";

		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();

		System.out.println("Площадь: " + t1.area());
		
		System.out.println("\nИнформация об объекте t2: ");
                t2.showStyle();
                t2.showDim();

                System.out.println("Площадь: " + t2.area() + "\n");

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
