package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a )
	public static void skrivUt(int[] tabell) {
		String stringTabell = "";
		for(int tall : tabell) {
			stringTabell += tall + " ";
		}
		System.out.println(stringTabell);
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String stringTabell = ""; 
		for(int tall : tabell) {
			stringTabell += tall + ",";
		}
		stringTabell = stringTabell.substring(0, stringTabell.length()-1);
		return "[" + stringTabell +"]";
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for(int tall : tabell) {
			sum += tall;
		}
		return sum;
	}
	public static int summer2(int[] tabell) {

		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
	public static int summer3(int[] tabell) {
		int teller = 0;
		int sum = 0;
		while (teller < tabell.length) {
			sum += tabell[teller];
			teller++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int tabellTall : tabell) {
			if (tabellTall == tall);
			return true;
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++){
			if (tabell[i] == tall) {
				return i;
			}
			
			
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int j = 0;
		int[] reverserTabell = new int[tabell.length];
		for(int i = tabell.length - 1; i >= 0; i--) {
			reverserTabell[j] = tabell [i];
			j++;
		
		}
		return reverserTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 0; i < tabell.length; i++) {
			if (i + 1 >= tabell.length) {
				break;
			}
			
			int current = tabell [i];
			int next = tabell [i + 1];
			if (current > next) {
				return false;
				
			}
			
		}
		return true;
	}

	// h)

	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] nyTabell = new int[tabell1.length + tabell2.length];
        System.arraycopy(tabell1, 0, nyTabell, 0, tabell1.length);
        System.arraycopy(tabell2, 0, nyTabell, tabell1.length, tabell2.length);
        return  nyTabell;
    }
	
}
