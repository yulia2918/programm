class Avto {
	int pass; //количество пассажиров
	int v; // объём топливного бака
	double rash; //расход топлива (л) на 100 км
	
	void rasst() {
		System.out.println("Расстояние на полном баке:+"+ ((int)(v/rash*100)));
	}
}
class pr004 {
	public static void main (String args[]) {
	
		//создание экземпляра класса

		Avto lada = new Avto();
		Avto porshe = new Avto();
		int rasst, rasst2;

		// присваивание значение внутренним переменным экземпляра класса

		lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porshe.pass = 1 ;
		porshe.v = 100;
		porshe.rash = 14.0;

		//lada = porshe;

		//рассчёт расстояния, которое lada проедет на полном баке
		
		//rasst = (int)( lada.v/lada.rash*100);
		//rasst2 = (int)(porshe.v/porshe.rash*100);

		System.out.print("Для Lada: ");
		lada.rasst();

		System.out.print("Для Porshe: ");
		porshe.rasst();


	}
}
