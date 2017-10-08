package test.task;

public class TestTaskMailGroup {
	static String[] musicStyle = { "RnB", "Electrohuse", "Поп-музыка" };
	static int[] dancers;
	static int countDancers;
	static int[] trekList = new int[20];

	public static void main(String[] args) throws InterruptedException {
		countDancers = genericCountDancers();
		System.out.println(countDancers);
		dancers = new int[countDancers];
		dancers=genericDancers(countDancers);
		trekList=genericTrekList();
		for (int numberOfTrek = 0; numberOfTrek < 20; numberOfTrek++) {
			
			System.out.println("Играет трек №"+ (numberOfTrek+1) + " в стиле " + musicStyle[trekList[numberOfTrek]]+":");
			System.out.println();
			for (int numberDancer = 0; numberDancer < countDancers; numberDancer++) {
				if (dancers[numberDancer] == trekList[numberOfTrek]) {
					System.out.println("Танцор " + numberDancer + " танцует под " + musicStyle[trekList[numberOfTrek]]);
				} else {
					System.out.println("Танцор " + numberDancer + " пьёт водку в баре");
				}
			}
			Thread.sleep(5000);
			System.out.println();

		}
		

	}
	
	public static int[] genericTrekList() {
		int [] trekList = new int[20];
		for(int i = 0; i < 20; i++) {
			trekList[i] = (int) (Math.random() * 3);
		}
		return trekList;
	}

	public static int genericCountDancers() {
		int a = 5;
		int b = 10;
		int countDancers = a + (int) (Math.random() * b);
		return countDancers;
	}

	public static int[] genericDancers(int countVisitors) {
		int[] dancers;
		dancers = new int[countDancers];
		for (int i = 0; i < countDancers; i++) {
			dancers[i] = (int) (Math.random() * 3);
		}
		return dancers;
	}

}
