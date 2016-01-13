package main;

public class Main {

	static double sp = 4;
	static double[] interval = { 2, 7 };
	static double app = 0.01;

	public static void main(String[] args) {

		iteration(0);
		System.out.println();
		bisection(3);

	}

	public static int iteration(int outcome) {

		int it = 0;
		double it1 = sp;
		double it2 = 0;
		int i=0;

		while (true) {

			it1 = (2 * Math.pow(it1, 3)) / (3 * Math.pow(it1, 2) - 9);
			it++;
			if (it1 >= outcome - app) {
				if (it1 <= outcome + app) {
					System.out.println("Liczba iteracji: " + it);
					System.out.println("Wynik koncowy: " + it1);
					break;
				}
			}
			if (it1 == it2) {
				System.out
						.println("Nie można otrzymać przewidywanego wynikiu , otrzymany wynik to: "
								+ it1);
				break;
			}
			if(i>200){
				System.out
				.println("Nie można otrzymać przewidywanego wynikiu , otrzymany wynik to: "
						+ it1);
				break;
			}
			i++;
			it2 = it1;
		}

		return it;
	}

	public static int bisection(int outcome) {
		int bs = 0;
		double bso = 0;
		double bso1 = 0;
		int i=0;
		
		if (interval[0] <= -1.8 && interval[1] >= -1.8) {
			System.out.println("Podales zly przedzial");
			return 0;
		}

		if (interval[0] <= 1.8 && interval[1] >= 1.8) {
			System.out.println("Podales zly przedzial");
			return 0;
		}

		while (true) {
			bso = (interval[0] + interval[1]) / 2;
			bs++;

			if (bso >= outcome - app) {
				if (bso <= outcome + app) {
					System.out.println("Liczba podzialow: " + bs);
					System.out.println("Wynik koncowy: " + bso);
					break;
				}
			}

			if (bso == bso1) {
				System.out
						.println("Nie można otrzymać przewidywanego wynikiu , otrzymany wynik to: "
								+ bso);
				break;
			}
			
			if(i>200){
				System.out
				.println("Nie można otrzymać przewidywanego wynikiu , otrzymany wynik to: "
						+ bso);
				break;
			}
			i++;
			
			bso1 = bso;
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
