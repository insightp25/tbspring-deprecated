package book.tbspring;

import book.tbspring.user.dao.DUserDao;
import book.tbspring.user.dao.UserDao;
import book.tbspring.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class TbspringApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		SpringApplication.run(TbspringApplication.class, args);

		UserDao dao = new DUserDao();

		User user = new User();
		user.setId("edgerunner");
		user.setName("Daivid Martinez");
		user.setPassword("lucy");

		dao.add(user);

		System.out.println(user.getId() + " update successful");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + " read successful");
	}

}
