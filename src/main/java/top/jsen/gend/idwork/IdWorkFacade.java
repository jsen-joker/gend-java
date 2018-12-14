package top.jsen.gend.idwork;

import top.jsen.gend.Facade;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-13
 */
public class IdWorkFacade implements Facade {
    @Override
    public Long genId() {
        return IdWorker.getId();
    }

    @Override
    public String expId(Long id) {
        return "not impl";
    }
}
