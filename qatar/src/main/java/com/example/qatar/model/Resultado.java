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
@Table(name="resultado")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Resultado implements Serializable{
	@Id
	@SequenceGenerator(name="resultado_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="resultado_id_seq")
	private Integer id;
	
	@OneToOne
	private Integer partido_id;
	
	@ManyToOne
	private Integer seleccion_id;
	
	private Integer goles;
	
	private Integer amarillas;
	
	private Integer rojas;
}
