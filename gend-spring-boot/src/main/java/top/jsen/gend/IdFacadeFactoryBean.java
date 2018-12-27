package top.jsen.gend;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.FactoryBean;
import top.jsen.gend.embed.EmbedFacade;
import top.jsen.gend.grpc.GrpcFacade;
import top.jsen.gend.utils.PathHandler;
import top.jsen.gend.utils.StringUtils;


/**
 * <p>
 * </p>
 *
 * @author jsen
 * @since 2018-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IdFacadeFactoryBean implements FactoryBean<IdFacade> {

    private IdFacade idFacade;

    public enum Type {
        EMBED, GRPC
    }


    private Type gendType = Type.EMBED;

    public void init() {
        if (!StringUtils.isEmpty(getSoPath())) {
            Conf.SO_PATH = getSoPath();
        }

        JSONObject conf = new JSONObject();

        conf.put("RpcAddress", getRpcAddress());
        conf.put("Version", getVersion());
        conf.put("IdType", getType());
        conf.put("Gen", getGen());
        conf.put("Machine", getMachineId());
        conf.put("Populate", getPopulate());
        conf.put("Provider", getProvider());

        switch (gendType) {
            case GRPC:
                idFacade = new GrpcFacade(conf.toJSONString());
                break;
            case EMBED:
                idFacade = new EmbedFacade(conf.toJSONString());
                break;
        }
    }

    private String soPath = PathHandler.getResourcePath("gend-client");



    private String rpcAddress = "localhost:50051";
    /**
     * // 默认字段值
     * 	// 版本 扩展 0
     */
    private Long version = 0L;

    /**
     * 0 最大峰值 1 最小粒度
     */
    private Long type = 0L;

    private Long gen = 0L;

    private Long machineId = 1L;

    /**
     * 暂不用修改
     */
    private String populate = "lock";
    /**
     * 暂不用修改
     */
    private String provider = "default";



    @Override
    public IdFacade getObject() {
        return idFacade;
    }

    @Override
    public Class<?> getObjectType() {
        return IdFacade.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
