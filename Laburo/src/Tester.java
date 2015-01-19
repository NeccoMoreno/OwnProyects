import Model.FileLoader;
import Model.FileReader;

/**
 * Created by MORENONIC on 19/01/2015.
 */
public class Tester {
    public static void main(String[] args) {
    /*    String[][] prueba = new String[10][7];
        for (int i = 0; i < prueba.length; i++) {
            prueba[i][0] = "directorio" + (i+1);
            for (int j = 1; j < prueba[i].length; j++) {
                prueba[i][j] = "archivo" + j;
            }

        }

        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba[i].length; j++) {
                System.out.println(prueba[i][j]);
            }
        }*/
/*
        FileLoader fl = new FileLoader("D:\\LOGS");
        fl.printFileLength();

  */
        FileReader fr = new FileReader("D:\\LOGS");
        fr.readTextLine();

    }

}
