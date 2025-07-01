
/* 3. Write a generic method swap that swaps the positions of two elements in an array.
Demonstrate this method with arrays of different types (e.g., Integer, String).
 */

public class SwapArray<T> {
    
private T array[];

// Setter
public void setItem(T[] array){
    this.array=array;
}

// Getter
public T[] getItem() {
    return array;
}

// Method to swap elements in an array

public static <E> void swap(E[] array , int i,int j){
    E temp = array[i];
    array [i] = array[j];
    array[j]=temp;
}

public static void main(String[] args) {
    

    //Intger array:
    Integer[] intArray={10,20,30,40,50};
    System.out.println("Before swapping array:");
    for(int i : intArray) 
    System.out.println(i + " ");
    swap(intArray, 1,2);  // Swap index 1 and 2


    System.out.println("After swapping array:");
    for(int i : intArray)  System.out.println(i + " ");


    // String array:

    String[] strgArray={"First","Middle","Last"};
    System.out.println("Before Swapping array");
    for(String s: strgArray) System.out.println(s +" "); 


    swap(strgArray, 2, 0);
    System.out.println("After Swapping array");
    for(String s: strgArray) System.out.println(s +" "); 
    



}

}
