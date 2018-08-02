package Ex;

import java.io.*;
import java.net.*;

public class Ex4 {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://ko.wikipedia.org/wiki/%ED%94%84%EB%A1%9D%EC%8B%9C_%EC%84%9C%EB%B2%84";
		String line = "";
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();

		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
