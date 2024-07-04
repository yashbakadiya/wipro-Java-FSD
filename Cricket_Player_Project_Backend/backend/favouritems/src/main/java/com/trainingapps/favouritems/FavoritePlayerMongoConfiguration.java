package com.trainingapps.favouritems;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class FavoritePlayerMongoConfiguration extends AbstractMongoClientConfiguration {

	@Value("${spring.data.mongo.database}")
	private String databaseName;

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return databaseName;
	}

}
