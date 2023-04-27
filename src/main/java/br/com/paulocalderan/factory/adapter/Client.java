package br.com.paulocalderan.factory.adapter;

import br.com.paulocalderan.factory.adapter.db.DB;
import br.com.paulocalderan.factory.adapter.factory.OracleFactory;

public class Client {

	public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
