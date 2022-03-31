package tbp.unit.testing.mokito.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Raviteja Pullamsetty
 *
 */
@Repository
public class UserDao {

	public String getUserId(String userName) {
		System.out.print("UserDao Called");
		return "123445" + userName;
	}

}
