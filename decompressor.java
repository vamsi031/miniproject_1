import java.io.*;
import java.util.zip.GZIPInputStream;

public class decompressor {
    public static void method(File file) throws IOException{
        String fileDirectory = file.getParent();

        FileInputStream fis = new FileInputStream(file);

        FileOutputStream fos = new FileOutputStream(fileDirectory+"\\decompressedFile");

        GZIPInputStream Gzip = new GZIPInputStream(fis);

        byte[] buffer = new byte[1024];
        int len;

        while((len=Gzip.read(buffer))!= -1){
            fos.write(buffer,0,len);
        }
        Gzip.close();
        fis.close();
        fos.close();


    }

    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\admin\\Desktop\\mini projects\\compressedFile.gz");
        method(file);
    }
}
