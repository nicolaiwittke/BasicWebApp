package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Nico";
        } else if (query.contains("largest")){
            List<Integer> list = new ArrayList<>();
            String sub = query.substring(query.indexOf(":"), query.length());
            String [] tmpString = sub.split(",");

            for (String s : tmpString){
                int tmpInt = Integer.parseInt(s);
                list.add(tmpInt);
            }



            int result = Collections.max(list);;



            return "" + result;
        }
        else if (query.contains("plus")){
            int first = Integer.parseInt(query.substring(query.indexOf("is"), query.indexOf("plus")));
            int second = Integer.parseInt(query.substring(query.indexOf("plus"), query.length()));
            int finished = first + second;
            return "" + finished;
        }
        return "";
    }

}
