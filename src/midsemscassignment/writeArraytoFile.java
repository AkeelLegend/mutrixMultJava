package midsemscassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Akeel Muhammed
 */
public class writeArraytoFile {
    public writeArraytoFile(int[][] a, String filepath) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
        bw.write("your answer is\n");
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(filepath, true));
        
        for(int i=0; i< a.length; i++){
            bw1.append('\n');
            for(int j=0; j<a[i].length; j++){
                bw1.append((char)a[i][j]);
                bw1.append(',');
            }
        }
        
    }
}

