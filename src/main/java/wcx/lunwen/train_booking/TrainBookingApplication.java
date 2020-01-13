package wcx.lunwen.train_booking;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("wcx.lunwen.train_booking")
public class TrainBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainBookingApplication.class, args);
	}

}
