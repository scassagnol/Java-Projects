
public class Arrays {
	
	public static void main(String[] args) {
		
	String [] pets = {"Angel", "Namie", "Narga" , "Spot", "Penny"};	//define an array
		
	int arrayLength = pets.length; //the number of elements in the array
	
	System.out.println(arrayLength);
	
	for(int i=0;i < arrayLength;i++) {     //prints every element in the array in ascending order 
		
		System.out.println(pets[i]);      
	}
	
	
	String lastNum = pets[pets.length-1];  // prints the last element in an array 

		System.out.println(lastNum);
		
		
	for (int j = pets.length-1;j >=0 ;j--) {  //prints every element in the array in descending order 
	
		System.out.println(pets[j]);
	
	}
	

	}
}

