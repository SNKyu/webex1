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
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�. ");
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println(getTime() + "�����û�� ��ٸ��ϴ�. ");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "�� ���� �����û�� ���Խ��ϴ�. ");
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "�����͸� �����߽���. ");

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
