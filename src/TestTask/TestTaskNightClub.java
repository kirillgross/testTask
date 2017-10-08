package TestTask;

public class TestTaskNightClub {
	final static String[] musicStyle = { "RnB", "Electrohuse", "Поп-музыка" };
	static int[] dancers;
	static int countDancers;
	static int[] trekList = new int[20];

	public static void clubDance(int[] dancers, int[] trekList, String[] musicStyle) throws InterruptedException {
		for (int numberOfTrek = 0; numberOfTrek < 20; numberOfTrek++) {
			System.out.println(
					"Играет трек №" + (numberOfTrek + 1) + ", стиль - " + musicStyle[trekList[numberOfTrek]] + ":");
			System.out.println();
			for (int numberDancer = 0; numberDancer < countDancers; numberDancer++) {
				if (dancers[numberDancer] == trekList[numberOfTrek]) {
					System.out
							.println("Персонаж " + numberDancer + " танцует под " + musicStyle[trekList[numberOfTrek]]);
				} else {
					System.out.println("Персонаж " + numberDancer + " пьёт водку в баре");
				}
			}
			Thread.sleep(5000);
			System.out.println();

		}
	}

	public static int[] genericTrekList() {
		int[] trekList = new int[20];
		// Генерурем треклист, состояший из 20 треков, одного из трёх стилей
		for (int i = 0; i < 20; i++) {
			trekList[i] = (int) (Math.random() * 3);
			// Для каждого трека рандомим номер стиля музыки
		}
		return trekList;
	}

	public static int genericCountDancers() {
		int a = 0;
		int b = 1000;
		// Генерируем общее количество персонажей больше или равно 0 и строго меньше
		// 1000
		int countDancers = a + (int) (Math.random() * b);
		return countDancers;
	}

	public static int[] genericDancers(int countVisitors) {
		int[] dancers;
		dancers = new int[countDancers];
		for (int i = 0; i < countDancers; i++) {
			dancers[i] = (int) (Math.random() * 3);
			// Для каждого персонажа рандомим номер стиля музыки, под который он танцует
		}
		return dancers;
	}
	
	public static void main(String[] args) throws InterruptedException {
		countDancers = genericCountDancers();// Генерируем количество персонажей
		dancers = new int[countDancers];
		dancers = genericDancers(countDancers);// Генерируем для каждого персонажа один из трёх стилей танцев
		trekList = genericTrekList();// Генерируем треклист
		clubDance(dancers,trekList,musicStyle);// Запускаем танцы
	}

}
