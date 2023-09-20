public class Animal {
    public Animal(){
        System.out.println("Animal "); //"Animal instance public
    }

    static {  //статический
        System.out.println("Animal static initializer");
    } /*Статический блок инициализации выполняется при загрузке класса Animal.
    Это происходит один раз, когда класс впервые используется, например, при создании объекта класса или
     при вызове статических методов/переменных.
   - В данном случае, статический блок выводит сообщение "Animal static initializer"
   */


    { //анонимный конструктор
        System.out.println("Animal instance initializer");
    } /*Экземплярный блок инициализации (`{}` блок):
   - Экземплярный блок инициализации выполняется при создании каждого объекта класса Pet. Он выполняется перед выполнением конструктора.
   */

    Fish fish = new Fish("Рыбка");

}
