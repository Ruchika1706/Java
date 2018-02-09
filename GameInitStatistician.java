/*
The statistician who was making the array of games forgot the scores of some of the games.
So he assumed that those games have home score and away score as -1. The scores of the games he
knew he created the objects accordingly.

For the games whose score he did not know he had 3 ways to set the scores of either of the
playing teams.

One of the ways was to the give advantage to the hometeam with a value which is the avg of
the scores of the games whose scores he knew. This way th3 awayteam was given a 0 score.

The other way would be to see how many of the games have the away team won among the games
whose scores he knew. If the awayteam won majority of the games then for the games whose score
is unknown he would follow the below formula

Homescore = difference between the avg of the awayscores and the homescores
Awayscore = Any value greater than the homescore


He is really confused. So he decides to copy the details of any of the games' scores he knows
This has to be achived via a CONSTRUCTOR.


Now which way to choose?? This is decided by the user. Either of the ways print the games.
Use the concept of both Constructor AND function overloading
 */


import java.util.Scanner;
class Game {
    private int homescore;
    private int awayscore;
    /*constructor Overloading*/
    Game(){
        this.homescore = this.awayscore = -1;
    }
    Game(int homeScore, int awayScore){
        this.homescore = homeScore;
        this.awayscore = awayScore;
    }
    Game(Game test){
        this.homescore = test.homescore;
        this.awayscore = test.awayscore;
    }

    public int getHomeScore(){
        return this.homescore;
    }
    public int getAwayScore() {
        return this.awayscore;
    }
    public boolean didHomeTeamWon() {
        if(this.homescore > this.awayscore){
            System.out.println("Home Team won");
            return true;
        }
        else if(this.homescore < this.awayscore){
            System.out.println("Away Team won");
            return false;
        }
        return false;
    }
    public boolean wasItADraw(){
        if(this.homescore==this.awayscore){
            return true;
        }
        return false;
    }

    public void display() {
        System.out.print("Home Score: ");
        System.out.print(this.getHomeScore() + " ");
        System.out.print("Away Score: ");
        System.out.println(this.getAwayScore() + " ");
    }
    /*Function Overloading*/
    public void setScores(int average){
        this.homescore = average;
        this.awayscore = 0;
    }
    public void setScores(int hs, int as){
        this.homescore = hs;
        this.awayscore = as;
    }
}
class GameInitStatistician {
    public static void main (String args[]){
        System.out.println("How many games were played between the two teams?");
        Scanner si = new Scanner(System.in);
        int count = si.nextInt();
        Game test[] = new Game[count];
        for(int i=0;i<count;i++){
            System.out.println("For game " + (i+1) + "Do you know the score? Enter 1 for yes 0 for no");
            int homescore;
            int awayscore;
            int choice = si.nextInt();
            if(choice==1){
                System.out.println("Enter the score for home team");
                homescore = si.nextInt();
                System.out.println("Enter the score for away team");
                awayscore = si.nextInt();
                test[i] = new Game(homescore,awayscore);
            } else if(choice == 0){
                test[i] = new Game();
            } else {
                System.out.println("You do not have any other option than one or zero. Try again later");
                break;
            }
        }
        for(int i=0;i<count;i++){
            test[i].display();
        }
        System.out.println("What option should I choose to assign scores for games I do not know?");
        System.out.println("1. give advantage to the hometeam with a value which is the avg of the scores of the games whose scores I know and 0 to away team?");
        System.out.println("2. check how many matches won by each team, if awayteam won more, follow the formula below, if not choose 1");
        System.out.println("Homescore = difference between the avg of the awayscores and the homescores" +"\n"+
                "Awayscore = Any value greater than the homescore");
        System.out.println("3. Copy details of the games I know to the games I do not know");
        int option = si.nextInt();
        switch(option){
            case 1:
                int sum=0;
                int flag=0;
                for(int i=0;i<count;i++){
                    if(test[i].getHomeScore()!=-1 && test[i].getAwayScore()!=-1){
                        flag = flag+1;
                        sum+= test[i].getHomeScore();
                    }
                }
                int average = sum/flag;
                for(int i=0;i<count;i++){
                    if(test[i].getHomeScore()==-1){
                        test[i].setScores(average);
                    }
                }
                break;
            case 2:
                int homeWins=0;
                int awayWins=0;
                for(int i=0;i<count;i++){
                    if(!test[i].wasItADraw()) {
                        if (test[i].didHomeTeamWon()) {
                            homeWins += 1;
                        } else {
                            awayWins += 1;
                        }
                    }
                }
                int hs=0;
                int as=0;
                int flags=0;
                for(int i=0;i<count;i++){
                    if(test[i].getHomeScore()!=-1 && test[i].getAwayScore()!=-1){
                        flags = flags+1;
                        hs+= test[i].getHomeScore();
                        as+=test[i].getAwayScore();
                    }
                }
                int avgHome = hs/flags;
                int avgAway = as/flags;
                if(awayWins>homeWins){
                    for(int i=0;i<count;i++){
                        if(test[i].getHomeScore()==-1&& test[i].getAwayScore()==-1){
                            test[i].setScores(Math.abs(avgAway-avgHome),Math.abs(avgAway-avgHome)+1);
                        }
                    }
                }
                break;
            case 3:
                for(int i=0;i<count;i++){
                    if(test[i].getHomeScore()==-1 && test[i].getAwayScore()==-1){
                        for(int j=0;j<count;j++){
                            if(test[j].getHomeScore()!=-1){
                                test[i] = new Game(test[j]);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("We have run out of options. Try again later");
                break;
        }
        for(int i=0;i<count;i++){
            test[i].display();
        }
    }
}