package top.jsen.gend.idwork;

import java.util.UUID;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-13
 */
public class IdWorker {

    /**
     * 主机和进程的机器码
     */
    private static final Sequence WORKER = new Sequence();

    public static long getId() {
        return WORKER.nextId();
    }

    public static String getIdStr() {
        return String.valueOf(WORKER.nextId());
    }

    /**
     * <p>
     * 获取去掉"-" UUID
     * </p>
     */
    public static synchronized String get32UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
