package main_2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class J_1_5_5 {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(J_1_5_5.class);
		if (args.length != 2) {
			logger.error("起動引数の数が異常:　" + args.length);
		}
	}

}
