package ServiceImpl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.transaction.annotation.Transactional;

import Dao.InstructDao;
import Entity.Instruct;
import Service.InstructService;
import Service.InstructSpecService;
import Service.InventoryService;
@Transactional
public class InventoryServiceImpl implements InventoryService{			
	private InstructSpecService instructSpecService;
	private InstructService instructService;	
	private InstructDao instructDao;
	private List<InstructService> instructServices;
	private List<Instruct> instructs;
	private BeanFactory beanFactory;
	public InventoryServiceImpl() {
		super();
	}
	public InventoryServiceImpl(InstructDao instructDao,InstructService instructService
			,InstructSpecService instructSpecService) {		
		instructServices=new LinkedList<InstructService>();	
		//取数据
		if(instructServices.isEmpty()){
			instructs=instructDao.findAll();
			for(Iterator i=instructs.iterator();i.hasNext();){
				Instruct instruct=(Instruct)i.next();
				instructSpecService.setProperties(instruct.getMap());
				instructService.setInstructSpecService(instructSpecService);
				instructService.setSerialNumber(instruct.getSerialNumber());
				instructService.setPrice(instruct.getPrice());			
				instructServices.add(instructService);
			}
		}
	}
	public void addInstructService(String serialNumber,Double price,InstructSpecService instructSpecService){				
		instructService.setPrice(price);
		instructService.setSerialNumber(serialNumber);
		instructService.setInstructSpecService(instructSpecService);		
		instructServices.add(instructService);
		instructDao.add(serialNumber, price,instructSpecService.getProperties());
	}
	public InstructService getInstructService(String serialNumber){
		for(Iterator i=instructServices.iterator();i.hasNext();){
			InstructService instructService=(InstructService)i.next();
			if(instructService.getSerialNumber()==serialNumber){
				return instructService;
			}			
		}
		return null;
	}
	public List<InstructService> serach(InstructSpecService searchInstructSpec){
		List<InstructService> matchingInstructs=new LinkedList<InstructService>();
		for(Iterator i=instructServices.iterator();i.hasNext();){
			InstructService instructService=(InstructService)i.next();			
			InstructSpecService instructSpecService=instructService.getInstructSpecService();
			if(instructSpecService.matches(searchInstructSpec)){
				matchingInstructs.add(instructService);
			}		
		}
		return matchingInstructs;
	}
	public List<InstructService> getInstructServices() {
		return instructServices;
	}
	public void setInstructSpecService(InstructSpecService instructSpecService) {
		this.instructSpecService = instructSpecService;
	}
	public void setInstructService(InstructService instructService) {
		this.instructService = instructService;
	}
	public void setInstructDao(InstructDao instructDao) {
		this.instructDao = instructDao;
	}
	
	
}
