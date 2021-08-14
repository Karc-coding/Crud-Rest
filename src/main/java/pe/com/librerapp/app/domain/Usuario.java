package pe.com.librerapp.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "tb_User")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user", length = 7)
	private Long id;
	
	@Column(name = "dni_user", length = 8, unique = true, nullable = false)
	private String dni;
	
	@Column(name = "name_user", length = 75, nullable = false)
	@Size(min = 3, max = 75)
	private String name;
	
	@Column(name = "lstName_user", length = 75, nullable = false)
	@Size(min = 3, max = 75)
	private String lastName;
	
	@Column(name = "login_user", length = 75, nullable = false)
	@Size(min = 5, max = 75)
	private String login;
	
	@Column(name = "pass_user", length = 75, nullable = false)
	@Size(min = 5, max = 75)
	private String password;
	
	@Column(name = "email_user", length = 100, nullable = false)
	@Email
	private String email;
	
	@Column(name = "address_user", length = 100, nullable = true)
	private String address;

}
