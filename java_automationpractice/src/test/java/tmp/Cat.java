package tmp;

public class Cat extends Identity implements IBeing {
    public String maullar(){
        return "miau";
    }

    @Override
    public String communicate() {
        return "miau";
    }

    @Override
    public String beingClass() {
        return "felino";
    }
}
