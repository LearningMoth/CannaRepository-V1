import java.util.Scanner;
import java.io.*;


public class TestClass {

	 public static void main(String[] args) {

	        String consumptionType;
	        String strainName;
	        String moodType;
	        String consumptionMethod;
	        String quantity;
	        String date;
	        String notes;
	        //may need to change newEntry to default values here or in TestClass
	        WeedData newEntry = new WeedData("Glass", "Platinum Pancakes", "Indica Dom", "Flower", ".5 grams", "12/31/23", "Fruity and creamy");
	        System.out.println(newEntry.toString());

	        Scanner scan = new Scanner(System.in);

	        System.out.println("New entry? Press Y for yes and N for no.");
	        String userResponse = scan.nextLine();

	        switch (userResponse) {
	            case "Y":
	                System.out.println("How many additional entries would you like to enter?");
	                int answer = scan.nextInt();
	                scan.nextLine();

	                if (answer > 0) {
	                	/*file scanner/reading*/
	                	try {
	                		FileWriter fileWriter = new FileWriter("weed_data.txt",true);
	                		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	                		for (int i = 0; i < answer; i++) {
		                        System.out.println("Enter consumption type (Flower, wax, etc.)");
		                        consumptionType = scan.nextLine();
		                        System.out.println("Strain name?");
		                        strainName = scan.nextLine();
		                        System.out.println("Effects/mood after consumption?");
		                        moodType = scan.nextLine();
		                        System.out.println("Consumption method? (Glass, joint, etc.)");
		                        consumptionMethod = scan.nextLine();
		                        System.out.println("Date consumed?");
		                        date = scan.nextLine();
		                        System.out.println("Quantity consumed?");
		                        quantity = scan.nextLine();
		                        System.out.println("Comments/notes?");
		                        notes = scan.nextLine();

		                        WeedData entry = new WeedData(consumptionType, strainName, moodType, consumptionMethod, quantity, date, notes);
		                        System.out.println(entry.toString());
		                        bufferedWriter.write(entry.toString());
		                        bufferedWriter.newLine();
	                	}//end file writing/reading segment
	                		//confirming data was written/can delete if not working
	                		bufferedWriter.close();
	                		fileWriter.close();
	                		System.out.println("Data written to file successfully.");
	                		
	                	}catch (IOException e) {
	                		System.out.println("An error occured while writing to the file");
	                		e.printStackTrace();
	                	}
	                }else {
	                	System.out.println("No entried to add.");
	                }
	                break;
	                	
	                    /*for (int i = 0; i < answer; i++) {
	                        System.out.println("Enter consumption type (Flower, wax, etc.)");
	                        consumptionType = scan.nextLine();
	                        System.out.println("Strain name?");
	                        strainName = scan.nextLine();
	                        System.out.println("Effects/mood after consumption?");
	                        moodType = scan.nextLine();
	                        System.out.println("Consumption method? (Glass, joint, etc.)");
	                        consumptionMethod = scan.nextLine();
	                        System.out.println("Date consumed?");
	                        date = scan.nextLine();
	                        System.out.println("Quantity consumed?");
	                        quantity = scan.nextLine();
	                        System.out.println("Comments/notes?");
	                        notes = scan.nextLine();

	                        WeedData entryThree = new WeedData(consumptionType, strainName, moodType, consumptionMethod, quantity, date, notes);
	                        System.out.println(entryThree.toString());

	                        if (i < answer - 1) {
	                            System.out.println("New entry? Press Y for yes and N for no.");
	                            userResponse = scan.nextLine();
	                            if (userResponse.equalsIgnoreCase("N")) {
	                                break;
	                            }
	                        } else {
	                            System.out.println("Reached specified entries.");
	                            break;
	                        }
	                    }
	                } else {
	                    System.out.println("420 Blaze It :)");
	                }
	                break;*/

	            case "N":
	                System.out.println("Thank you for using WeedRepository V1.");
	                break;

	            default:
	                System.out.println("420 Blaze It :)");
	        }
	    }
	}