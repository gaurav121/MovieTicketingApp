package bookticket.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class UserRole {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userRoleID;
	
	@Column(name="roleid")
	private int roleID;
	
	@Column(name="userid")
	
	private long userID;
	
}
