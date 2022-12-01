package Model;

import java.util.ArrayList;

public class group {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<team> getTeamArrayList() {
        return teamArrayList;
    }

    public void setTeamArrayList(ArrayList<team> teamArrayList) {
        this.teamArrayList = teamArrayList;
    }

    public group(String name, ArrayList<team> teamArrayList) {
        this.name = name;
        this.teamArrayList = teamArrayList;
    }

    ArrayList<team> teamArrayList;
}