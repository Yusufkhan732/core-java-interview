package comparable;

public class FLShorting implements Comparable<FLShorting> {

	private String fName;
	private String lName;

	public FLShorting(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	@Override
	public int compareTo(FLShorting o) {
		if (this.fName.equals(o.fName)) {
			return this.lName.compareTo(o.lName);
		}
		return this.fName.compareTo(o.fName);
	}

	@Override
	public String toString() {
		return fName + " " + lName;
	}
}