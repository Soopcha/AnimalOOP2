public class Fish {
    private String name;

    static {  //статический
        System.out.println("Fish статический конструктор ");
    }
    { //анонимный конструктор
        System.out.println("Fish анонимный конструктор ");
    }

    public Fish(String name) {
        this.name = name;
        System.out.println("Fish"); //Fish instance public
    }
}
