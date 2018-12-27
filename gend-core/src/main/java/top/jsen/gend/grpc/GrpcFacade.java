package top.jsen.gend.grpc;

import top.jsen.gend.GoString;
import top.jsen.gend.IdFacade;
import top.jsen.gend.LibGend;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-11
 */
public class GrpcFacade implements IdFacade {
    private LibGend libGend = LibGend.INSTANCE;

    public GrpcFacade(String data) {
        System.out.println(LibGend.class.getClassLoader().getResource("gend-client.so").getPath());
        libGend.GrpcInitGend(new GoString.ByValue(data));
    }

    @Override
    public Long genId() {
        return libGend.GrpcGenId();
    }

    @Override
    public String expId(Long id) {
        return libGend.GrpcExpId(id);
    }

}
