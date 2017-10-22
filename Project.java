package A1_3;

public class Project {
	String[][] aktivitaeten;

	public Project(String[][] aktivitaeten) {
		this.aktivitaeten = aktivitaeten;
	}

	public boolean isWellSorted(String[] sequence) {
		int p0 = -1;
		int p1 = -1;
		boolean res = true;
		if (sequence.length > 2) {
			for (int zeile = 0; zeile < this.aktivitaeten.length; zeile++) {
				for (int spalte = 0; spalte < this.aktivitaeten[zeile].length; spalte++) {
					String p = this.aktivitaeten[zeile][spalte];
					if (spalte % 2 == 0) {
						for (int i = 0; i < sequence.length; i++) {
							if (p.equals(sequence[i])) {
								p0 = i;
							}
						}
					} else if (spalte % 2 != 0) {
						for (int i = 0; i < sequence.length; i++) {
							if (p.equals(sequence[i])) {
								p1 = i;
							}
						}
					}
					if (p0 != -1 && p1 != -1) {
						res &= (p0 < p1);
						p0 = -1;
						p1 = -1;
					} else if (p1 == -1 && spalte == 1) {
						res = false;
					}
				}
			}
			return res;
		} else {
			return false;
		}
	}
}