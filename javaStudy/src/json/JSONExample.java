package json;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

public class JSONExample {
	public static void main(String[] args) {
		String personJsonData = //
				" {"//
						+ " \"name\" : \"Jack\","//
						+ " \"age\" : 13,"//
						+ " \"isMarried\" : false,"//
						+ " \"address\" : {"//
						+ "               \"street\" : \"#1234, Main Street\","//
						+ "               \"zipcode\" : 123456"//
						+ "              },"//
						+ " \"phoneNumber\" : [\"011-111-1111\", \"012-222-2222\"]"//
						+ "}";
		JsonReader reader = Json.createReader(new StringReader(personJsonData));
		JsonObject jsonObj = reader.readObject();
		reader.close();

		System.out.println("name: " + jsonObj.getString("name"));
		System.out.println("age: " + jsonObj.getInt("age"));
		System.out.println("isMarried: " + jsonObj.getBoolean("isMarried"));
		
		JsonObject addressObj = jsonObj.getJsonObject("address");
		System.out.println("address: ");
		System.out.println("street: " + addressObj.getString("street"));
		System.out.println("zipcode: " + addressObj.getInt("zipcode"));
		
		JsonArray aryObj = jsonObj.getJsonArray("phoneNumber");
		for(JsonValue value : aryObj) {
			System.out.println(value.toString());
		}
	}
}
