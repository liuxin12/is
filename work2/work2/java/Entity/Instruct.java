package Entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class Instruct {
	@Id
	@GeneratedValue(generator="id")
	@GenericGenerator(name="id",strategy="assigned")	
	@Column(length=27)
	private String serialNumber;
	private double price;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="instruct_map",joinColumns=@JoinColumn(name="instruct_serialNumber"))
	@Column(length=18)
	@MapKeyColumn(length=18)
	private Map<String,String> map;
	public Instruct() {
		super();
	}	
	public Instruct(String serialNumber, double price, Map map) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.map = map;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Instruct [serialNumber=" + serialNumber + ", price=" + price + ", map=" + map + "]";
	}
	
}	