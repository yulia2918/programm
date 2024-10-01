class Avto {
	int pass; //количество пассажиров
	int v; // объём топливного бака
	double rash; //расход топлива (л) на 100 км
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



		//рассчёт расстояния, которое lada проедет на полном баке
		
		rasst = (int)( lada.v/lada.rash*100);
		rasst2 = (int)(porshe.v/porshe.rash*100);

		System.out.println("Lada проедет "+ rasst + " км. на полном баке ");
		System.out.println("Porshe проедет "+rasst2+" км. на полном баке ");
	}
}
