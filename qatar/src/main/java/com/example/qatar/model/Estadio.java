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
@Table(name="estadio")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Estadio implements Serializable {
	@Id
	@SequenceGenerator(name="estadio_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="estadio_id_seq")
	@OneToMany
	private Integer id;
	
	private String nombre;
	
	private Integer capacidad;
}
