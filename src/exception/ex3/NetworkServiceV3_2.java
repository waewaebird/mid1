package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        //catch 블록 순서 중요하다.
        // 더 Detail한 걸 먼저 잡아야 한다.
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (NetworkClientExceptionV3 e)  {
            System.out.println("[네트워크 오류] 메시지 : " + e.getMessage());
        } catch (Exception e)  {
            System.out.println("[알수 없는 오류] 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
