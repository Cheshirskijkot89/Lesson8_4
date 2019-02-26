package chizhenko;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		loadArray(new File("array.txt")); 

	}

	public static void loadArray(File myFyle) {

		ArrayList<String[]> list = new ArrayList<>();
		String text = "";

		try (BufferedReader br = new BufferedReader(new FileReader(myFyle))) {

			for (; (text = br.readLine()) != null;) {

				list.add(text.split("/t"));
			}

		} catch (IOException e) {
			System.out.println(e);
		}
		
		for (String[] current:list) {
			System.out.println(Arrays.toString(current));
		}

	}

}
