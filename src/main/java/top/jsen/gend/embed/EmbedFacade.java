package top.jsen.gend.embed;

import top.jsen.gend.Facade;
import top.jsen.gend.GoString;
import top.jsen.gend.LibGend;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-11
 */
public class EmbedFacade implements Facade {


    private LibGend libGend = LibGend.INSTANCE;

    public EmbedFacade(String data) {
        System.out.println(LibGend.class.getClassLoader().getResource("gend-client.so").getPath());
        libGend.EmbedInitGend(new GoString.ByValue(data));
    }

    @Override
    public Long genId() {
        return libGend.EmbedGenId();
    }

    @Override
    public String expId(Long id) {
        return libGend.EmbedExpId(id);
    }

}
