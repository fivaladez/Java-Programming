import java.io.*;
public class Files2 {

    public static void main (String [] args){
        File f = null;
        String[] strs = {"test1.txt", "test2.txt"};
        try {
            // for each string in string array
            for(String s:strs ) {
                // create new file
                f = new File(s);
                f.createNewFile();

                // true if the file is executable
                boolean bool = f.canExecute();

                // find the absolute path
                String a = f.getAbsolutePath();

                // prints absolute path
                System.out.print(a);

                // prints
                System.out.println(" is executable: "+ bool);

                // creates a FileWriter Object
                FileWriter writer = new FileWriter(f);

                // Writes the content to the file
                writer.write("This\n is\n an\n example\n");
                writer.flush();
                writer.close();

                // Creates a FileReader Object
                FileReader fr = new FileReader(f);
                char [] b = new char[50];
                fr.read(b);   // reads the content to the array

                for(char c : b)
                    System.out.print(c);   // prints the characters one by one
                fr.close();



            }
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
