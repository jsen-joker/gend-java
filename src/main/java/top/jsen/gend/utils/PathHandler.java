package top.jsen.gend.utils;

import java.net.URL;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-11
 */
public class PathHandler {

    public static String getResourcePath(String res) {
        String osName = System.getProperty("os.name");

        if (osName.startsWith("Mac OS")) {
            res = "./" + res + "-drawin.so";
        } else {
            res = "./" + res + ".so";
        }

        System.out.println(res);

        URL url = PathHandler.class.getClassLoader().getResource(res);
        if (url == null) {
            return "";
        }
        return url.getPath();
//        File file = new File(new File(System.getProperties().getProperty("user.home"), ".goLibs"), res);
//        return file.getAbsolutePath();
    }
}
