package br.com.paulocalderan.factory.adapter.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
