package com.igreja_sede.igreja_sede.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "synods")
public class Synod implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String corporateName;
    private String cnpj;
    private String zipCode;
    private String address;
    private String number;
    private String complement;
    
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    private String phone;
    private String mobile;
    private String email;
    private String website;

    @ManyToOne
    @JoinColumn(name = "mainchurch_id", nullable = false)
    private MainChurch mainChurch;

    @JsonIgnore
    @OneToMany(mappedBy = "synod")
    private List<Community> communities = new ArrayList<>();
    
    public Synod() {
    }

	public Synod(Long id, String name, String corporateName, String cnpj, String zipCode, String address, String number,
			String complement, City city, String phone, String mobile, String email, String website,
			MainChurch mainChurch) {
		if (mainChurch == null) {
	        throw new IllegalArgumentException("MainChurch não pode ser nulo");
	    }
		this.id = id;
		this.name = name;
		this.corporateName = corporateName;
		this.cnpj = cnpj;
		this.zipCode = zipCode;
		this.address = address;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.website = website;
		this.mainChurch = mainChurch;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public MainChurch getMainChurch() {
		return mainChurch;
	}

	public void setMainChurch(MainChurch mainChurch) {
		this.mainChurch = mainChurch;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Synod other = (Synod) obj;
		return Objects.equals(id, other.id);
	}
}
