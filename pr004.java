class Avto {
	int pass; //количество пассажиров
	int v; // объём топливного бака
	double rash; //расход топлива (л) на 100 км
}
class pr004 {
	public static void main (String args[]) {
	
		//создание экземпляра класса

		Avto lada = new Avto();
		int rasst;

		// присваивание значение внутренним переменным экземпляра класса

		lada. pass = 4;
		lada.v = 40;
		lada.rash = 9.5;

		//рассчёт расстояния, которое lada проедет на полном баке
		
		rasst = (int)( lada.v/lada.rash*100);

		System.out.println("Lada проедет "+ rasst + " км. на полном баке ");

	}
}
