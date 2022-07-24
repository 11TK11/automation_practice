package tmp;

public class Human implements IBeing, ITerrestre{
    public String talk(){
        return "hi!";
    }

    @Override
    public String communicate() {
        return "hi!";
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}
