package Model;
import java.io.*;

/**
 * Created by MORENONIC on 19/01/2015.
 */
public class FileLoader {
    private File directory;
    private File[] directories;
    private File[] files;
    //private File[][] totalStructure;

    public FileLoader(String dir){

        this.directory = new File(dir);

        if(directory.exists()){
            directories = directory.listFiles();
            for (int i = 0; i < directories.length; i++) {
                if(directories[i].exists()){
                    files = directories[i].listFiles();
                }
            }
        }
    //TODO ver si puedo cambiar todo a una estructura unica
    }

    public File[] getFiles(){
        return files;
    }
    public File[] getDirectories(){
        return directories;
    }
}
