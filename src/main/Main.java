package main;

public class Main {

	static double sp = -1.4;
	static double[] interval = { -5, 8 };
	static double app = 0.1;
	
	public static void main(String[] args) {

		iteration(0);
		System.out.println();
		//bisection(0);

	}

	public static int iteration(int outcome) {

		int it = 0;
		double it1 = sp;

		while (true) {

			it1 = (2 * Math.pow(it1, 3)) / (3 * Math.pow(it1, 2) - 9);
			it++;
			System.out.println(it1);
			if (it1 > outcome - app) {
				if (it1 < outcome + app) {
					System.out.println("Liczba iteracji: " + it);
					System.out.println("Wynik koncowy: " + it1);
					break;
				}
			}

		}

		return it;
	}

	public static int bisection(int outcome) {
		int bs = 0;
		double bso = 0;

		while (true) {
			bso = (interval[0] + interval[1]) / 2;
			bs++;
			if (bso > outcome - app) {
				if (bso < outcome + app) {
					System.out.println("Liczba podzialow: " + bs);
					System.out.println("Wynik koncowy: " + bso);
					break;
				}
			}

			if (bso < outcome) {
				interval[0] = bso;
			}

			if (bso > outcome) {
				interval[1] = bso;
			}

		}

		return bs;
	}
}
