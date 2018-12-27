package top.jsen.gend.test;

import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-13
 */
@Ignore
public class TestOs {

    @Test
    public void test() {
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        if (osName.startsWith("Mac OS")) {
            // 苹果
        } else if (osName.startsWith("Windows")) {
            // windows
        } else {
            // unix or linux
        }
    }
}
