/* 2. Write a generic method printArray that prints all elements of an array. Test this method with
arrays of different types.
 */

public class PrintArray<T> {
    private T array[];


    // setter 
    public void setItem(T[] array){
        this.array=array;
    }
    public T[] getItem(){
        return array;
    }

    // Method to print array
    public void print(){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    // Generic method to print array
    public static<E> void printArray(E[] array){
        for (E element : array){
            System.out.println(element);
        }
    }


public static void main(String[] args) {

System.out.println("Integer");
Integer[] intArray={1,2,3,4,5};
PrintArray.printArray(intArray);

System.out.println("String");
String[] strgArray={"Ram","Shyam","Hari"};
PrintArray.printArray(strgArray);


}

}
