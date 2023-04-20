public class World {
    String name;
    void process(){
        System.out.println("Earth can rotation");
    }
}
class earth extends World{
    int area;
    void process(){
        System.out.println("Earth is world");

    }
}class TestingCasting{
    public static void main(String[] args) {
        World w =new earth();
        w.name="Earth";
        System.out.println(w.name);
        w.process();
        earth e =(earth)w;
        e.area=510;
        System.out.println(e.name);
        System.out.println(e.area);
        e.process();
    }
}