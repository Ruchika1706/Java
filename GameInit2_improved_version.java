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
   /* public boolean teamNameInArray(String arr[]){
        for(String each:arr){
            if(this.homeTeamName.equalsIgnoreCase(each))
        }
    }*/
    
    public boolean areTeamsInGame(String team1, String team2) {
        if((team1.equals(this.homeTeamName) && team2.equals(this.awayTeamName))||(team1.equals(this.awayTeamName)&&team2.equals(this.homeTeamName))){
            return true;
        }
        return false;       
    }
    public boolean didTeamWin(String name){
        if((this.didHomeTeamWin() && this.getHomeTeamName().equalsIgnoreCase(name)) ||(this.didAwayTeamWin() && this.getAwayTeamName().equalsIgnoreCase(name))){
            return true;
        }
        return false;
    }
    public boolean hasTeamPlayed(String name){
        if(this.getHomeTeamName().equalsIgnoreCase(name)||this.getAwayTeamName().equalsIgnoreCase(name)){
            return true;
        }
        return false;
    }
    public boolean hasTeamLost(String name){
        return !(this.didTeamWin(name)||this.wasItADraw());
        
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
        String total[] = new String[Maha.length+Guj.length];
        int k=0;
        for(k=0;k<Maha.length;k++){
            total[k]= Maha[k];
            
        }
        for(int j=0;j<Guj.length;j++){
            total[k]=Guj[j];
            k = k+1;
        }
        /*
        for(int i=0;i<total.length;i++){
            System.out.println(total[i]);
        }
        */  
        
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
        System.out.println("Teams who have not lost two games in a row are");

        for(int j=0;j<total.length;j++)
        {
            boolean flag=false;
            int i=0;
            for(i=0;i<arr.length;i++){
                if(arr[i].hasTeamPlayed(total[j])&&arr[i].hasTeamLost(total[j])){
                    if(flag==false){
                        flag=true;
                        continue;
                    } else if(flag==true){
                        //System.out.println(total[j]);
                       // flag=false;
                        break;
                    }
                }
            }
            if(i==arr.length){
                System.out.println(total[j]);
            }
            
        }
        /*
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
            
                if(arr[i].areTeamsInGame(each, temp)){
                   gameCount += 1;
                    if(arr[i].didTeamWin(temp)){
                         winG+=1;
                     } 
                }
             }
            }
            if(arr[i].wasItADraw()){
                         c +=1;
            }
        }
        for(int i=0;i<count;i++){
            
        }
        System.out.println("The number of games between MAH and GUJ are "+ gameCount);
        System.out.println("The number of games won by GUJ "+ winG);
        System.out.println("The number of games won by MAH "+ (gameCount-winG-c));
        
    }
    */
}
}
