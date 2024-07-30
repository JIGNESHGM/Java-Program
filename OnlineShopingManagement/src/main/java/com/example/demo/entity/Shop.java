package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shop_category")
    private String shopCategory;

    @Column(name = "shop_employees")
    private int shopEmployees;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "shop_status")
    private String shopStatus;

    @Column(name = "shop_owner")
    private String shopOwner;

    @Column(name = "lease_status")
    private String leaseStatus;
    
    public Shop() {
    	
    }
    
    

	public Shop(String shopCategory, int shopEmployees, String shopName, String shopStatus, String shopOwner,
			String leaseStatus) {
		super();
		this.shopCategory = shopCategory;
		this.shopEmployees = shopEmployees;
		this.shopName = shopName;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public int getShopEmployees() {
		return shopEmployees;
	}

	public void setShopEmployees(int shopEmployees) {
		this.shopEmployees = shopEmployees;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}


	@Override
	public String toString() {
		return "Shop [id=" + id + ", shopCategory=" + shopCategory + ", shopEmployees=" + shopEmployees + ", shopName="
				+ shopName + ", shopStatus=" + shopStatus + ", shopOwner=" + shopOwner + ", leaseStatus=" + leaseStatus
				+ "]";
	}
	
	
    // Constructors, getters, setters, toString() omitted for brevity
}
