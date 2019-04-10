package ilyb;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Profile {
   private Map<String,Answer> answers = new HashMap<>();

   private int score;
   private String name;
   private Matches myMatches = new Matches(this);

   public Profile(String name) {
      this.name = name;
   }
   
   public String getName() {
      return name;
   }

   public void add(Answer answer) {
      answers.put(answer.getQuestionText(), answer);
   }


   public boolean calculateMatches(Criteria criteria) {
	   return myMatches.matches(criteria);
   }
   
   

  public Map<String, Answer> getAnswer() {
	  return answers;
  }

   public int score() {
      return score;
   }
   
   public void setScore(int set) {
	   score = set;
   }
   
   public void addScore(int add) {
	   score = score+add;
   }

   
   @Override
   public String toString() {
     return name;
   }

}

