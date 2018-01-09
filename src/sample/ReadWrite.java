package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by a565673 on 29.11.2014.
 */
public class ReadWrite {


    public void write(String filename,String x){
        try
        {
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(x+'\n');//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public List<String> read(String filepath) throws FileNotFoundException {


        Scanner s = new Scanner(new File(filepath));
        List<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();

    return list;
    }

    public void writeList(String filename,List<Integer> list){
        int i=0;
        for(i=0;i<list.size();i++) {
            write(filename, String.valueOf(list.get(i)));
        }
    }
}
