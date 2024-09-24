class pr003 {
	public static void main(String args[]) throws java.io.IOException {
	
		//Чтение с клавиатуры
		char ch;
		System.out.print("нажмите клавишу на клавиатуре и ENTER ");
		ch = (char) System.in.read();
		System.out.println("Вы нажали клавишу: " + ch);	
	
		//Угадывание буквы
		//Пример использования проверки условия
		char answer = 'r';
		if (ch == answer) 
			System.out.println("Буква указана верно");
		else 
			System.out.println("Буква указана неверно");
		
		//Работа с вложенными операторами if
		System.out.println("\n");
		int i=9, k=110, j=10, a = 5, b = 15, c = 25, d = 35;

		if(i==10) {
			if(j<20)
				a = b;
			if(k>100)
				c = d;
			else a = c;
		}
		else a=d;

		System.out.println("a = " + a + " c = " + c + " d = " + d);
		

		//Цепочка if-else-if

		System.out.println("\n");

		int x;

		for (x=0; x<6; x++) {
			if (x==1)
				System.out.println("Значение x равно 1");
			else if (x==2) 
				System.out.println("Значение x равно 2");
			else if (x==3)
                                System.out.println("Значение x равно 3");
			else if (x==4)
                                System.out.println("Значение x равно 4");
			else 
		       		System.out.println("Значение х не находится между 1 и 4");			}
		

		//оператор switch

		System.out.println("\n");

		int ii;
		for (ii=0; ii<10; ii++)
			switch(ii) {
				case 0: 
					System.out.println("ii равно 0");
					break;
				case 1:
					System.out.println("ii равно 1");
                                        break;
				case 2:
					System.out.println("ii равно 2");
                                        break;
				case 3:
					System.out.println("ii равно 3");
                                        break;
				case 4:
					System.out.println("ii равно 4");
                                        break;
				default: 
					System.out.println("ii больше или равно 5");
		}
		
		//Пример вложенного switch
		System.out.println("\n");
		char ch1 = 'q', ch2 = 'h';
		switch(ch1) {
			case 'q': 
				System.out.println("Внешний switch");
				switch(ch2) {
					case 'q':
						System.out.println("Внешний switch");
						break;
					case 'h':
						System.out.println("Внутренний  switch");
						break;
				}
				break;
			case 'h':
			       	System.out.println("Не выведется");
				break;
		}
		
		//оператор цикла for
		
		System.out.println("\n");

		double num, sroot, rerr;
		
		for (num=1.0; num<100.0; num++) {
			sroot=Math.sqrt(num);
			System.out.println("Квадратный корень числа " + num + " равен " + sroot);
			//вычисление ошибки округления
			rerr = num -(sroot*sroot);
			System.out.println("Ошибка округления составляет "+ rerr);
			System.out.println();
		
		}

		int x1;

		for (x1 = 100; x1>-100; x1-=5)
			System.out.println(x1);

		System.out.println("\n");
		int i7, j7;
		for (i7 = 0, j7 = 10; i7<j7; i7++, j7--) {
			System.out.println("i7 and j7: " + i7 + " " + j7); 
		}
		char ignore;
		int i8;
		System.out.println("Для остановки цикла нажмите клавишу \"S\"");
		for (i8 = 0; (char) System.in.read() != 'S'; i8++){
			 do {
                                ignore = (char) System.in.read();
                        }while (ignore!='\n');
			System.out.println("Итерация №"+i8);
		}
		
		System.out.println("\n");
		for (i8=0; i8<10;){
			System.out.println("Итерация №"+i8);
			i8++;
		}

		System.out.println("\n");
		for(; i8<20;){
			System.out.println("Итерация №"+i8);
                        i8++;
		}
		//бесконечный цикл	
		System.out.println("\n");
		for(;;) {
			ch = (char) System.in.read();
			if (ch == 'q') break;
		}
	

		System.out.println("\n");
		
		int sum=0;
		//вычисление суммы чисел от 1 до 5

		for(i8=1; i8<=5; sum+=i8++);
		System.out.println("Сумма чисел равна " + sum);

		//цикл while
		System.out.println("\n");
		ch = 'a';
		while (ch<='z') {
			System.out.println(ch);
			ch++;
		}
		System.out.println();

		//Вычисление целых степеней числа 2
		
		int e;
		int result;
		for (int i9=0; i9<10;i9++){
			result=1;
			e=i9;
			while(e>0){
				result *=2;
				e--;
			}
			System.out.println("2 в степени "+i9+" равно "+result);
		}

		//цикл do-while
		System.out.println("\n");
		do {
			System.out.println("Нажмите клавишу, затем ENTER: ");
			ch = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			}while (ignore!='\n');			
		} while (ch != 'q');
		
		//оператор break
		System.out.println("\n");
		for (x1 = 100; x1>-100; x1-=5) {
                        System.out.println(x1);
			if (x1==50) break; //прекращаем выполнение цикла

		}

		 System.out.println("\n");

		 //break с вложенными циклами
		
		 for (int i9=0; i9<3; i9++) {
			 System.out.println("Счётчик внешнего цикла: " + i9);
			 System.out.print("Счётчик внутреннего цикла: " );
			 int t = 0;

			 while (t<100) {
				if (t==10) break;
				System.out.print(t+ " ");
				t++;
			
			 }
			 System.out.println();
		 }
		 System.out.println("Циклы закончились");
	}
}

