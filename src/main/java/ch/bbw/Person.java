package ch.bbw;

public class Person {
    private String firstname, lastname;

    public void setFirstname(String name){
        this.firstname = name;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public void setLastname(String name){
        this.lastname = name;
    }
    public String getLastname(){
        return this.lastname;
    }

    public Person(String firstname, String lastname){
        setFirstname(firstname);
        setLastname(lastname);
    }
}
