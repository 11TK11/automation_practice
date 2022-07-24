package utils;

public class FileException extends RuntimeException {
    public FileException(){
        super("There is a bad file");
    }
}
