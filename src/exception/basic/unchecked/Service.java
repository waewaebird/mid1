package exception.basic.unchecked;

public class Service {
    /*
    * Unckecked 예외는 잡거나, 던지지 않아도 된다.
    * 안잡으면 자동으로 밖으로 던짐
    * */

    Client client = new Client();

    //필요한 경우 예외를 잡아서 처리할 수 있다.
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 예외가 상위로 넘어간다.
    // 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
    public void callThrow() {
        client.call();
    }
}
