/*
Question: Game(homescore, awayscore, hometeam,awayteam)
Cricket inherits Game (totalruns, totalwickets)
Football inherits Game (totalgoals)
array of games, cricket, football or normal.
(a) normal game interesting is |hs-as|<5
Cricket game in interesting if (a) + wickets = 10
Football game is interesting is (a) + totalgoals>10
 */

import java.util.Scanner;
class Game1 {
    private int homescore;
    private int awayscore;
    /*constructor Overloading*/
    Game1(){
        this.homescore = this.awayscore = -1;
    }
    Game1(int homeScore, int awayScore){
        this.homescore = homeScore;
        this.awayscore = awayScore;
    }
    Game1(Game1 test){
        this.homescore = test.homescore;
        this.awayscore = test.awayscore;
    }
    public int getHomeScore(){
        return this.homescore;
    }
    public int getAwayScore() {
        return this.awayscore;
    }
    public boolean isGameInteresting(){
        if(Math.abs(this.getHomeScore()-this.getAwayScore()) < 5){
            return true;
        } else {
            return false;
        }
    }
}
class Cricket extends Game1 {
    private int totalRuns;
    private int totalWickets;
    Cricket(){
        super();
        this.totalRuns = this.totalWickets = -1;
    }
    Cricket(int homeScore, int awayScore, int totalRuns, int totalWickets){
        super(homeScore,awayScore);
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }
    public boolean isGameInteresting(){
        if(super.isGameInteresting() && (this.totalWickets ==10)){
            return true;
        }
        else {
            return false;
        }

    }
}
class Football extends Game1 {
    private int totalGoals;
    Football(){
        super();
        this.totalGoals = -1;
    }
    Football(int homeScore, int awayScore, int totalGoals){
        super(homeScore,awayScore);
        this.totalGoals = totalGoals;
    }
    public boolean isGameInteresting(){
        if(super.isGameInteresting() && (this.totalGoals >=10)){
            return true;
        }
        else {
            return false;
        }
    }

}
class DriverProgramClass {
    public static void main(String args[]){
        System.out.println("Enter the number of total games to be played");
        Scanner si = new Scanner(System.in);
        int count = si.nextInt();
        Game1 obj[] = new Game1[count];
        int interestingCount=0;
        for(int i=0;i<count;i++){
            System.out.println("Enter 1 for a normal game 2 for a cricket game and 3 for a football game, any other to exit");
            int choice = si.nextInt();
            if(choice == 1){
                int hs,as;
                System.out.println("Enter the home score");
                hs = si.nextInt();
                System.out.println("Enter the away score");
                as = si.nextInt();
                obj[i] = new Game1(hs,as);
            } else if(choice == 2){
                int hs,as,runs,wickets;
                System.out.println("Enter the home score");
                hs = si.nextInt();
                System.out.println("Enter the away score");
                as = si.nextInt();
                System.out.println("Enter the total runs");
                runs = si.nextInt();
                System.out.println("Enter the total wickets");
                wickets = si.nextInt();
                obj[i] = new Cricket(hs,as,runs,wickets);
            } else if(choice == 3){
                int hs,as,goals;
                System.out.println("Enter the home score");
                hs = si.nextInt();
                System.out.println("Enter the away score");
                as = si.nextInt();
                System.out.println("Enter the total goals");
                goals = si.nextInt();
                obj[i] = new Football(hs,as,goals);
            } else {
                System.out.println("Invalid choice....Exiting");
                System.exit(0);
            }
        }
        for(Game1 i: obj){
            if (i.isGameInteresting()){
                interestingCount++;
            }
        }
        System.out.println("The number of interesting games are " + interestingCount);

    }
}