package main_2;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class J_2_7_10 {
	public static void main(String[] aegs) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(new File("hero.json"));
		JsonNode hero = root.get("hero");
		JsonNode weapon = hero.get("weapon");
		System.out.println("名前:" + hero.get("name").textValue());
		System.out.println("武器:" + weapon.get("name").textValue());
	}


}
