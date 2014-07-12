package Simul;

/**
 * Created by sansiro on 11.07.14.
 */
class Team {
    static int TeamCount = 0;
    static int Max = 1000;
    static int Min = 0;

    public Team(){
      //  double strength = Min + (int)(Math.random() * ((Max - Min) + 1));
        String teamName = "Team" + TeamCount;
   // System.out.println("New team was created with Strength" + strength);
        TeamCount++;


    }

}
