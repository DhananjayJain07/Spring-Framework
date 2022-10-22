package tcs;
import java.util.Scanner;



public class SolutionPlayer {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Player[] players = new Player[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            players[i]= new Player(a,b,c,d,e);
        }
        int input1 = sc.nextInt();
        sc.nextLine();
        sc.close();
        Player ans1=findPlayerWithMinimumMatchesPlayed(players);
        if(ans1!=null){
            System.out.println("id-"+ans1.id);
            System.out.println("matchesPlayed-"+ans1.matchesPlayed);
            System.out.println("totalRuns-"+ans1.totalRuns);
            System.out.println("name-"+ans1.name);
            System.out.println("team-"+ans1.team);
        }
        else{
            System.out.println("No Player found with mentioned attribute");
        }
        Player ans2=searchPlayerById(players,input1);
        if(ans2!=null){
            System.out.println("id-"+ans2.id);
            System.out.println("matchesPlayed-"+ans2.matchesPlayed);
            System.out.println("totalRuns-"+ans2.totalRuns);
            System.out.println("name-"+ans2.name);
            System.out.println("team-"+ans2.team);
        }
        else{
            System.out.println("No Player found with mentioned attribute");
        }
    }

    public static Player findPlayerWithMinimumMatchesPlayed(Player[] players)
    {
        Player p = null;
        int min = players[0].matchesPlayed;
        for(int i=1; i<players.length;i++){
            if(players[i].matchesPlayed<min){
                min = players[i].matchesPlayed;
                p = players[i];
            }
        }
        if(p!=null){
            return p;
        }
        else{
            return null;
        }
    }

    public static Player searchPlayerById(Player[] players, int id)
    {
        Player pl = null;
        for(int i=0; i<players.length;i++){
            if(players[i].getId()==id){
                pl=players[i];
            }
        }
        if(pl!=null){
            return pl;
        }
        else{
            return null;
        }

    }

}

class Player {
    int id;
    int matchesPlayed;
    int totalRuns;
    String name;
    String team;

    public Player(int id, int matchesPlayed, int totalRuns, String name, String team) {
        this.id = id;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.name = name;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
