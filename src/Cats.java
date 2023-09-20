public class Cats extends Animal {
    private String name;
    private Integer age;
    private String breed; // порода
    // стат конструкторы выполняется перед созданием класса

    static {  //статический
        System.out.println("Cats static initializer");
    }
    { //анонимный конструктор
        System.out.println("Cats instance initializer");
    }


    public Cats(String name, Integer age, String breed) {
        //автоматическии вводит super();
        this.name = name;
        this.age = age;
        this.breed = breed;
        System.out.println("Cats");  //"Cats instance public
    }
}
