package exception.basic.unchecked;

/*
* RuntimeException 받으면 언체크 예외가 된다.
* */
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}
