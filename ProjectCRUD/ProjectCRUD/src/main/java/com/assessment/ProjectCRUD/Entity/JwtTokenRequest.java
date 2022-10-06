package com.assessment.ProjectCRUD.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtTokenRequest {
	
	private String username;
	private String password;
	
	

}
