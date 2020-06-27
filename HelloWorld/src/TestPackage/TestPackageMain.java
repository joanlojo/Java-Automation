package TestPackage;


public class TestPackageMain {
    int defaultNumber = 4; //you can access to the default values always meanwhile you are on the same package
    protected int number = 10;
    private int privateNumber = 0; // you can access only inside the class where you declare them
    public int accesibleNumber = 40;


    public void TestPack(){
        System.out.print("Desde fuera");
    }
}
