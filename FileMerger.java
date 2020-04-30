import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Merges all the files in a folder into a single file.
 */
public class FileMerger {

	public static void main(String[] args) throws IOException {
    String sFolder = getArg(args, 0, ".");
    String sOutFile = getArg(args, 1, "file.merged.txt");
    String sExtension = getArg(args, 2, ".java");
    fileMerge(sFolder, sOutFile, sExtension);
	}
  
  public static String getArg(String[] args, int anIndex, String aDefaultValue) {
    if (args.length > anIndex) {
    	return args[anIndex];
    }
    return aDefaultValue;
  }

	private static void fileMerge(String folder, String anOutputFile, String anExtension) throws IOException {
		File fileFolder = new File(folder);
    File files[] = fileFolder.listFiles();
    FileOutputStream out = new FileOutputStream(anOutputFile);
    try {
      for (int i=0; i<files.length; i++) {
      	File file = files[i];
        if (file.getName().endsWith(anExtension)) {
          FileInputStream in = new FileInputStream(file.getAbsolutePath());
          try {
            out.write(("/* Begin file: " + file.getName() + " */\n\r").getBytes());
            copyStream(in, out);
            out.write(("/* End file: " + file.getName() + " */\n\r").getBytes());
          } finally {
          	in.close();
          }
        }
      }
    } finally {
    	out.close(); 
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
