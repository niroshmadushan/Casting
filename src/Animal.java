public class Animal {
    String name;
    void setName(){
        System.out.println("Elephant");
    }
}
class fish extends Animal{
    String colour;
    void setName(){
        System.out.println("Blue fish");
    }
}class run {
    public static void main(String[] args) {
            Animal a =new fish();
            a.name="Alagoduwa";
            fish  f =new fish();
            f.name="linna";
            f.colour="gray";
        System.out.println("subclass objects");
        System.out.println("name:-"+a.name);
        a.setName();
        System.out.println("super objects");
        System.out.println("name:-"+f.name);
        f.setName();
    }
}