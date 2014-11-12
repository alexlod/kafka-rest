package io.confluent.kafkarest;

import java.util.Properties;

/**
 * Settings for the REST proxy server.
 */
public class Config {
    public int port;
    public static final String DEFAULT_PORT = "8080";

    public String zookeeperConnect;
    public static final String DEFAULT_ZOOKEEPER_CONNECT = "localhost:2181";

    public Config() {
        this(new Properties());
    }

    public Config(Properties props) {
        port = Integer.parseInt(props.getProperty("port", DEFAULT_PORT));
        zookeeperConnect = props.getProperty("zookeeper.connect", DEFAULT_ZOOKEEPER_CONNECT);
    }
}
