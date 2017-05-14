package ServiceImpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import Service.InstructSpecService;

public class InstructSpecServiceImpl implements InstructSpecService {	
	private Map properties;	
	public InstructSpecServiceImpl() {
		super();
	}
	@Override
	public boolean matches(InstructSpecService otherSpecService){
		for(Iterator i=properties.keySet().iterator();i.hasNext();){
			String propertyName=(String)i.next();
			if(!properties.get(propertyName).equals(otherSpecService.getProperties().get(propertyName))){
				System.out.println(properties.get(propertyName));
				System.out.println(otherSpecService.getProperties().get(propertyName));
				return false;
			}
		}
		return true;
	}
	@Override
	public Map getProperties() {
		return properties;
	}
	public void setProperties(Map properties) {
		if(properties.isEmpty()){
			this.properties=new HashMap();
		}
		else{
			this.properties=new HashMap( properties);
		}	
	}
	@Override
	public String toString() {
		return "InstructSpecServiceImpl [properties=" + properties + "]";
	}
	
}
