package logger.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
	private static Logger logger = LoggerFactory.getLogger(Demo.class);

	public static void main(String[] args) {

		logger.info("log4j test !");
	}
}
