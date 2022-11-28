package com.example.qatar.model;

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
@Table(name="partido")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Partido{
	@Id
	@SequenceGenerator(name="partido_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="partido_id_seq")
	@OneToOne
	private Integer id;
	private timestamp fecha;
	
	@OneToMany
	private Integer estadio;
	
}
