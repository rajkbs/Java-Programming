public class FirstJavaProgram {
    public void display(){
        System.out.println("Hai");
    }
    public static void main(String[] args) {
        System.out.println("Hello Java");
        FirstJavaProgram obj = new FirstJavaProgram();
        obj.display();
        JavaTesting obj1 = new JavaTesting();
        obj1.message();
        JavaTesting.message2();
    }
}
class JavaTesting{
    public void message(){
        System.out.println("Another Class");
    }
    public static void message2(){
        System.out.println("A static Method");
    }
}

