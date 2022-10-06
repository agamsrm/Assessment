package com.assessment.ProjectCRUD.Entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column
	String product_name;
	@Column
	String product_description;
	@Column
	long price;
	

}
