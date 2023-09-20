package dasha;

public class Pet {
//    protected String message = "Pet's field";
    static {
        System.out.println("Pet static initializer");
    }

    {
        System.out.println("Pet instance initializer");
    }
    public Pet() {
        System.out.println("Pet instance public");
    }


}
