public class Cows implements Comparable<Cows> {
	String ID;
	int lowestWeight;// The lowest weight of a cow
	int latestWeight;// The latest weight of a cow
	int totalMilkings; // Total amount of milk produced by the cow
	int numOfMilkings;// Number of times a cow has been milked

	public Cows(String ID) {
		this.ID = ID;
		this.latestWeight = 0;
		this.lowestWeight = 0;
		this.totalMilkings = 0;
		this.numOfMilkings = 0;
	}

	/*
	 * Adds the number of milk produced. Increments the numOfMilks everytime getMilk
	 * is called
	 */
	public void getMilk(int m) {
		this.totalMilkings += m;
		this.numOfMilkings++;
	}

	/*
	 * If lowest weight is equal to 0 or if current weight(w) is less than the
	 * lowest weight, set lowest weight to w if w is greater than or equal to lowest
	 * weight latest weight is set to w
	 */
	public void setlowestWeight(int w) {
		if (w < this.lowestWeight || this.lowestWeight == 0) {
			this.lowestWeight = w;
		}
		this.latestWeight = w;
	}

	/*
	 * Returns the average milk produced by a cow If the cow was not milked returns
	 * 0
	 */
	public int avgMilkProduction(){
    	if (numOfMilkings == 0) {
    		return 0;
    	}
    	else {
    		return (totalMilkings / numOfMilkings)
    	}
    }

	// compareTo Method
	public int compareTo(Cow c) {
		if (this.lowestWeight > c.lowestWeight) {
			return 1;
		} else if (this.lowestWeight < c.lowestWeight) {
			return -1;
		} else if (this.latestWeight > c.latestWeight) {
			return 1;
		} else if (this.latestWeight < c.latestWeight) {
			return -1;
		} else if (this.avgMilkProduction() > c.avgMilkProduction()) {
			return 1;
		} else if (this.avgMilkProduction() < c.avgMilkProduction()) {
			return -1;
		} else {
			return 0;
		}
	}

	// toString Method
	public String toString() {
		return ID + " " + lowestWeight + " " + latestWeight + " " + this.avgMilkProduction();
	}

	// hashCode Method (because we are trying to represent a Cow ID, a unique number
	// representing that cow inside the dataset.)

    	@Override
    	public int hashCode() {
        	return ID.hashCode();
    	}
}
