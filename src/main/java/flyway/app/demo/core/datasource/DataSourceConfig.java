package flyway.app.demo.core.datasource;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataSourceConfig {

	public static DataSource createDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://167.172.68.239:9999/kris_googlecode");
		dataSource.setUsername("root");
		dataSource.setPassword("bluest0ne");
		return dataSource;
	}

}
