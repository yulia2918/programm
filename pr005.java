// массивы и строки

class arrays {
	public static void  main (String args[]) {
		int[] sample = new int[10];
		int sample1[] = new int[10];
		int i;

		for (i = 0; i <10; i++)
			sample[i] = 2*i;
		for(i = 0; i<10; i++)
			System.out.println("Элемент массива с индексом " + i + " : " + sample[i]);

		//поиск миниального и максимального значения
		System.out.println();
		sample1[0] = 99;
		sample1[1] = 20;
		sample1[2] = 90;
		sample1[3] = -242;
		sample1[4] = 3;
		sample1[5] = -20;
		sample1[6] = 53;
		sample1[7] = 51;
		sample1[8] = -67;
		sample1[9] = 134;
		
		//sample[10] = 472  выход за границы массива вызывает ошибку периода исполнения
		
		int max, min;
		min = max = sample1[0];

		for (i = 1; i<10; i++) {
			if (sample1[i] < min) min = sample1[i];
			if (sample1[i] > max) max = sample1[i];
		}
		System.out.println("Минимальное и максимальное значения: " + min + " " + max );
		
		//инициализация массива
		System.out.println();
	       	int[] sample2 = {87, 100, -42, 34, 25, -25, -424, 62, 74,0};
                min = max = sample2[0];

                for (i = 1; i<10; i++) {
                        if (sample2[i] < min) min = sample2[i];
                        if (sample2[i] > max) max = sample2[i];
                }
                System.out.println("Минимальное и максимальное значения: " + min + " " + max );

		//Сортировка массива (пузырьковая);

		System.out.println();

		int size = sample2.length;
		int a,b,t; 
		
		//Отображение исходного массива

		System.out.println("Исходный массив6 ");
		for(i=0; i< size; i++)
			System.out.print(" " + sample2[i]);
		System.out.println();

		//Сортировка

		for( a=1; a<size; a++ )
			for ( b=size-1; b >= a; b--) {
				if (sample2[b-1]>sample2[b]) {
					t = sample2[b-1];
					sample2[b-1] = sample2[b];
					sample2[b] = t;
				}
			}
		//отображение отсортированного массива

		System.out.println("Отсортированный массив: ");
		
		for(i=0; i< size; i++)
                        System.out.print(" " + sample2[i]);
                System.out.println();

		//Двумерные массивы
		System.out.println();
		int [][] arr2D = new int[10][20];
		int t2, i2;

		for (t2 = 0; t2<10; t2++) {
			for (i2=10; i2<30; i2++) {
				arr2D[t2][i2-10] = (t2*100)+i2+1;
				if (t2==0)
					System.out.print(arr2D[t2][i2-10]+"  ");
				else
					System.out.print(arr2D[t2][i2-10]+" ");
			}
			System.out.println();
		}
		
		//Двумерный массив с разным кол-вом элементов в строке

		System.out.println();

		int [][] riders = new int[7][];
		
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];

		for ( int i3=0; i3<7; i3++) 
			for (int j3=0; j3<riders[i3].length; j3++)
				riders[i3][j3]=i3+j3+10;
		
		System.out.println("Количество пассажиров в рабочие дни недели: ");
		for ( int i3=0; i3<5; i3++) {
                        for (int j3=0; j3<riders[i3].length; j3++) 
				System.out.print(riders[i3][j3] + " ");
			System.out.println();

		}	
		
		System.out.println();

		System.out.println("Количество пассажиров в рабочие дни недели: ");
                for ( int i3=5; i3<7; i3++) {
                        for (int j3=0; j3<2; j3++)
                                System.out.print(riders[i3][j3] + " ");
                        System.out.println();
		}

		//ссылки на массивы

		System.out.println();
		for (int i3=0; i3<10; i3++)
			sample[i3] = i3;

		for (int i3=0; i3<10; i3++)
                        sample1[i3] = -i3;

		System.out.println("Массив sample[]: ");
		for (int i3=0; i3<10; i3++)
			System.out.print(sample[i3] + " ");

		System.out.println();
		System.out.println("Массив sample1[]: ");

		for (int i3=0; i3<10; i3++)
                        System.out.print(sample1[i3] + " ");
		
		System.out.println();
		System.out.println("sample[]: "+ sample + "sample1[]" + sample1);
		sample1=sample;
		sample[4]=1111;

		System.out.println("Массив sample[] после изменения элемента с индексом 4 в sample1[]: ");
		
		for (int i3=0; i3<10; i3++)
                        System.out.print(sample[i3] + " ");
		
		System.out.println();
		System.out.println("sample[]: "+ sample + "sample1[]" + sample1);

		//Копирование массива
		
		System.out.println();

		int[] sample3 = new int[10];

		for (int i3=0; i3<10; i3++)
                        sample3[i3] = -i3;

		if(sample1.length >= sample3.length)
			for (int i3=0; i3<sample3.length; i3++)
				sample1[i3] = sample3[i3];
		//Вывод содержимого sample1[] после копирования

		System.out.println("Массив sample1[] после копирования: ");
		for (int i3=0; i3<sample1.length; i3++)
			System.out.print(sample1[i3] + " ");
		System.out.println();


	}
}

