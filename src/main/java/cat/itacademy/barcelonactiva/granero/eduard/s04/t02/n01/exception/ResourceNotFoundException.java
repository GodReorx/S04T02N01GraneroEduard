package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException (String message){
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable){
        super(message,throwable);
    }
}
