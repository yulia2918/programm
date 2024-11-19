//основы наследования

class TwoDShape {
	private double width;
	private double  height;
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
	double area() {
		return getWidth()*getHeight()/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}

class Rectangle extends TwoDShape {
	String outline;

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
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		t1.setWidth(4.0);
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
