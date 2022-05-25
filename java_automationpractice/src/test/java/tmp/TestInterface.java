package tmp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestInterface {
    @Test
    public void testInterface() {
        Dog dog = new Dog();
        dog.communicate();
        dog.bark();
        Cat cat=new Cat();
        cat.communicate();
        //////////////////////////////////////////////////////
        Map<String,String> a = new HashMap<>();
        //a.forEach();
        List<String> b = new ArrayList<>();
        //b.forEach();
        //////////////////////////////////////////////////////
        IBeing aa = dog;
        aa=cat;
        aa.communicate();
        //////////////////////////////////////////////////////
        Strategy strategy = new Strategy(dog);
        System.out.println(strategy.executeStrategy());
        strategy = new Strategy(cat);
        System.out.println(strategy.executeStrategy());
        strategy = new Strategy(new Human());
        System.out.println(strategy.executeStrategy());
    }

    @Test
    public void testLambdas(){
        /*
        parameter -> expression
        (parameter1, parameter2) -> expression
        (parameter1, parameter2) -> { code block }
        * */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);
        numbers.forEach((number) -> {System.out.println(number);Dog dog= new Dog();System.out.println(number+dog.communicate());});

        Map<String,Integer> m = new HashMap<>();
        m.put("1",1);
        m.put("2",2);
        m.put("3",3);
        //m.forEach((k,v)->System.out.println(k+"-"+v));

        //Abs1.
    }
}
