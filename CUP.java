package Simul;
import Simul.*;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * Created by sansiro on 11.07.14.
 */
public class CUP {

    public static void main(String[] args) {
    Map<String, Double> map = new HashMap<String, Double>();
    for(int i = 0; i < 48; i++ ){
    Team team = new Team();
       // map.put("Team"+team.TeamCount,team.strength );
        double strength = Math.random();
        map.put("Team"+team.TeamCount,strength);

         // Creat 48 teams for Cup

    }
    double max = 0;
    String winner = "Team"+1;



        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator() ;
        while(iterator.hasNext()){
            Map.Entry<String, Double> mapEntry = iterator.next();
            System.out.println(mapEntry.getKey() + "has strength  " +  mapEntry.getValue() );


            if( max < mapEntry.getValue()){ // searh the Winer!
                max = mapEntry.getValue();
                winner = mapEntry.getKey();


            }

        }
        System.out.println("The winner is team " + winner +" with strength " + map.get(winner));

            }

        }

