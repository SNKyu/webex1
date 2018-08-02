package Ex;

import java.net.*;
import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;

		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAdress() : " + ip.getHostAddress());
			System.out.println("tostring() : " + ip.toString());

			byte[] ipAdrr = ip.getAddress();
			System.out.println("getAddress : " + Arrays.toString(ipAdrr));

			String result = "";
			for (int i = 0; i < ipAdrr.length; i++) {
				result += (ipAdrr[i] < 0) ? ipAdrr[i] + 256 : ipAdrr[i];
				result += ".";
			}
			System.out.println("getAddress() : " + result);
			System.out.println();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAdress() : " + ip.getHostAddress());
			System.out.println();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		try {
			ipArr = InetAddress.getAllByName("www.naver.com");

			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
