package artur.sharafutdinov;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.util.HashMap;

/**
 * Created by tatar on 11.03.17.
 */
public class JaxBUtil {
    Logger logger = Logger.getLogger(JaxBUtil.class);
    static HashMap<String, JAXBContext> jaxbCache = new HashMap<String, JAXBContext>();

    private static String getJaxbContextKey(Class<?>... classes) {
        StringBuffer stringBuffer = new StringBuffer();
        if (classes != null) {
            for (int i = 0; i < classes.length; i++) {
                String className = classes[i].getName();
                ClassLoader loader = classes[i].getClassLoader();
                int classLoader = 0;

                if (loader != null) {
                    classLoader = loader.hashCode();
                }
                String nextEntry = className + classLoader;
                stringBuffer.append(nextEntry);
            }
        }
        return stringBuffer.toString();
    }

    public static JAXBContext getJAXBContext(Class<?>... classes) {
        String classKey = getJaxbContextKey(classes);
        JAXBContext result = jaxbCache.get(classKey);

        if (result == null) {
            try {
                synchronized (JaxBUtil.class) {
                    result = jaxbCache.get(classKey);
                    if (result == null) {
                        result = JAXBContext.newInstance(classes);
                        jaxbCache.put(classKey, result);
                    }
                }
            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }
        return result;


    }
    public static Object jaxbUNMarshalConvertXMLTreeToJavaObject (String stringReadPage, Class<?> class1){
        Object dataStructureReadPage = null;
        try{
            JAXBContext jaxbContextPage = getJAXBContext(class1);
            dataStructureReadPage=(Object)jaxbContextPage.
                    createUnmarshaller().unmarshal(
                            new StringReader(stringReadPage));
        } catch (JAXBException e){
            e.printStackTrace();
        }
        return dataStructureReadPage;
    }
}

