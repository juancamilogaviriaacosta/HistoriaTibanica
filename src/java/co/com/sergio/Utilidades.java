package co.com.sergio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 *
 * @author juan
 */
public class Utilidades {

    public static String getAbsoluteSrcPath() {
        URL url = Utilidades.class.getResource("Utilidades.class");
        File f = new File(url.getPath()).getParentFile();
        String srcPath = f.getAbsolutePath().replaceAll("%20", " ");
        return srcPath;
    }
    
    public static String getPropiedad(String propiedad) {
        try (FileInputStream fis = new FileInputStream(Utilidades.getAbsoluteSrcPath() + File.separator + "propiedades.properties")) {
            Properties properties = new Properties();
            properties.load(fis);
            return properties.getProperty(propiedad);
        } catch (IOException ex) {
            return null;
        }
    }
}
