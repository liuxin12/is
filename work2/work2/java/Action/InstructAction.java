package Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Instruct;
import Service.InstructService;
import Service.InstructSpecService;
import Service.InventoryService;
import net.sf.json.JSONObject;

public class InstructAction extends ActionSupport {
	private String instructMap;
	private String serialNumber;
	private Double price;
	private List<InstructService> list;
	private	InstructSpecService instructSpecService;
	private InventoryService inventoryService;	
	private Map map=new HashMap();		
	public String add(){		
		Map properties=(Map)JSONObject.fromObject(instructMap);
		instructSpecService.setProperties(properties);
		inventoryService.addInstructService(serialNumber, price, instructSpecService);
		return SUCCESS;
	}
	public String search(){
		Map properties=(Map)JSONObject.fromObject(instructMap);
		instructSpecService.setProperties(properties);
		list=inventoryService.serach(instructSpecService);
		map.put("list", list);
		System.out.println("成功了");
		return SUCCESS;
	}
	public void setInstructSpecService(InstructSpecService instructSpecService) {
		this.instructSpecService = instructSpecService;
	}
	public void setInventoryService(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
	public String getInstructMap() {
		return instructMap;
	}
	public void setInstructMap(String instructMap) {
		this.instructMap = instructMap;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}	
}
