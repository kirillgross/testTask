package TestTask;

public class TestTaskNightClub {
	final static String[] musicStyle = { "RnB", "Electrohuse", "���-������" };
	static int[] dancers;
	static int countDancers;
	static int[] trekList = new int[20];

	public static void clubDance(int[] dancers, int[] trekList, String[] musicStyle) throws InterruptedException {
		for (int numberOfTrek = 0; numberOfTrek < 20; numberOfTrek++) {
			System.out.println(
					"������ ���� �" + (numberOfTrek + 1) + ", ����� - " + musicStyle[trekList[numberOfTrek]] + ":");
			System.out.println();
			for (int numberDancer = 0; numberDancer < countDancers; numberDancer++) {
				if (dancers[numberDancer] == trekList[numberOfTrek]) {
					System.out
							.println("�������� " + numberDancer + " ������� ��� " + musicStyle[trekList[numberOfTrek]]);
				} else {
					System.out.println("�������� " + numberDancer + " ���� ����� � ����");
				}
			}
			Thread.sleep(5000);
			System.out.println();

		}
	}

	public static int[] genericTrekList() {
		int[] trekList = new int[20];
		// ��������� ��������, ��������� �� 20 ������, ������ �� ��� ������
		for (int i = 0; i < 20; i++) {
			trekList[i] = (int) (Math.random() * 3);
			// ��� ������� ����� �������� ����� ����� ������
		}
		return trekList;
	}

	public static int genericCountDancers() {
		int a = 0;
		int b = 1000;
		// ���������� ����� ���������� ���������� ������ ��� ����� 0 � ������ ������
		// 1000
		int countDancers = a + (int) (Math.random() * b);
		return countDancers;
	}

	public static int[] genericDancers(int countVisitors) {
		int[] dancers;
		dancers = new int[countDancers];
		for (int i = 0; i < countDancers; i++) {
			dancers[i] = (int) (Math.random() * 3);
			// ��� ������� ��������� �������� ����� ����� ������, ��� ������� �� �������
		}
		return dancers;
	}
	
	public static void main(String[] args) throws InterruptedException {
		countDancers = genericCountDancers();// ���������� ���������� ����������
		dancers = new int[countDancers];
		dancers = genericDancers(countDancers);// ���������� ��� ������� ��������� ���� �� ��� ������ ������
		trekList = genericTrekList();// ���������� ��������
		clubDance(dancers,trekList,musicStyle);// ��������� �����
	}

}
