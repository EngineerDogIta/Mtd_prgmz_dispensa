
public class divisione {
	public static void main(String[] args) {
		int D = 100;
		int d = 7;
		int Q, r;

		Q = 0;
		r = D;
		while (r >= d) {
			r = r - d;
			Q = Q + 1;
		}

		System.out.println("Il quoziente � " + Q);
		System.out.println("Il resto � " + r);
	}
}
