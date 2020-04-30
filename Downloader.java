import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/*
 * Created on Dec 4, 2005
 *
 */

/**
 * Downloads the file at the specified url and saves it as a text file
 */
public class Downloader {

  public static void main(String[] args) throws IOException {
    String sUrl = "http://www.example.com";
    String sOutput = "downloaded.txt";
    if (args.length>=1) {
      sUrl = args[0]; 
    }
    if (args.length>=2) {
      sOutput = args[1]; 
    }
    download(sUrl, sOutput);
  }

	/**
	 * @param url
	 * @param output
	 * @throws IOException
	 */
	private static void download(String url, String output) throws IOException {
    
    URL u = new URL(url);
    URLConnection uc = u.openConnection();
    uc.connect();
    InputStream in = uc.getInputStream();
    try {
    	FileOutputStream out = new FileOutputStream(output);
      try {
        copyStream(in, out);
      } finally {
      	out.close();
      }
    } finally {
    	in.close(); 
    }
	}  
  
  public static void copyStream(InputStream is, OutputStream os) throws IOException {
    int ch = is.read();
    while(ch >= 0) {
      os.write(ch);
      ch = is.read(); 
    }
  }
  
}
