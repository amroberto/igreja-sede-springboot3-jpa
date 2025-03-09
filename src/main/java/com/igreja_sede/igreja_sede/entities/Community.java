package com.igreja_sede.igreja_sede.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.igreja_sede.igreja_sede.entities.enums.UnityType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "communities")
public class Community  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String corporateName;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private UnityType unityType;

	@Column(unique = true, length = 18)
	private String cnpj;

	@Column(nullable = false)
	private String address;

	private String number;
	private String complement;

	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

	@ManyToOne
	@JoinColumn(name = "synod_id", nullable = false)
	private Synod synod;
	
	private String zipCode;

	private String phone;
	private String mobile;

	private String email;

	private String website;

	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public Community() {
	}

	
	public Community(Long id, String name, String corporateName, UnityType unityType, String cnpj, String address,
			String number, String complement, City city, Synod synod, String zipCode, String phone, String mobile,
			String email, String website) {
		this.id = id;
		this.name = name;
		this.corporateName = corporateName;
		this.unityType = unityType;
		this.cnpj = cnpj;
		this.address = address;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.synod = synod;
		this.zipCode = zipCode;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.website = website;
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

	public UnityType getUnityType() {
		return unityType;
	}

	public void setUnityType(UnityType unityType) {
		this.unityType = unityType;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public Synod getSynod() {
		return synod;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
		Community other = (Community) obj;
		return Objects.equals(id, other.id);
	}
}
