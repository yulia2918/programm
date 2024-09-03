class pr001 {
	public static void main(String args[]) {
		System.out.println("Первая программа на Java");//Выводим строку на консоль
		int Var1 = 1024;
		int var2;
		//System.out.println(var2); Ошибка: переменной не присвоено значение
		var2 = 411;
		System.out.println(Var1/2);
		System.out.println("результат целочисленного деления: " + var2/2);
		System.out.println("результат деления приведением типа данных " + (double)var2/2);
		
		//пример использования оператора if
		//if(Var1 = 0)
		//	System.out.println("условия Var1=0 выполнено"); несовместивость типов в условии
		 if(Var1/2 == 512)
                        System.out.println("условия \"Var1/2==512\" выполнено");
		 if(true)
			 System.out.println("\t условие true \n\t выполнено");
		System.out.println("строка для проверки");
		System.out.println();
		
		// пример использования оператора цикла for
		for (int i=0; i<10; i++)
			System.out.println("Строка номер " + i);
		// i = 10; переменная i локальная и существует только во время выполнения цикла
		System.out.println();
		int j;
		for (j=0; j<10; j++)
                      System.out.print(j + " ");
		System.out.println();

	}

}
