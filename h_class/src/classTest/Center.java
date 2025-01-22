package classTest;

public class Center {
	Kid[] arKids;
	int total;
	
	
	public Center(Kid[] arKids, int total) {
		
		this.arKids = arKids;
		this.total = total;
		
		for (int i = 0; i < arKids.length; i++) {
			total+=arKids.length;
			
		}
	}

	
}
