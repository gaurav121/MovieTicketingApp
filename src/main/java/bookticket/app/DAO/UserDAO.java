/**
 * 
 */
package bookticket.app.DAO;

import java.util.List;

import org.springframework.security.core.userdetails.User;

/**
 * @author gyadav
 *
 */
public interface UserDAO {
	
	
	public List<User> getAllUser();

	public String deleteUser(int userID);
	
	public User updateUser(User usr);
	
	public User addnewUser(User usr);
	
	
}
