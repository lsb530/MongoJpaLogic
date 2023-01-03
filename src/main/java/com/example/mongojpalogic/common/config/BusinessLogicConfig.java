package com.example.mongojpalogic.common.config;

import java.time.ZoneId;
import java.util.TimeZone;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableConfigurationProperties
@Getter
@Setter
@ConfigurationProperties(prefix = "boki")
public class BusinessLogicConfig implements InitializingBean {

    private ZoneId timeZone;
    private String slackBot;

    @Override
    public void afterPropertiesSet() {
        // application.yaml 타임존 설정
        TimeZone timezone;
        if (getTimeZone() != null) {
            timezone = TimeZone.getTimeZone(getTimeZone());
        } else {
            timezone = TimeZone.getTimeZone("Asia/Seoul");
        }
        System.setProperty("user.timezone", timezone.getID());
        TimeZone.setDefault(timezone);
    }


}
