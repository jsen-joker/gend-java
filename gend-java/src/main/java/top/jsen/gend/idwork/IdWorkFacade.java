package top.jsen.gend.idwork;

import top.jsen.gend.IdFacade;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-13
 */
public class IdWorkFacade implements IdFacade {
    @Override
    public Long genId() {
        return IdWorker.getId();
    }

    @Override
    public String expId(Long id) {
        return "not impl";
    }
}
