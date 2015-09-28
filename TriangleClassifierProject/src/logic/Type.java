package logic;

public enum Type {
	EQUILATERAL, ISOSCELES, SCALENE;
	
	public String toString() {
		switch(this) {
			case EQUILATERAL:	return "equilateral";
			case ISOSCELES:		return "isosceles";	
			case SCALENE:		return "scalene";
		}
		
		// Should never happen
		assert false;
		return null;
	}
}
