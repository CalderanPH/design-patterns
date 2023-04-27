package br.com.paulocalderan.factory.adapter.factory;

import br.com.paulocalderan.factory.adapter.db.DB;
import br.com.paulocalderan.factory.adapter.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
