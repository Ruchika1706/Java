/*UC Berkeley
Game -> hometeamname, awayteam name, homescore, awayscore
Create an array of games;
Maharashtra 4 teams Mumbai, nagpur, punbe, amravati
Gujarat 3 teams Gandhinagar, AHM and POR
games can be interstate and intrastate
1.) How many games are there between maharashtra abd gujarat
2.) how many won by MAH and how many won by GUJ?
*/

import java.util.Scanner;
class Game{
    private String homeTeamName;
    private String awayTeamName;
    private int homeScore;
    private int awayScore;
    public Game(int hs,int as,String name1, String name2){
        this.homeScore=hs;
        this.awayScore = as;
        this.homeTeamName = name1 ;
        this.awayTeamName = name2;
    }
    public void setHomeTeamName(String name){
        this.homeTeamName = name;
    }
    public void setAwayTeamName(String name){
        this.awayTeamName = name;
    }
    public String getHomeTeamName(){
        return this.homeTeamName;
    }
    public String getAwayTeamName(){
        return this.awayTeamName;
    }
    public int getHomeScore(){
        return this.homeScore;
    }
    public int getAwayScore(){
        return this.awayScore;
    }
    public void setHomeScore(int hs){
        this.homeScore = hs;
    }
    public void setAwayScore(int as){
        this.awayScore = as;
    }
    public boolean didHomeTeamWin() {
        if(this.homeScore > this.awayScore){
            //System.out.println("Home Team won");
            return true;
        }
        else if(this.homeScore < this.awayScore){
           // System.out.println("Away Team won");
            return false;
        }
        return false;
    }
     public boolean didAwayTeamWin() {
       if(this.homeScore < this.awayScore){
            //System.out.println("Home Team won");
            return true;
        }
        else if(this.homeScore > this.awayScore){
           // System.out.println("Away Team won");
            return false;
        }
        return false;
    }
    public boolean wasItADraw(){
        if(this.homeScore==this.awayScore){
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

    public void setScores(int hs, int as){
        this.homeScore = hs;
        this.awayScore = as;
    }
}
class GameInit2{
    public static void main(String args[]){
        System.out.println("Enter the number of games played");
        Scanner si = new Scanner(System.in);
        int count = si.nextInt();
        Game arr[] = new Game[count];
        String Maha[] = {"Mumbai","Nagpur","Pune","Amravati"};
        String Guj[] = {"Gandhinagar","AHM","POR"};
        for(int i=0;i<count;i++){
            System.out.println("Enter the homeTeam Name");
            String ht = si.next();
            System.out.println("Enter the awayTeam Name");
            String at = si.next();
            System.out.println("Enter the homescore");
            int hs = si.nextInt();
             System.out.println("Enter the awayscore");
            int as = si.nextInt();
            arr[i] = new Game(hs,as,ht,at);
        }
        int gameCount=0;
        int winG=0;
        int c=0;
        for(int i=0;i<count;i++){
            for(String each:Maha) {
                for(String temp:Guj){
                 if((arr[i].getHomeTeamName().equalsIgnoreCase(each)&&arr[i].getAwayTeamName().equalsIgnoreCase(temp))||(arr[i].getHomeTeamName().equalsIgnoreCase(temp)&&arr[i].getAwayTeamName().equalsIgnoreCase(each))){
                     gameCount +=1;
                     if((arr[i].didHomeTeamWin() && arr[i].getHomeTeamName().equalsIgnoreCase(temp))||(arr[i].didAwayTeamWin() && arr[i].getAwayTeamName().equalsIgnoreCase(temp)))
                         winG+=1;
                     } 
                }
            }
            if(arr[i].wasItADraw()){
                         c +=1;
            }
        }
        System.out.println("The number of games between MAH and GUJ are "+ gameCount);
        System.out.println("The number of games won by GUJ "+ winG);
        System.out.println("The number of games won by MAH "+ (gameCount-winG-c));
        
    }
}