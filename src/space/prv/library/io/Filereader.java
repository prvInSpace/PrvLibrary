package space.prv.library.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {

    public static String[] readAllLines(String path) {
        ArrayList<String> lines = new ArrayList<>();
        File file = new File(path);
        if(file.exists()){
            try{
                Scanner in = new Scanner(new FileReader(file));
                while(in.hasNextLine()){
                    lines.add(in.nextLine());
               }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return lines.toArray(new String[lines.size()]);
    }
}
