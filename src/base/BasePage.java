package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasePage {

    protected static String getTextFromUser(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        try {
            System.out.println("Enter text:");
            String line = br.readLine();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
