public class HelloWorld {
    String strTest ;

    HelloWorld(){
        System.out.println("In Defined constructor");
    }

    public static void main (String args[]){
        HelloWorld hw = new HelloWorld();
        hw.strTest = "Initialised Instance Variable from Main";
        System.out.println("Print Instance Variable strTest: " + hw.strTest);
    }
}
