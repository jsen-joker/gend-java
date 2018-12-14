package top.jsen.gend;

import top.jsen.gend.embed.EmbedFacade;
import top.jsen.gend.grpc.GrpcFacade;
import top.jsen.gend.idwork.IdWorkFacade;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-13
 */
public class GendFacade implements Facade {

    private Facade embedFacade;
    private Facade grpcFacade;

    public GendFacade(String embedData, String grpcData) {
        try {
            embedFacade = new EmbedFacade(embedData);
            grpcFacade = new GrpcFacade(grpcData);
        } catch (Exception e) {
            e.printStackTrace();
            embedFacade = new IdWorkFacade();
            grpcFacade = new IdWorkFacade();
        }
    }

    @Override
    public Long genId() {

        long id = grpcFacade.genId();
        if (id != 0) {
            return id;
        }
        id = embedFacade.genId();
        return id;
    }

    @Override
    public String expId(Long id) {
        return embedFacade.expId(id);
    }
}
