package top.jsen.gend;

import com.sun.jna.Library;
import com.sun.jna.Native;
import top.jsen.gend.utils.PathHandler;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-11
 */
public interface LibGend extends Library {
    LibGend INSTANCE = Native.loadLibrary(Conf.SO_PATH, LibGend.class);

    long EmbedGenId();

    void EmbedInitGend(GoString.ByValue filename);

    String EmbedExpId(long id);

    long GrpcGenId();

    void GrpcInitGend(GoString.ByValue filename);

    String GrpcExpId(long id);
}
