package com.examly.housemanagement.housemanagement.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HouseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int houseId;
	private String houseNo;
	private String status;
	private String type;
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	public HouseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HouseEntity(int houseId, String houseNo, String status, String type) {
		super();
		this.houseId = houseId;
		this.houseNo = houseNo;
		this.status = status;
		this.type = type;
	}
	@Override
	public String toString() {
		return "HouseService [houseId=" + houseId + ", houseNo=" + houseNo + ", status=" + status + ", type=" + type
				+ "]";
	}
	
}
