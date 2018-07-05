package ch32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Write7ToFile3 {
    public static void main(String[] args) {
        try(OutputStream out = new FileOutputStream("data.dat")) {
            out.write(7);
        }
        catch(IOException e) {
            e.printStackTrace();       
        }
    }
}