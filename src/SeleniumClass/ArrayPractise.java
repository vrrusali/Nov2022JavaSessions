package SeleniumClass;

	/* What is array?

	Types of array..
	If we want to store similar type of data, then we should not create different variables. We should go with Arrays. We can combine all data together, using a single variable name and allocate common memory.
	Example: store all student names, store all product names.
	There are 2 types of array:
	1- static array
	2- dynamic array
	
	1. STATIC ARRAY
	Issues-This type of array leads to memory wastage, if all the allotted space is not used
	Also scalability is the issue, there will be downtime to increase the size if the requirement goes up
	It cannot store different data type values.

	To overcome these limitation we have to use Dynamic arrays
	
	Ex: 
	int price[]=new int[200];
	price[0]=200;
	price[1]=10;
	Since this is an integer array: 
	integer type - uses 4 bytes ;
	in this case :                               4x200=800 bytes
	only two elements are occupied : 2x4=8 bytes
	Total of 792 bytes are unused (wasted)
-------------------------------------------------------------
	int pages[]=new int [5];
	if there are more pages to be added (dynamic website), then there is downtime to increase the size of the array to accommodate for the new requirement.
	*/

public class ArrayPractise {

	public static void main(String[] args) {
		//1. for loop is used to get thru all the array elements
		int arr[]=new int[] {0,100,20};
		for(int i=0;i<arr.length;i++){
		System.out.println("[" + i+ "] : " +arr[i]);
		}
		System.out.println("----------------------------------------------");
		
		//2. for each loop(enhanced loop) can also be used to do the same thing
		/*for(<array_datatype> <var_name> : <array_name>){
			Sop(<var_name>);
			}
			Ex: int arr[]=new int[] {0,100,20};*/

			int index=0;//can include a index
			for(int a : arr){
			System.out.println( index + ": " +a);
			index++;
			}
			System.out.println("----------------------------------------------");
			
		//3. Time complexity of for loop and enhanced for loop are same
			//O(n)
		
		//4. for each loop
			/*
			 * enhanced for loop
			   Syntax:
			   for(int e : i) {
			   Sop(e);
				}
			 */
		
		//5.Object
			/*inbuild class in Java 
			is a parent class of all the classes in Java
			Syntax: 
			Object arrayName[] = new Object[size];
			
			Alphanumeric data can be saved in Object type array. Ex- yg6tgyt5f*/
			
		//6. Array declaration
			
			/* Integer array:*/
				int p[] = new int[] { 10, 2, 3, 5 }; // using this syntax we can assign values to an array
				int a[] = new int[4];
				/*a[0] = 1;
				  a[1] = 2;
				  a[2] = 3;
				  a[3] = 4; */
				
				//iterate array through typical for loop
				for(int i=0; i<p.length;i++){
					System.out.println("The value at index[" + i + "]" + "=" + p[i]);}

				//Using typical for loop, we are iterating using index and hence we need to use integer while iterating.
				/* iterate an array using enhanced for loop. Here while using enhanced
				for loop we use similar data type variable with respect to the array we are iterating */

				System.out.println("----------------------------------------------");
				int count = 0;
				for (int e : p) {
					System.out.println("The value at index[" + count + "]" + "=" + e);
					}
		System.out.println("----------------------------------------------");
		
		// 7.************* Float array *********************** 

		/*While assigning values to the float array, there is no need to specify decimal values to the array elements. 
		 * By default all floating literals are considered as Double literals. If we mention decimal values in float array 
		 * then we have to append each value with f or F otherwise we get error - Type mismatch: cannot convert from double to float
		 */

		float q[] = new float[] { 1, 2, 3, 4 };
		float f[] = new float[] { 1.0f, 2.0f, 5.0f, 6.0f };
		float k[] = new float[4];
			/* k[0] = 1.0f;
                k[1] = 2;
                k[2] = 3.0f;
                k[3] = 4.0f;*/

// The concept of object array comes into picture wherein if we want to save heterogeneous data.

		Object obj[]=new Object[4];
		Object obj1[]=new Object[] {"John","Male",5.7,57.2};

		for(Object e:obj1){
			System.out.println(e);
			}
	System.out.println("------------------------arrayIndexOutOfBoundException-------------------------------------");	
		int m[]=new int[] {0,10,20,30}; //array declared with size 4
		for(int i=0;i<=m.length-1; i++)
		{
		System.out.println("["+i+"]:"+m[i] );
		}
		//m[4]=98; //this will throw arrayIndexOutOfBoundException as the 'Hi' is 3.
		//m[-1]=98; //this will throw arrayIndexOutOfBoundException as the 'Li' is 0.
		
		System.out.println("------------------------Object Array-------------------------------------");	
		Object emp[]=new Object[3];
		emp[0]="Diksha"; // denoting name-string type
		emp[1]='F'; //denoting gender-char type
		emp[2]=25; //denoting age-int type
		int len=emp.length-1;
		System.out.println(len);
		
		
		System.out.println("---------------------------------------------------------------------");
		for(Object e:emp) {
			System.out.println(e);}
				
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<=emp.length-1;i++) {
		System.out.println(emp[i]);
		}
		
		System.out.println("---------------------------------------------------------------------");
		char ch[]= new char[4];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		System.out.println("Character Print");
		for(char e:ch) {
		System.out.println(e);
		}
		
		System.out.println("Number Print");
		for(char e:ch) {
		System.out.println((int)e);
		}
		
		System.out.println("Number Print");
		for(int t:ch) {
		System.out.println(t);
		}
		}
 }
