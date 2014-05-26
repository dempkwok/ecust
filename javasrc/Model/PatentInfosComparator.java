package demp.soft.Model;

import java.util.Comparator;

public class PatentInfosComparator implements Comparator<PatentInfos> {
	@Override
	public int compare(PatentInfos o1, PatentInfos o2) {
		// TODO Auto-generated method stub
		if (o1.getSimilarity() < o2.getSimilarity())
			return 1;
		else if (o1.getSimilarity() > o2.getSimilarity())
			return -1;
		return 0;
	}
}