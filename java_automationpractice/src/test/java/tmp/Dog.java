package tmp;

public class Dog implements IBeing {

    String name;
    public String bark(){
        return "guau";
    }

    @Override
    public String communicate() {
        return "guau";
    }
}
