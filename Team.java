//template or blueprint

public class Team {

    // Data Fields
    private String name;
    private int win_Total;
    private int loss_Total;
    private int tie_Total;
    private int Total_goals_scored;
    private int Total_goals_allowed;

    // Constructor
    public Team(String name){
        this.name = name;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin_Total() {
        return win_Total;
    }

    public void setWin_Total(int win_Total) {
        this.win_Total = win_Total;
    }

    public int getLoss_Total() {
        return loss_Total;
    }

    public void setLoss_Total(int loss_Total) {
        this.loss_Total = loss_Total;
    }

    public int getTie_Total() {
        return tie_Total;
    }

    public void setTie_Total(int tie_Total) {
        this.tie_Total = tie_Total;
    }

    public int getTotal_goals_scored() {
        return Total_goals_scored;
    }

    public void setTotal_goals_scored(int Total_goals_scored) {
        this.Total_goals_scored = Total_goals_scored;
    }

    public int getTotal_goals_allowed() {
        return Total_goals_allowed;
    }

    public void setTotal_goals_allowed(int Total_games_allowed) {
        this.Total_goals_allowed = Total_games_allowed;
    }

    public void print_stats(){ //set as void because there is no return type. Just printing it out to the console
        System.out.println(name);
        System.out.print("Wins: " + win_Total + ", ");
        System.out.print("Losses: " + loss_Total + ", ");
        System.out.println("Ties: "+ tie_Total); // or do +"\n");
        System.out.print("Total goals scored: " + Total_goals_scored + ", " );
        System.out.println("Total goals allowed: " + Total_goals_allowed);
        System.out.println();
    }


}
//Encapsulation: so that can't be used in another method.
