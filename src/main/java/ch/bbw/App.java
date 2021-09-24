package ch.bbw;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileReader;

public class App{
    public static void main( String[] args ){
        Gson gson = new Gson();

        // 1. JSON file to Java object
        Staff staff = gson.fromJson(new FileReader(""), Staff.class);

        // 2. JSON string to Java object
        String json = "{'name' : 'mkyong'}";
        Staff staff = gson.fromJson(json, Staff.class);

        // 3. JSON file to JsonElement, later String
        JsonElement json = gson.fromJson(new FileReader("C:\\projects\\staff.json"), JsonElement.class);
        String result = gson.toJson(json);
    }
}
