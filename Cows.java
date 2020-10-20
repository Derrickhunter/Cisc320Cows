public class Cows {
    String ID;
    int lowestWeight;
    int lastestWeight;
    int totalMilkings; //all milks 
    int numOfMilkings;

    public Cows(String ID){
        this.ID = ID;
        this.latestWeight = 0;
		this.lowestWeight = 0;
		this.totalMilkings = 0;
		this.numOfMilkings = 0;
    }

    //Action code ("W", "M", or "T")
    public void getMilk(int m){

    }
    
    
    public void setlowestWeight(int w){

    }

    public int avgMilkProduction(){

    }


    //toString Method
    public String toString() {
		return ID + " " + lowestWeight + " " + latestWeight + " " + avgMilkProduction();
	}


    //hashCode Method (because we are trying to represent a Cow ID, a unique number representing that cow inside the dataset.)
}
