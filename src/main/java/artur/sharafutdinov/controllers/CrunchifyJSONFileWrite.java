package artur.sharafutdinov.controllers;


import artur.sharafutdinov.observer.FromXml;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by tatar on 12.03.17.
 */
public class CrunchifyJSONFileWrite {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        String field1="field1";
        FromXml fieldOne = new FromXml();
        fieldOne.getDataFin(field1);

        JSONObject obj = new JSONObject();
        obj.put("Name", "crunchify.com");
        obj.put("Author", "App Shah");

        JSONArray company = new JSONArray();
        company.add("dscda: ");
        company.add("Compnay: Paypal");
        company.add("Compnay: Google");
        obj.put("Company List", company);

        // try-with-resources statement based on post comment below :)
        try  {
            FileWriter file = new FileWriter("data1.json");
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
