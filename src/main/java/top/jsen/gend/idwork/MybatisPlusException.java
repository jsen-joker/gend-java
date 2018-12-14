package top.jsen.gend.idwork;

/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-13
 */
public class MybatisPlusException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MybatisPlusException(String message) {
        super(message);
    }

    public MybatisPlusException(Throwable throwable) {
        super(throwable);
    }

    public MybatisPlusException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
