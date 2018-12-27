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
public class GendFacade implements IdFacade {

    private IdFacade embedIdFacade;
    private IdFacade grpcIdFacade;

    public GendFacade(String embedData, String grpcData) {
        try {
            embedIdFacade = new EmbedFacade(embedData);
            grpcIdFacade = new GrpcFacade(grpcData);
        } catch (Exception e) {
            e.printStackTrace();
            embedIdFacade = new IdWorkFacade();
            grpcIdFacade = new IdWorkFacade();
        }
    }

    @Override
    public Long genId() {

        long id = grpcIdFacade.genId();
        if (id != 0) {
            return id;
        }
        id = embedIdFacade.genId();
        return id;
    }

    @Override
    public String expId(Long id) {
        return embedIdFacade.expId(id);
    }
}
