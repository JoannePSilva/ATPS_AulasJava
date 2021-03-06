package Aula35_to.ATP49.Views;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    private DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource cPool = new ComboPooledDataSource();
        cPool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        cPool.setUser ("postgres");
        cPool.setPassword("2609");
        cPool.setMaxPoolSize(8);
        this.dataSource = cPool;

    }
    public Connection getConnection() throws SQLException {
        return  this.dataSource.getConnection();
    }
}
