package com.igreja_sede.igreja_sede.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;

import com.igreja_sede.igreja_sede.entities.enums.MemberType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "members")
public class Member  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull
    private String name;

    @NotNull
    private String cpf;

    private String address;
    private String number;
    private String complement;
    private String neighborhood;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    private String zipCode;

    @Column(nullable = true)
    private String phone;
    
    @Column(nullable = true)
    private String mobile;
    
    @Column(nullable = true)
    private String commercialPhone;

    @Column(nullable = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "community_id")
    private Community community;

    private boolean active;

    @Column(nullable = true)
    private LocalDate birthDate;
    
    @ManyToOne
    @JoinColumn(name = "father_id", nullable = true)
    private Member father;

    @ManyToOne
    @JoinColumn(name = "mother_id", nullable = true)
    private Member mother;

    private boolean isContributor;

    @Enumerated(EnumType.STRING)
    @NotNull
    private MemberType memberType;

    private boolean addressUpdated;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @CreationTimestamp
    private LocalDateTime updatedAt;
    
    public Member() {
    }

	public Member(Long id, User user, @NotNull String name, @NotNull String cpf, String address, String number,
			String complement, String neighborhood, City city, String zipCode, String phone, String mobile,
			String commercialPhone, @Email String email, Community community, boolean active, Member father,
			Member mother, boolean isContributor, @NotNull MemberType memberType, boolean addressUpdated) {
		this.id = id;
		this.user = user;
		this.name = name;
		this.cpf = cpf;
		this.address = address;
		this.number = number;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.city = city;
		this.zipCode = zipCode;
		this.phone = phone;
		this.mobile = mobile;
		this.commercialPhone = commercialPhone;
		this.email = email;
		this.community = community;
		this.active = active;
		this.father = father;
		this.mother = mother;
		this.isContributor = isContributor;
		this.memberType = memberType;
		this.addressUpdated = addressUpdated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public City getCity() {
		return city;
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

	public String getCommercialPhone() {
		return commercialPhone;
	}

	public void setCommercialPhone(String commercialPhone) {
		this.commercialPhone = commercialPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Community getCommunity() {
		return community;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Member getFather() {
		return father;
	}


	public Member getMother() {
		return mother;
	}

	public boolean isContributor() {
		return isContributor;
	}

	public void setContributor(boolean isContributor) {
		this.isContributor = isContributor;
	}

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	public boolean isAddressUpdated() {
		return addressUpdated;
	}

	public void setAddressUpdated(boolean addressUpdated) {
		this.addressUpdated = addressUpdated;
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
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}  
}
