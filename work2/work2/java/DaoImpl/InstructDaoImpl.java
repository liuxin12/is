package DaoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import Dao.InstructDao;
import Entity.Instruct;



public class InstructDaoImpl extends HibernateDaoSupport implements InstructDao{
	private List<Instruct> instructs;	
	public InstructDaoImpl() {
		super();
	}
	public List<Instruct> findAll(){
		instructs =(List<Instruct>)this.getHibernateTemplate().find("from Instruct instruct");				
		return instructs;
	}
	@Override
	public void add(String serialNumber,Double price,Map map) {				
		Instruct instruct=new Instruct(serialNumber,price,map);
		this.getHibernateTemplate().save(instruct);
	}
	public List<Instruct> getInstructs() {
		return instructs;
	}
	public void setInstructs(List<Instruct> instructs) {
		this.instructs = instructs;
	}
	@Override
	public String toString() {
		return "InstructDaoImpl [instructs=" + instructs + "]";
	}
	
}
