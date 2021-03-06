package wiki.chenxun.ace.core.base.common;

import lombok.Data;
import wiki.chenxun.ace.core.base.annotations.ConfigBean;
import wiki.chenxun.ace.core.base.logger.LoggerFactory;

/**
 * @Description: Created by chenxun on 2017/4/21.
 */
@Data
@ConfigBean(AceApplicationConfig.PREFIX)
public class AceApplicationConfig {


    public static final String PREFIX = "ace.application";

    private String name;

    private String dispatch;

    private String server;

    private String packages ="wiki.chenxun.ace.core";

    private String container;

    private String register;

    private String logger;

    public void setLogger(String logger) {
        this.logger = logger;
        LoggerFactory.setLoggerAdapter(logger);
    }
}
