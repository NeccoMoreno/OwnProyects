package Model;

import java.io.*;

/**
 * Created by MORENONIC on 19/01/2015.
 */
public class FileReader {

    private FileLoader fileLoader;
    private String[] fileLine;
    private BufferedReader br;
    private String line;

    public FileReader(String dir){
        this.fileLoader = new FileLoader(dir);
        this.line = "";

    }

    public void readTextLine(){
        try {
            for (int i = 0; i < fileLoader.getTotalStructure().length ; i++) {
                for (int j = 1; j < fileLoader.getTotalStructure()[i].length; j++) {

                    br = new BufferedReader(new java.io.FileReader(fileLoader.getTotalStructure()[i][j]));
                    while (br.readLine() != null) {
                        line = br.readLine();
                        System.out.println(line);
                        //fileLine = line.split(",");
                    }

                }
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
