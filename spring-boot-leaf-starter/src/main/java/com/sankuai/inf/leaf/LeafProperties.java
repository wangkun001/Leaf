package com.sankuai.inf.leaf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wk
 */
@ConfigurationProperties(prefix = "leaf")
public class LeafProperties {
    /**
     * 业务标识
     */
    private String bizTag;

    public String getBizTag() {
        return bizTag;
    }

    public void setBizTag(String bizTag) {
        this.bizTag = bizTag;
    }

    @Override
    public String toString() {
        return "LeafProperties{" +
                "bizTag='" + bizTag + '\'' +
                '}';
    }
}
