import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class YtDownloader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи этот ебучий URL");
        StringBuffer url = new StringBuffer(sc.next());
        url.insert(12,"ss");

        Desktop doska = Desktop.getDesktop();
        try{
            doska.browse(URI.create(url.toString()));
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
