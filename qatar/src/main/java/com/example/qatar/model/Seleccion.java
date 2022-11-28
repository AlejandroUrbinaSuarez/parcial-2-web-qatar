package com.example.qatar.model;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Data;

@Entity
@Table(name="seleccion")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Seleccion implements Serializable{
	@Id
	@SequenceGenerator(name="seleccion_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="seleccion_id_seq")
	@OneToMany
	private Integer id;
	private String name;
	
	@ManyToOne
	private Integer continente_id;
	private String grupo;
	
}

