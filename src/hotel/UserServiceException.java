package hotel;

public class UserServiceException extends Exception{
    //wyjatki dziedzicze po klasie exception wymagaja obslugi na poziomie kompilacji.


    public UserServiceException(String message) {
        super(message);

    }
}
