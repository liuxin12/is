package Dao;

import java.util.List;
import java.util.Map;

import Entity.Instruct;

public interface InstructDao {
	public List<Instruct> findAll();
	public void add(String serialNumber,Double price,Map map);
}
