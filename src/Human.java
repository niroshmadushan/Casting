public class Human {
    void printData(){
        System.out.println("Method of super class!");

    }
}
class man extends Human{
    void printData(){
        System.out.println("Method of sub class!");
    }
}
class test{
    public static void main(String[] args) {
        Human h =new man();
        Human h1 =new man();
        h.printData();
        h1.printData();
    }

}