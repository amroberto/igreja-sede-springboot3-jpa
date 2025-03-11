package com.igreja_sede.igreja_sede.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "presbiteries")
public class Presbytery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member leadership;

    @ManyToOne
    @JoinColumn(name = "community_id", nullable = false)
    private Community community;
    
    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

	public Presbytery() {
	}

	
	public Presbytery(Long id, Member leadership, Community community, Position position) {
		super();
		this.id = id;
		this.leadership = leadership;
		this.community = community;
		this.position = position;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Member getLeadership() {
		return leadership;
	}

	public void setLeadership(Member leadership) {
		this.leadership = leadership;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
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
		Presbytery other = (Presbytery) obj;
		return Objects.equals(id, other.id);
	}
}
