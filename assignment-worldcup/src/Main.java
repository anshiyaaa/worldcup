import Model.players;
import Model.group;
import Model.team;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<players> brazilplayers = new ArrayList<>();
        players p1 = new players("Messi","30","35","9.9");
        players p2 = new players("Alisson","10","30","9.9");
        players p3 = new players("Marquinhos","10","30","9.9");
        brazilplayers.add(p1);

        ArrayList<players>spainplayers = new ArrayList<>();
        players p4 = new players("Thiago","10","30","9.9");
        players p5 = new players("Dani Alves","10","30","9.9");
        players p6 = new players("Alex Sandro","10","30","9.9");
        spainplayers.add(p2);

        ArrayList<players>franceplayers = new ArrayList<>();
        players p7 = new players("Alex Telles","10","30","9.9");
        players p8 = new players("Casemiro","10","30","9.9");
        players p9 = new players("Fabino","10","30","9.9");
        franceplayers.add(p3);

        ArrayList<players>iranplayers =new ArrayList<>();
        players p10 = new players("Vincius","10","30","9.9");
        players p11 = new players("Rodryo","10","30","9.9");
        players p12 = new players("Jesus","10","30","9.9");
        iranplayers.add(p4);

        team t1=new team("Brazil","yellow","9.9",brazilplayers);
        team t2=new team("Spain","red","9.9",spainplayers);
        team t3=new team("France","blue","9.9",franceplayers);
        team t4=new team("Iran","green","9.9",iranplayers);

        ArrayList<team> brazil = new ArrayList<>();
        ArrayList<team> spain = new ArrayList<>();
        ArrayList<team> france = new ArrayList<>();
        ArrayList<team> iran = new ArrayList<>();

        group g1=new group("Group A",brazil);
        group g2=new group("Group A",iran );
        group g3=new group("Group B", france);
        group g4=new group("Group B",spain);




        ArrayList<players> playerList = new ArrayList<>();

        playerList.add(p1);
        System.out.println(playerList);



    }

}