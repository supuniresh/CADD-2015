package mysample;

import com.se.sampleApp.domain.Customer;
import com.se.sampleApp.exception.LoginFailedException;
import com.se.sampleApp.internal.CustomerBean;
import com.se.sampleApp.login.LoginHandler;

/**
 * 
 */
/**
 * @author samitha
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String username = "Samitha";
		String password = "Samitha123";
		boolean login = false;
		// Login to the system
		LoginHandler loggingHandler = new LoginHandler();
		try {
			login = loggingHandler.login(username, password);
		} catch (LoginFailedException e) {
			e.printStackTrace();
		}

		if (login) {
			// Build customer
			Customer customer = new Customer("Customer name", "Adress", 45L);

			// Call customer bean to save
			CustomerBean customerBean = new CustomerBean();
			Customer savedCustomer = customerBean.save(customer);
		}
		loggingHandler.logout();
	}
}
