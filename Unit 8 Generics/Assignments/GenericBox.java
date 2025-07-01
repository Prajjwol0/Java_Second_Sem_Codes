/*1. Write a generic class Box that can hold any type of object. Demonstrate how generics can
help prevent runtime type errors by trying to add incompatible types without using generics. */

public class GenericBox<T> {
    private T item;

    // setter 
    public void setItem(T item){
        this.item=item;
    }

    // Getter
    public T getItem(){
        return item;
    }


}
