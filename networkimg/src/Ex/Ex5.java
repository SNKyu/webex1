package Ex;

import java.io.*;
import java.net.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex5 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비되었습니다. ");
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println(getTime() + "연결요청을 기다립니다. ");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "로 부터 연결요청이 들어왔습니다. ");
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했스비낟. ");

				dos.close();
				socket.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	static String getTime() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("[hh:mm:ss]");

		return df.format(time);
	}

}
