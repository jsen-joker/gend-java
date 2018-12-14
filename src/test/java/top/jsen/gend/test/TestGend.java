package top.jsen.gend.test;

import org.junit.Test;
import top.jsen.gend.embed.EmbedFacade;
import top.jsen.gend.grpc.GrpcFacade;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-11
 */
public class TestGend {
    @Test
    public void testEmbed() {
        EmbedFacade embedFacade = new EmbedFacade("");
        System.out.println(embedFacade.genId());
        System.out.println(embedFacade.expId(embedFacade.genId()));
    }
    @Test
    public void testGrpc() {
        GrpcFacade grpcFacade = new GrpcFacade("");
        System.out.println(grpcFacade.genId());
        System.out.println(grpcFacade.genId());
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(grpcFacade.genId());
//            System.out.println(grpcFacade.expId(grpcFacade.genId()));
//            System.out.println(grpcFacade.expId(grpcFacade.genId()));
        }
    }
    @Test
    public void combine() {
        EmbedFacade embedFacade = new EmbedFacade("");
        System.out.println(embedFacade.genId());
        System.out.println(embedFacade.expId(embedFacade.genId()));
        GrpcFacade grpcFacade = new GrpcFacade("");
        System.out.println(grpcFacade.genId());
        System.out.println(grpcFacade.expId(grpcFacade.genId()));

    }
}
