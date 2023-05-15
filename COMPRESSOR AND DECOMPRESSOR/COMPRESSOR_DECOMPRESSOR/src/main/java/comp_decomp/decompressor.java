/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author USER
 */
public class decompressor {
    
    public static void method(File file) throws Exception{
        String fileDirectory = file.getParent();
        
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"DecompressedFile");
        
        byte [] buffer = new byte [1024];
        int len;
        
        while((len=gzip.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        
        gzip.close();
        fos.close();
        fis.close();
    }
    
    public satic vois main(String [] args){
        File path = new File("D:\\PROJECTS\\COMPRESSOR AND DECOMPRESSOR/CompressedFile.gz");
        method(path);
    }
}
