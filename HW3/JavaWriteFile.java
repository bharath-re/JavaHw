package HW3;

import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class JavaWriteFile {
    public static void main(String[] args) {
        String filePath = "/Users/BharathReddy/Desktop/JavaFile/RandomWrite.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("The novel opens with the Stark family, rulers of the North, " +
                    "receiving a visit from King Robert Baratheon, who offers Eddard Stark the position of " +
                    "Hand of the King following the suspicious death of the previous Hand, Jon Arryn. ");
            bw.newLine();
            bw.write("Reluctantly Eddard accepts and travels south to the capital, " +
                    "King's Landing, with his daughters Sansa and Arya.Meanwhile, Eddard's illegitimate son" +
                    " Jon Snow joins the Night's Watch,");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
