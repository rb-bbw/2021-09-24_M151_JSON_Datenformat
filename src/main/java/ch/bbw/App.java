package ch.bbw;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App{
    public static void main( String[] args ) throws FileNotFoundException {
        task_1();
    }
    private static void task_1() throws FileNotFoundException {
        Gson gson = new Gson();
        Family fam = gson.fromJson(new FileReader("resources/family.json"), Family.class);
        for(Person p: fam.getMembers()){
            System.out.println(p.getFirstname() + " " + p.getLastname());
        }
    }
    private static void task_2(){
        // https://www.jsonschema2pojo.org/
        // https://transport.opendata.ch/v1/connections?from=Winterthur&to=Z%C3%BCrich
    }
}
