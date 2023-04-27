package br.com.paulocalderan.factory.adapter.factory;

import br.com.paulocalderan.factory.adapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
