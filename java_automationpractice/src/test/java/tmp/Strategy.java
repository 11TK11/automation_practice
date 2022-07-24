package tmp;

public class Strategy {
    private IBeing iBeing;
    public Strategy(IBeing iBeing){
        this.iBeing = iBeing;
    }

    public String executeStrategy(){
        return iBeing.communicate();
    }
}
