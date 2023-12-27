package WK4;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Creation of array and population with elements :
		int[] ages = new int []{3, 9, 23, 64, 2, 8, 28, 93};

//1.a.Subtraction of first element of array from last element:
		System.out.println(ages[ages.length -1] - ages[0] );
		
//Looping through array to calculate array by summing....
//...elements using array indices
		double sum = 0;
		for (int i=0; i<ages.length; i++) {
			sum += ages[i];}
		
//Calculating and printing average age by dividing sum....
//....of elements by the length of array
		double averageAge = sum / ages.length;
		System.out.println(averageAge);
		
//1.b.i. Creation of new array ages2 and population with elements :
		int[] ages2 = new int []{3, 9, 23, 64, 2, 8, 28, 93, 100};

//1.b.ii. Subtraction of first element of array from last element:
		System.out.println(ages2[ages2.length -1] - ages2[0] );

/*1.b.iii.It can be seen that index values of the arrays 
		were used in both cases and it worked even though
		they were of different lengths.*/
		
//1.c. Looping through array to calculate array by summing....
//...elements using array indices
		double sum2 = 0;
		for (int i=0; i<ages2.length; i++) {
			sum2 += ages2[i];}
		
//Calculating and printing average age by dividing sum....
//....of elements by the length of array
		double averageAge2 = sum2 / ages2.length;
		System.out.println(averageAge2);
		
		
		
//2.Creation of array of strings, names, and population with names :
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//2.a. Using loop to calculate average no. of letters per name
		double sumOfNameLengths = 0;
		for (int j=0; j<names.length; j++) {
			sumOfNameLengths += names[j].length();
		}
		System.out.println(sumOfNameLengths / names.length);
		
//2.b. Using loop to concatenate all names together
		String listOfNames = "";
		for (int k=0; k<names.length; k++) {
			listOfNames += names[k] + " ";
		}
		System.out.print(listOfNames);
		
	
/*3. You access the last element of an array by calling
	the element with the index that is one less
	than the length of the array, since array indices are
	zero based. E.g.  names[names.length -1]*/
		
		
	
/*4. You access the first element of an array by calling
	the element with the index equal to zero. Since array 
	indices are zero based, the first element will always
	be the one with index zero. E.g.  names[0]*/
		
		
		
	
/*5.Creation of new array, nameLengths, and populating it with 
		length of names in names array */
		//Note: we could initiate the array by setting
		//the size to the size of the names array by using
		//names.length as shown in the comment below:
		//int [] nameLengths = new int [names.length] ;
		int [] nameLengths = new int [6] ;
		for(int i = 0; i < names.length ; i++) {
			nameLengths[i] = names[i].length();
		}
	//Checking elements in nameLengths array	
		System.out.println();
		for(int nameLength : nameLengths) {
			System.out.println(nameLength);
		}
		
		
		

//6. Looping through array and calculating sum of elements
		double nameLengthSum = 0;
		for(int nameLength : nameLengths) {
			nameLengthSum += nameLength ;
		}
		System.out.println(nameLengthSum);
		
		
//	Testing method in 7.	
	System.out.println(concatenateWord("Good", 5));
	
//	Testing method in 8.	
	System.out.println(fullName("John", "Bull"));
		
//	Testing method in 9.
	int [] integerArray = {25, 30,35,40};
	System.out.println(greaterThanHundred(integerArray));
	
//	Testing method in 10.
	double [] doubleArray = {12, 17, 9, 8, 10};
	System.out.println(arrayAverage(doubleArray));
	
//	Testing method in 11.
	double[] dbleArray1 = {2.5, 3.7, 1.4, 2.9, 22};
	double[] dbleArray2 = {8.3, 4.2, 9, 5.1};
	System.out.println(greaterAverage(dbleArray1,dbleArray2));

//	Testing method in 12.
	boolean isHot = false;
	double pocketMoney = 25.0;
	System.out.println(willBuyDrink(isHot,pocketMoney));
	
// Testing method in 13.
	boolean assignmentCompleted = true;
	double numberOfQuestions = 13;
	completionStatus(assignmentCompleted,numberOfQuestions);
}
	
	
//7. method to concatenate string
			public static String concatenateWord (String word, int n) {
			String newWord ="";
			for (int i=1; i<=n ; i++) {
				newWord += word;	
			}
			return newWord;}
			

//8. method to return Full Name
			public static String fullName (String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;}
			

//9. method to check sum of array elements
			public static Boolean greaterThanHundred (int[] array) {
			int sum =0;
			boolean check = false;
			for (int i=0 ; i<array.length; i++) {
			sum += array[i];}
			
			if (sum > 100) {
			 check = true;}
			return check;
			}


//10. method to return average of array elements
			public static double arrayAverage (double[] array) {
			double sum=0;
			for (int i=0 ; i<array.length; i++) {
			sum += array[i];}
			return sum / array.length;
			}
			
			
//11. method to check array with greater sum of elements
			public static Boolean greaterAverage (double[] array1, double[] array2) {
			double sumArray1 =0;
			double sumArray2 =0;
			boolean check = false;
			
			for (int i=0 ; i<array1.length; i++) {
			sumArray1 += array1[i];}
			
			for (int i=0 ; i<array2.length; i++) {
				sumArray2 += array2[i];}
			//System.out.println((sumArray1/array1.length) +" " + (sumArray2/array2.length));
			if ((sumArray1/array1.length) > (sumArray2/array2.length)) {
			 check = true;}
			return check;
			}

			
//12. method to check if drink will be bought
			public static Boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
				Boolean check = false;
				if(isHotOutside && (moneyInPocket > 10.50)) {
					check = true;}
				return check;
			}
			
/*13. This method checks to see if week 4 coding assignment
			is completed. The method takes a boolean
			isComplete and a double questionsAnswered.
			If isComplete is true and questionsAnswered is
			at least 13, then the method will print out
			"You have completed week 4 Assignment". Otherwise
			the print statement will be 
			"You have not completed week 4 Assignment". */
			
			public static void completionStatus(boolean isComplete, double questionsAnswered) {
				if(isComplete && (questionsAnswered >= 13)) {
					System.out.println("You have completed week 4 Assignment.");}
				
				else {
					System.out.println("You have not completed week 4 Assignment.");}
			}
}
