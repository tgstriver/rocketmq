package org.apache.rocketmq.broker;

import java.io.File;

public class BrokerPathConfigHelper {

    private static String brokerConfigPath = System.getProperty("user.home") + File.separator + "store"
            + File.separator + "config" + File.separator + "broker.properties";

    public static String getBrokerConfigPath() {
        return brokerConfigPath;
    }

    /**
     * 设置broker配置文件路径
     *
     * @param path
     */
    public static void setBrokerConfigPath(String path) {
        brokerConfigPath = path;
    }

    /**
     * 获取存储topic信息的文件路径
     *
     * @param rootDir
     * @return
     */
    public static String getTopicConfigPath(final String rootDir) {
        return rootDir + File.separator + "config" + File.separator + "topics.json";
    }

    public static String getConsumerOffsetPath(final String rootDir) {
        return rootDir + File.separator + "config" + File.separator + "consumerOffset.json";
    }

    public static String getSubscriptionGroupPath(final String rootDir) {
        return rootDir + File.separator + "config" + File.separator + "subscriptionGroup.json";
    }

    public static String getConsumerFilterPath(final String rootDir) {
        return rootDir + File.separator + "config" + File.separator + "consumerFilter.json";
    }
}
