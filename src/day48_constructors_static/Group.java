package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String names;
    private List<String> members = new ArrayList<>();

    public Group(String name) {
        this.names= name;
    }
public void addMembers(String newMember) {
    members.add(newMember);

}
public void removeMember(String memberName) {
    members.remove(memberName);
}
    @Override
    public String toString() {
        return "Group{" +
                "names='" + names + '\'' +
                ", members=" + members +
                '}';
    }
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
