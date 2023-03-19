package org.example;

import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

// WebApplicationServerLauncher Class
public class WebApplicationServerLauncher {
    // Logger add
    private static final Logger log = LoggerFactory.getLogger(WebApplicationServerLauncher.class);
    public static void main(String[] args) throws Exception {
        // Tomcat server를 사용하기 위해 먼저, webappDirLocation 문자열을 생성해준다 "webaaps/"
        String webappDirLocation = "webapps/";
        // Tomcat 을 사용할 것이니 Tomcat을 설정한다!
        Tomcat tomcat = new Tomcat();
        // tomcat의 포트생성 번호는 8080이다!
        tomcat.setPort(8080);

        // Path 를 get 고 실행(tomcat)을 위해 바라보는 상위 디렉터리 webappDirLocation 으로 부터 하위 디렉터리를 상대로 Tomcat 을 찾아 실행을 한다
        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        // log 를 찍어서 정보를 보여주는데? 현재 webapps의 디렉터리 와 경로를 보여준다
        log.info("configuring app with basedir: {}", new File("./" + webappDirLocation).getAbsolutePath());

        // Tomcat 을 실행시켜주는 method
        tomcat.start();
        // Tomcat 에서 get 한 서버 method 가 잘 실행되고 있으면 await method 를 통해서 Tomcat server 상태 유지한다 -> Tomcat server shutdown 되기 전까지!
        tomcat.getServer().await();
    }
}
