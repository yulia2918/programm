class Avto {
	int pass; //количество пассажиров
	int v; // объём топливного бака
	double rash; //расход топлива (л) на 100 км
	
	Avto(int p, int V, double r) {
		pass = p;
		v = V;
		rash = r;
	}
	void rasst() {
		System.out.println("Расстояние на полном баке:+"+ ((int)(v/rash*100)));
	}

	int rasst2() {
		return (int)(v/rash*100); 
	}

	double fuelNeeded (int km) {
		return ((double)km/100)*rash;
	}
	
}
class pr004 {
	public static void main (String args[]) {
	
		//создание экземпляра класса

		Avto lada = new Avto(4, 40, 5.5);
		Avto porshe = new Avto(1, 100, 14.0);
		int rasst, rasst2;

		// присваивание значение внутренним переменным экземпляра класса

		/*lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porshe.pass = 1 ;
		porshe.v = 100;
		porshe.rash = 14.0;*/

		System.out.println("Для расстояния в 10 км. нужно "+ lada.fuelNeeded(10) + " литров бензина");
		
	
		//rasst = 10;
		//System.out.println("Для расстояния в 10 км. нужно "+ lada.fuelNeeded(rasst) + " литров бензина");
		//lada = porshe;

		//рассчёт расстояния, которое lada проедет на полном баке
		
		//rasst = (int)( lada.v/lada.rash*100);
		//rasst2 = (int)(porshe.v/porshe.rash*100);

		System.out.print("Для Lada: ");
		lada.rasst();
		rasst = lada.rasst2();
		System.out.println("Результат rasst2():" + lada.rasst2() );

		System.out.print("Для Porshe: ");
		porshe.rasst();
		System.out.println("Результат rasst2(): " + porshe.rasst2());
	}
}
