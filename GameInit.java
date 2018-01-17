import java.util.Scanner;
class Game {
    private int homescore;
    private int awayscore;
    public void setAwayscore(int awayscore) {
        this.awayscore = awayscore;
    }

    public void setHomescore(int homescore) {
        this.homescore = homescore;
    }
    public int getHomeScore(){
        return this.homescore;
    }
    public int getAwayScore() {
        return this.awayscore;
    }
    public void getWinner() {
        if(this.homescore > this.awayscore){
            System.out.println("Home Team won");
        }
        else if(this.homescore < this.awayscore){
            System.out.println("Away Team won");
        }
        else {
            System.out.println("Match Draw");
        }
    }
    public double getAveragePerGame(){
        return (this.homescore + this.awayscore)/2;
    }
    public Game getDifference(Game test){
        return (Math.abs(this.homescore - this.awayscore) > Math.abs(test.homescore - test.awayscore))?this:test ;
    }
}
class GameInit {
    public static void main (String args[]){
        System.out.println("Enter the number of games you want the teams to play");
        Scanner si = new Scanner(System.in);
        int count = si.nextInt();
        Game g[] = new Game[count];
        for(int i=0;i<g.length;i++){
            g[i] = new Game();
            System.out.println("Enter the homescore for " + (i+1) +" game");
            g[i].setHomescore(si.nextInt());
            System.out.println("Enter the awayscore for " + (i+1) +" game");
            g[i].setAwayscore(si.nextInt());
        }
        System.out.println("Winner List");
        for(int i=0;i<g.length;i++){
            System.out.println("For " +(i+1)+ " Game");
            g[i].getWinner();
        }
        System.out.println("Average of tournament");
        double average = 0;
        for(int i=0;i<g.length;i++){
            average = average+g[i].getAveragePerGame();
        }
        average = average/g.length;
        System.out.println(average);
        Game largestdiff = g[0];
        for(int i=1;i<g.length;i++){
            largestdiff = largestdiff.getDifference(g[i]);
        }
        System.out.println("Game which has the largest difference between home score and away score has Home score: " +largestdiff.getHomeScore() +" AwayScore " + largestdiff.getAwayScore() +" Difference being " + Math.abs(largestdiff.getHomeScore()-largestdiff.getAwayScore()));

    }
}