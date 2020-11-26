package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends RuntimeException{
    public NoMoreIceCreamException(){
        super();
    }

    public NoMoreIceCreamException(String message){
        super(message);
    }

    public NoMoreIceCreamException(String message, Throwable cause){
        super(message, cause);
    }

    public NoMoreIceCreamException(Throwable cause){
        super(cause);
    }
}
