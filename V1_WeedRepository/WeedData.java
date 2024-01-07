
public class WeedData 
{
	private String consumptionType;
	private String strainName;
	private String moodType;
	private String consumptionMethod;
	private String quantity;
	private String date;
	private String notes;


//constructors
public WeedData(String consumptionType, String strainName, String moodType, String consumptionMethod,String quantity, String date, String notes) 
{
	this.consumptionType = consumptionType;
	this.strainName = strainName;
	this.moodType = moodType;
	this.consumptionMethod = consumptionMethod;
	this.quantity = quantity;
	this.date = date;
	this.notes = notes;
	
}


/*Will need to add security to accessors and mutators to prevent null entries or bad responses*/

//accessors
public String getConsumptionType(){
	if(consumptionType !=null) {
		this.consumptionType = consumptionType;}
	return consumptionType;
	}



public String getStrainName(){
	return strainName;
}


public String getMoodType() 
{
	return moodType;
}


public String getConsumptionMethod() {
	return consumptionMethod;
}

public String getQuantity() {
	return quantity;
}

public String getDate() {
	return date;
}

public String getNotes() {
	return notes;
}



//mutators
public void setConsumptionType(String consumptionType) {
	this.consumptionType = consumptionType;
}

public void setStrainName(String strainName) {
	this.strainName = strainName;
}

public void setMoodType(String moodType) {
	this.moodType = moodType;
}


public void setConsumptionMethod(String consumptionMethod) {
	this.consumptionMethod = consumptionMethod;
}

public void setQuantity(String quantity) {
	this.quantity = quantity;
}

public void setDate(String date) {
	this.date = date;
}

public void setNotes(String notes) {
	this.notes = notes;
}



//Possibly format into a cleaner way and add something to count the entries when added to the file for organization

//toString
public String toString() {
	String weedInfo;
	weedInfo = ("Please review the information entered: " + "\n" + "\nConsumption Type: " + consumptionType + "\nStrain Name: " + strainName
			+ "\nEffects:" + moodType + "\nConsumption Method: " + consumptionMethod + "\nQuantity: " + quantity + "\nDate consumed: " + date +"\nNotes: " + notes);
	return weedInfo;
}



}