package Ex;
import java.io.*;
import java.net.*;

public class Ex3 {

	public static void main(String[] args) {
		URL url = null;
		String adress = "https://rebeccacho.gitbooks.io/java-study-group/content/chapter16.html";
		String line = "";
		
		try {
			url = new URL(adress);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString : "+conn.toString());
			System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());
			System.out.println(conn.getConnectTimeout());
//			System.out.println(conn.getContent());
			System.out.println(conn.getContentEncoding());
			System.out.println(conn.getContentLength());
			System.out.println(conn.getContentType());
			System.out.println(conn.getDate());
			System.out.println(conn.getDefaultAllowUserInteraction());
			System.out.println(conn.getDoInput());
			System.out.println(conn.getDoInput());
			System.out.println(conn.getDefaultUseCaches());
			System.out.println(conn.getExpiration());
			System.out.println(conn.getHeaderFields());
			System.out.println(conn.getIfModifiedSince());
			System.out.println(conn.getLastModified());
			System.out.println(conn.getReadTimeout());
			System.out.println(conn.getURL());
			System.out.println(conn.getUseCaches());
			
			
		} catch (Exception e) {
			e.printStackTrace();		}

		
	}

}
