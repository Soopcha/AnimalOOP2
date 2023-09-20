public class Fish {
    private String name;

    static {  //статический
        System.out.println("Fish static initializer");
    }
    { //анонимный конструктор
        System.out.println("Fish instance initializer");
    }

    public Fish(String name) {
        this.name = name;
        System.out.println("Fish"); //Fish instance public
    }
}
