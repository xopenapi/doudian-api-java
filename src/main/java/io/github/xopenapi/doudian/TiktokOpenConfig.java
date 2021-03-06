package io.github.xopenapi.doudian;

public class TiktokOpenConfig {

    private String host = "https://openapi-fxg.jinritemai.com";

    private String appKey;

    private String appsercet;

    /**
     * 自行通过set方法设置
     */
    private int socketTimeout = 10000;
    private int connectTimeout = 10000;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppsercet() {
        return appsercet;
    }

    public void setAppsercet(String appsercet) {
        this.appsercet = appsercet;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
