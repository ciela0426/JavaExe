package ch19.server.echoclient01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 클라이언트는 서버와 연결되어야 한다.
 * 1) IP, Port을 소켓객체 설정하고 연결
 * 2) 연결 후 서버<->클라이언트 자유롭게 통신
 * 3) 다 마치면 스트림 종료
 */
public class EchoClient {
	public static void main(String[] args) {
		final int PORT = 9000;
		try {
			// IP, Port로 서버 프로그램과 연결 시도 후 성공하면(서버에서는 accept()가 리턴)
			// 스트림 생성
			// 그리고 연결된 socket객체 리
			Socket socket = new Socket("192.168.0.50", PORT);
			BufferedReader keyboard = new BufferedReader(
					new InputStreamReader(System.in));
			OutputStream out = socket.getOutputStream(); //	서버로 전송 stream
			InputStream in = socket.getInputStream(); // 서버에서 수신 stream
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); // 전송
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); // 수신
			
			String line;
			while(true) {
				System.out.println("입력 >> ");
				line = keyboard.readLine();
				if(line.equals("quit")) break;
				pw.println(line);
				pw.flush();
				
				// 서버는 받은 후 클라이언트로 echo
				line = br.readLine();
				System.out.println("서버로부터 echo 문자열 : " + line); 
			}
			System.out.println("client quit");
			keyboard.close();
			pw.close();
			br.close();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
