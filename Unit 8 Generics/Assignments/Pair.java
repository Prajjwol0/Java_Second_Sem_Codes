/* 
4. Create a generic class Pair that holds two values of potentially different types. Add methods
to get the values and set new values. Demonstrate its usage with different type pairs. */

// T1 - Type of First value, T2 - Type of Second value

/* 
public class Pair<T1, T2> {
    
    private T1 first;
    private T2 second;

    // constructor
    public Pair(T1 first,T2 second){
        this.first=first;
        this.second=second;
    }

    // Getter  for first
    public void getFirst(T1 first){
        this.first=first;
    }
    
    //  Setter for first
    public T1 setFirst(){
        return first;
    }

    
    // Getter  for second
    public void getSecond(T2 second){
        this.second=second;
    }
    
    //  Setter for second
    public T2 setSecond(){
        return second;
    }

public static void main(String[] args) {
    Pair<Integer, String> student = new Pair<>(1, "Hello");
    System.out.println("ID: "+student.getFirst());
}

}
 */