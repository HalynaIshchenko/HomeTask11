import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
/* Створити довільний клас , описати його. Створити в мейн його екземпляр, дослідити всю інформацію про нього :
- отримати всі методи (private в тому числі);
- отримати поля класу (private в тому числі);
- отримати всі конструктори;
- створити екземпляр класу з двох різних конструкторів;
- викликати 2 методи (один - з параметрами, другий - без параметрів).
 */

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Dog tyzik = new Dog("Tyzik", 7);
        analyzeClass(tyzik);

        Dog tyzik2 = (Dog) Dog.class.getConstructors()[0].newInstance("Tyzik2", 5);
        tyzik2.setAge(9);
        System.out.println("Виклик методу з аргументом: " + tyzik2);

        Dog tyzik3 = (Dog) Dog.class.getConstructors()[1].newInstance("Tyzik3");
        System.out.println("Виклик методу без аргументу: " + tyzik3.getName());
    }
    public static void analyzeClass (Object o){
        Class clazz = o.getClass();
        System.out.println("Назва класу: " + clazz);
        System.out.println("Поля класу: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Методи класу: " + Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструктори класу: " + Arrays.toString(clazz.getConstructors()));


    }


}
