package lesson8.lesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final Person person = new Person(34, "42", Sex.SPIDERMAN, 3.14);

        Class<? extends Person> aClass = person.getClass();

        Constructor<?>[] constructors = aClass.getConstructors();
        System.out.println(Arrays.toString(constructors));
        int modifiers = aClass.getModifiers();
        System.out.println("modifiers = " + modifiers);
        System.out.println("isAbstract =" + Modifier.isAbstract(modifiers));
        System.out.println("isFinal = " + Modifier.isFinal(modifiers));
        System.out.println("isPublic = " + Modifier.isPublic(modifiers));
        System.out.println("getMethods() = " + Arrays.toString(aClass.getMethods()));
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        int intAge = age.getInt(person);
        Field sex = aClass.getDeclaredField("sex");
//         sex.setAccessible(true);
        System.out.println("isSynthetic = " + sex.isSynthetic());
        System.out.println("isEnum = " + sex.isEnumConstant());
        sex.set(person, Sex.IRONMAN);
        System.out.println("person = " + person);
        System.out.println("============");


    }
}
