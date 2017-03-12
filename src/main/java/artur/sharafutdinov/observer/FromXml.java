package artur.sharafutdinov.observer;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by tatar on 12.03.17.
 */
public class FromXml {
    public void getDataFin(String field) {
        try {
            File fromXml1 = new File("/home/tatar/Yandex.Disk/Java_study/market/data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(fromXml1);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("doc");

            Node node = nodeList.item(0);
            Element element = (Element) node;
            double amount = Double.parseDouble(element.getElementsByTagName(field).item(0).getTextContent());
            System.out.println(amount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
    /*double errorAndOmissions;

    List<Observer> observers = new ArrayList<Observer>();

    public void setErrorAndOmissions(double errorAndOmissions) {
        this.errorAndOmissions = errorAndOmissions;
    }

    public void addObserver(Observer o) {
        observers.add(o);

    }

    public void removeObserver(Observer o) {

    }

    public void notifyObservers() {
        for(Observer o: observers){
            o.handleEvent(errorAndOmissions);
        }

    }*/
/*public  Double getDataFin(String field) {
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
            while(true) {


                File fromXml1 = new File("/home/tatar/Yandex.Disk/Java_study/market/data.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document document = dBuilder.parse(fromXml1);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("doc");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node node = nodeList.item(temp);
                    Element element = (Element) node;
                    double amount = Double.parseDouble(element.getElementsByTagName(field).item(0).getTextContent());
                    notifyObservers();


                    System.out.println(amount);
                }




// display each output line form python script
                //   System.out.println(line);



            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return getDataFin(field);




    }
*/
