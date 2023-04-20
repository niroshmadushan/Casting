public class Parent {
    String name;
    void display(){
        System.out.println("Super class is running");
    }
}
class child extends Parent{
    int age;
    void display(){
        System.out.println("Sub class is running");
    }
}
class Downcasting {
    public static void main(String[] args) {
        Parent p =new child();
        p.name ="gawesh";
        child c =(child)p;
        c.age =25;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}