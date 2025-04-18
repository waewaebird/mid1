package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{ // 밖으로 던지는거
        //문제 상황
        throw new MyCheckedException("ex"); // 예외를 터뜨리는거
    }
}
