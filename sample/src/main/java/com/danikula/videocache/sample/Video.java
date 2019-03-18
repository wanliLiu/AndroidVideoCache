package com.danikula.videocache.sample;

public enum Video {

    ORANGE_1("http://dev-static01-joker.taihe.com/0208/M00/54/20/ChR461yHc9GAYIVUAzrAnan0gxU368.mp4"),
    ORANGE_2("http://dev-static01-joker.taihe.com/0207/M00/54/93/ChR47FyHdFqAWLCQAvMZDg22lpc164.mp4"),
    ORANGE_3("http://dev-static01-joker.taihe.com/0209/M00/59/2E/ChR461yHctiARbGQAzO4WcVQV4o061.mp4"),
    ORANGE_4("http://dev-static01-joker.taihe.com/0207/M00/54/95/ChR47FyKCTiAawQ1ABkVoXmFp70269.mp4?_width=960&_height=540"),
    ORANGE_5("http://dev-static01-joker.taihe.com/0207/M00/54/83/ChR461x3SiKAAEhYAB4vGRb4MW8276.mp4?_width=854&_height=480");

    public final String url;

    Video(String url) {
        this.url = url;
    }

    private class Config {
        private static final String ROOT = "https://raw.githubusercontent.com/danikula/AndroidVideoCache/master/files/";
    }
}
