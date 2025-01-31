package com.example.mongojpalogic.common.config;

import com.example.mongojpalogic.common.converter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.ArrayList;
import java.util.List;

@Configuration
class MongoConfig {

    @Bean
    MongoTransactionManager mongoTransactionManager(MongoDatabaseFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }

    @Bean
    public MongoCustomConversions customConversions() {
        List<Converter<?, ?>> converterList = new ArrayList<Converter<?, ?>>();
        converterList.add(new ZonedDateTimeReadConverter());
        converterList.add(new ZonedDateTimeWriteConverter());
        converterList.add(new LocalTimeReadConverter());
        converterList.add(new LocalTimeWriteConverter());
        converterList.add(new BigDecimalReadConverter());
        converterList.add(new BigDecimalWriteConverter());
        converterList.add(new YearMonthReadConverter());
        converterList.add(new YearMonthWriteConverter());

        return new MongoCustomConversions(converterList);
    }
}
