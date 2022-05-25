package tmp;

public class Cat implements IBeing {
    public String maullar(){
        return "miau";
    }

    @Override
    public String communicate() {
        return "miau";
    }
}
