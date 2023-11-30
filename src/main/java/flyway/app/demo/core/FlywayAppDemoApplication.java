package flyway.app.demo.core;

import javax.sql.DataSource;

import com.googlecode.flyway.core.Flyway;

import flyway.app.demo.core.datasource.DataSourceConfig;

public class FlywayAppDemoApplication {

	public static void main(String[] args) {
		// Create a data source
		DataSource dataSource = DataSourceConfig.createDataSource();

		// Create a Flyway instance
		Flyway flyway = new Flyway();
		flyway.setDataSource(dataSource);
		flyway.setLocations("classpath:db/migration");
		flyway.setOutOfOrder(true);

		// Flyway flyway =
		// Flyway.configure().dataSource(dataSource).locations("classpath:db/migration").load();

		// Perform the migration
		flyway.migrate();
	}

}
