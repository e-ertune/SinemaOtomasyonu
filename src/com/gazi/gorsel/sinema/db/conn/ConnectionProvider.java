
package com.gazi.gorsel.sinema.db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {

    static final String username = "sa";
    static final String password = "blp123";
    static final String connUrl = "jdbc:sqlserver://localhost:1433; databasename=SinemaDB";

    static Connection conn = null;

    public static Connection getConn() {
        try {
            conn = DriverManager.getConnection(connUrl, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
