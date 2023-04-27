package br.com.paulocalderan.factory.adapter.factory;

import br.com.paulocalderan.factory.adapter.db.DB;
import br.com.paulocalderan.factory.adapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
