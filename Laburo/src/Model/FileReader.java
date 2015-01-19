package Model;

import java.io.*;

/**
 * Created by MORENONIC on 19/01/2015.
 */
public class FileReader {

    private FileLoader fileLoader;
    private String[] fileLine;

    public FileReader(String dir){
        fileLoader = new FileLoader(dir);
        BufferedReader br;
        String line = "";
        int i = fileLoader.getTotalStructure().length;
        try {
            for (int j = 1; j < fileLoader.getTotalStructure()[i].length; j++) {
                br = new BufferedReader(new java.io.FileReader(fileLoader.getTotalStructure()[i][j]));
                line = br.readLine();
                fileLine = line.split(",");
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e1){
            e1.printStackTrace();
        }
    }

    public String[] getFileLine() {
        return fileLine;
    }
}
