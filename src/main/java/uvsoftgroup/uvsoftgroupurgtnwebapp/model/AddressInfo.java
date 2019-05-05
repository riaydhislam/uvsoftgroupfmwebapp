package uvsoftgroup.uvsoftgroupurgtnwebapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="addressinfo")
public class AddressInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="seq_useregistration", strategy="uvsoftgroup.uvsoftgroupurgtnwebapp.utility.AddressInfoIdGenerator")
	@GeneratedValue(generator="seq_useregistration")
	Long adId;
	Long adRefId;
	String adType;
	String adCity;
	String adRoad,adRoadType;
	String adHouseNumber;
	String adPostCode;
	String adCountry;
	
	
	public AddressInfo() {
		super();
		
	}

	public Long getAdId() {
		return adId;
	}

	public void setAdId(Long adId) {
		this.adId = adId;
	}

	public Long getAdRefId() {
		return adRefId;
	}

	public void setAdRefId(Long adRefId) {
		this.adRefId = adRefId;
	}

	public String getAdType() {
		return adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	public String getAdCity() {
		return adCity;
	}

	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}

	public String getAdRoad() {
		return adRoad;
	}

	public void setAdRoad(String adRoad) {
		this.adRoad = adRoad;
	}

	public String getAdRoadType() {
		return adRoadType;
	}

	public void setAdRoadType(String adRoadType) {
		this.adRoadType = adRoadType;
	}

	public String getAdHouseNumber() {
		return adHouseNumber;
	}

	public void setAdHouseNumber(String adHouseNumber) {
		this.adHouseNumber = adHouseNumber;
	}

	public String getAdPostCode() {
		return adPostCode;
	}

	public void setAdPostCode(String adPostCode) {
		this.adPostCode = adPostCode;
	}

	public String getAdCountry() {
		return adCountry;
	}

	public void setAdCountry(String adCountry) {
		this.adCountry = adCountry;
	}
	

}
