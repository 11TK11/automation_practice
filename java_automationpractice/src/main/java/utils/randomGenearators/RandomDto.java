package utils.randomGenearators;

public abstract class RandomDto<T> {
    protected T dto;
    public T getDto(){
        return dto;
    }
    public abstract void setDto();
}
