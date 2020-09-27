package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] indreListe : matrise) {
            String rad = "";
            for (int tall : indreListe) {
                rad = rad + tall + " ";
            }
            System.out.println(rad);
        }
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String skrivUtMatrise = "";
        for (int[] rad : matrise) {
            for (int tall : rad) {
                skrivUtMatrise = skrivUtMatrise + tall + " ";
            }
            skrivUtMatrise = skrivUtMatrise + "\n";
        }
        return skrivUtMatrise;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
            int [] rad = matrise[i];
            for (int j = 0; j < rad.length ; j++) {
                matrise[i][j] = matrise[i][j] * tall;
            }
        }
        return matrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
			for ( int j = 0; j < a.length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
					
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
	
	public static void main(String[] args) {
		int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 5}
        };

        int b[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
		
		boolean lik = erLik(a, b);
		System.out.println(lik);
	}
}
