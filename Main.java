import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void main(String[] args) {
        Team t1 = new Team("Team 1");
        Team t2 = new Team("Team 2");
        Team t3 = new Team("Team 3");
        Team t4 = new Team("Team 4");

        Team[] teams = {t1, t2, t3, t4};//or could create new Team[4]

        ArrayList<Game> games_played = new ArrayList<Game>();


        Random rand = new Random();
        int winter_weeks = 0;
        int gameID = 1;

        while (winter_weeks < 3) {


            //Generate random temp
            double temp = rand.nextDouble(100);

            //Decide if game is played or not
            if (temp <= 32) {
                winter_weeks++;
                System.out.println("Too cold to play. ");
                continue;

            } else {
                // a game is played

                // reset winter_weeks
                winter_weeks = 0;

                // select Team 4 first
                Team home1 = teams[3];

                //Randomly select another team [T1, T2, T3]
                int awayTeam = rand.nextInt(3);

                Team away1 = teams[awayTeam];

                ////
                //Team home1 = null; // look back if Instructor Holley has this on his code
                ////

                // Select other 2 teams for Game 2
                Team home2 = null;
                Team away2 = null;

                Game game1 = null;
                Game game2 = null;


                switch (awayTeam) {
                    case 0:
                        home2 = teams[1];
                        away2 = teams[2];
                        break;
                    case 1:
                        home2 = teams[0];
                        away2 = teams[2];
                        break;
                    case 2:
                        home2 = teams[0];
                        away2 = teams[2];
                        break;
                    case 3:
                        home2 = teams[0];
                        away2 = teams[1];
                        break;
                }


                // Randomly select Scores
                if (temp <= 49) {

                    game1 = new Game(gameID, temp, away1, home1,
                            rand.nextInt(6), rand.nextInt(6));
                    game2 = new Game(gameID + 1, temp, away2, home2,
                            rand.nextInt(6), rand.nextInt(6));


                } else if (temp <= 66) {
                    game1 = new Game(gameID, temp, away1, home1,
                            rand.nextInt(11), rand.nextInt(11));

                    game2 = new Game(gameID + 1 , temp, away2, home2,
                            rand.nextInt(11), rand.nextInt(11));

                } else if (temp <= 83) {
                    game1 = new Game(gameID, temp, away1, home1,
                            rand.nextInt(16), rand.nextInt(16));

                    game2 = new Game(gameID + 1, temp, away2, home2,
                            rand.nextInt(16), rand.nextInt(16));

                } else if (temp <= 100) {
                    game1 = new Game(gameID, temp, away1, home1,
                            rand.nextInt(21), rand.nextInt(21));

                    game2 = new Game(gameID + 1, temp, away2, home2,
                            rand.nextInt(21), rand.nextInt(21));

                }

                gameID += 2;



                //Game 1 Total goals
                away1.setTotal_goals_scored(away1.getTotal_goals_scored() + game1.getAway_score());
                away1.setTotal_goals_allowed(away1.getTotal_goals_allowed() + game1.getHome_score());
                home1.setTotal_goals_allowed(home1.getTotal_goals_scored() + game1.getAway_score());
                home1.setTotal_goals_allowed(home1.getTotal_goals_allowed() + game1.getHome_score());

                //Game 2 Total goals
                away2.setTotal_goals_scored(away2.getTotal_goals_scored() + game2.getAway_score());
                away2.setTotal_goals_allowed(away2.getTotal_goals_allowed() + game2.getHome_score());
                home2.setTotal_goals_allowed(home2.getTotal_goals_scored() + game2.getAway_score());
                home2.setTotal_goals_allowed(home2.getTotal_goals_allowed() + game2.getHome_score());

                games_played.add(game1);
                games_played.add(game2);

                record_WLT(game1);
                record_WLT(game2);

            }
        }

        System.out.println("Season is over");
        System.out.println("*********RESULTS********* \n \n \n");

        for (Team team : teams) {
            team.print_stats();
        }

        for (Game game : games_played){
            game.print_stats();
            System.out.println();
        }
    }
    public static void record_WLT(Game game){
        if (game.getAway_score() > game.getHome_score()) {
            game.getAway().setWin_Total(game.getAway().getWin_Total() + 1);
            game.getHome().setLoss_Total(game.getHome().getLoss_Total() + 1);
        } else if (game.getHome_score() > game.getHome_score()) {
            game.getHome().setWin_Total(game.getHome().getWin_Total() + 1);
            game.getAway().setLoss_Total(game.getAway().getLoss_Total() + 1);

        } else {
            game.getAway().setTie_Total(game.getAway().getTie_Total() + 1);
            game.getHome().setTie_Total(game.getHome().getTie_Total() + 1);
        }
    }
}



// 1)winter_weeks resets
// 2)Score is generated
// 3)Somebody is selected
// 4)ID counterer

        //g1.print_stats();
//4 Teams
//2 Games played on Tuesdays only

// <= 32 degrees means, no games played
// 3 consecutive weeks of freezing temps means winter has arrived,
    // and the season has ended

//Teams
// Data Fields (keep track of)
    // name
    // Win-Total
    // Loss-Total
    // Total-goals scored
    // Total-goals allowed

// [T1,T2,T3,T4]

//Methods(Print_stats())

//Game
    //ID number
    //team-score
    //temperature

    //class stores array list of all games as a field

    //Determine the scores at random. Range of 0-20

    //do a random range for temperature

//Scheduler
    //in the main method
    //random temperature NOT input if you don't want it
        //Try and accept if using input
    // if it's warm enough, schedule 2 games
    // opponents chosen at random

//Printed output
//Each Game's ID
    //Temperature

    //Away team # Each team has a name

    //Home team # Each team has a name

    //Hottest Temp 100
    //Coldest Temp 0
