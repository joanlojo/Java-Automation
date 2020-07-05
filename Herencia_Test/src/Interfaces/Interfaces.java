package Interfaces;

public interface Interfaces {
    //interface is somethign similar to an abstract class
    //any class that implements an interface MUST implement all the methods of that interface
    //it can be very useful to define the const vars of your program, and then you can access to them everywhere
    double ddfaultvalue = 0.0;

    //as said, Interfaces are similar to an Abstract class, here you define the methods but not the implementation
    //you just tell that the class that implements this interface, will have to use this method
    void printData();

    //from JDK 8, I can define a method, so I can say what and how. This is not very usual
    //and it's not the reason why interfaces are used, but you can always create a method without breaking
    //all the other code. Usually the interfaces are used to define the what and not the how, but if I need that, I can with "default" key
    //Also with the defautl methods, you don't need to implement/use them in the sub classes
    default void showError(){
        System.out.print("Error");
    }
}
