package artur.sharafutdinov.watcher;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by tatar on 12.03.17.
 */
public class FileWatcherTest {
    public static void main(String args[]) throws IOException{
        try {
            // set up the command and parameter
            String pythonScriptPath = "/home/tatar/Yandex.Disk/Java_study/market/intelligance/compute.py";
            String[] cmd = new String[2];
            cmd[0] = "python"; // check version of installed python: python -V
            cmd[1] = pythonScriptPath;

// create runtime to execute external command
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(cmd);

// retrieve output from python script
            BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = "";
            while ((line = bfr.readLine()) != null) {


            }
        } catch (Exception e){
            e.printStackTrace();
        }
        // monitor a single file
        TimerTask task = new FileWatcher( new File("/home/tatar/Yandex.Disk/Java_study/market/data.xml") ) {
            protected void onChange( File file ) {
                // here we code the action on a change
                System.out.println( "File "+ file.getName() +" have change !" );
            }
        };

        Scanner s = new Scanner(new File("data.xml"));
        String line = null;
        while (s.hasNextLine()) {
            line = s.nextLine();
            System.out.println(line);
        }
        s.close();
    }

}
