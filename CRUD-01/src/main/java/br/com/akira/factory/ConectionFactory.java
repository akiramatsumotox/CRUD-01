package br.com.akira.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Akira Matsumoto
 *
 */
public class ConectionFactory {

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/bancojdbc", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
