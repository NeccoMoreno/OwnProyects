package Model;
import java.io.*;

/**
 * Created by MORENONIC on 19/01/2015.
 */
public class FileLoader {
    private File directory;
    private File[] directories;
    private File[] files;
    private File[][] totalStructure;

    public FileLoader(String dir){
        this.directory = new File(dir);
        if(directory.exists()){
            directories = directory.listFiles();
            for (int i = 0; i < directories.length; i++) {
                if(directories[i].exists()){
                    files = directories[i].listFiles();
                }
            }
            totalStructure = new File[directories.length][files.length+1];
            for (int i = 0; i <totalStructure.length ; i++) {
                totalStructure[i][0] = directories[i];
                for (int j = 1; j <totalStructure[i].length ; j++) {
                totalStructure[i][j] = files[j-1];

                }
            }
        }


    //TODO ver si puedo cambiar todo a una estructura unica (LISTO!)
    }

    public File[][] getTotalStructure(){
        return totalStructure;
    }

    public void printFileLength(){
        for (int i = 0; i < totalStructure.length; i++) {
            for (int j = 0; j < totalStructure[i].length; j++) {
                System.out.println(totalStructure[i][j].getName());
            }
        }
    }
}
