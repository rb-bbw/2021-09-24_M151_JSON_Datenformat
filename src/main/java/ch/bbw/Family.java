package ch.bbw;

import java.util.ArrayList;

public class Family {
    private ArrayList<Person> members;

    public void setMembers(ArrayList<Person> people){
        this.members = people;
    }
    public ArrayList<Person> getMembers(){
        return this.members;
    }

    public void addMember(Person person){
        members.add(person);
    }

    public Family(ArrayList<Person> people){
        setMembers(people);
    }
}
