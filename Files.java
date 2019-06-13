/*
A stream can be defined as a sequence of data. There are two kinds of Streams:
    - InPutStream − The InputStream is used to read data from a source.
    - OutPutStream − The OutputStream is used for writing data to a destination
*/
import java.io.*;
public class Files{

    public static void main(String args[]) throws IOException {
        /*To create a file you can use:
        * File f = new File("C:/java/hello"); Then...
        * InputStream f = new FileInputStream(f); Or OutputStream f = new FileOutputStream(f);
        */
        FileInputStream in = null;//For 8 bits
        FileOutputStream out = null;//For 8 bits

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

        FileReader in2 = null;//For 16 bits
        FileWriter out2 = null;//For 16 bits

        try {
            in2 = new FileReader("input2.txt");
            out2 = new FileWriter("output2.txt");

            int c2;
            while ((c2 = in2.read()) != -1) {
                out2.write(c2);
            }
        }finally {
            if (in2 != null) {
                in2.close();
            }
            if (out2 != null) {
                out2.close();
            }
        }

        //Read from console
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally {
            if (cin != null) {
                cin.close();
            }
        }

        /*Create DIrectories
            - The mkdir( ) method creates a directory, returning true on success and false on failure.
            Failure indicates that the path specified in the File object already exists,
            or that the directory cannot be created because the entire path does not exist yet.

            - The mkdirs() method creates both a directory and all the parents of the directory.
        */
        String dirname = "tmp/user/java/bin";
        File d = new File(dirname);
        // Create directory now.
        d.mkdirs();
        /*NOTE: If you use a path as "tmp/user/java/bin", you are refering to current working directory
        But if  you use a path as "/tmp/user/java/bin", you are refering to C:/ directory*/

        File file = null;
        String[] paths;
        try {
            // create new file object
            file = new File("tmp");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println("This is your path: " + path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
