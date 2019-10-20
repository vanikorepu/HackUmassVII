package savePaper;
import java.lang.*;
import java.util.Comparator;

public class DataEntry{
	//public int ID = (int)(Math.random() * (99999999 - 10000000 + 1) + 10000000);
	public int ID;
	public int thisMonth = (int)(Math.random()*(100+1));
	public int prevMonth = (int)(Math.random()*(100+1));
	public int thisYear = thisMonth + prevMonth +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1)) +  (int)(Math.random()*(100+1));
	public DataEntry(int id) {
		ID = id;
	}
}

class SortByThisMonth implements Comparator<DataEntry>{
	public int compare(DataEntry a, DataEntry b) {
		return a.thisMonth - b.thisMonth;
	}
}

class SortByThisYear implements Comparator<DataEntry>{
	public int compare(DataEntry a, DataEntry b) {
		return a.thisYear - b.thisYear;
	}
}

class SortByDiff implements Comparator<DataEntry>{
	public int compare(DataEntry a, DataEntry b) {
		return -(a.thisMonth - a.prevMonth) + (b.thisMonth - b.prevMonth);
	}
}
