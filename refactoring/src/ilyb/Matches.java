package ilyb;

import java.util.Map;

public class Matches {
	private Profile profile = null;

	 Matches(Profile prof){
		 profile = prof;
	 }
	 
	 public boolean matches(Criteria criteria) {
	      calculateScore(criteria);
	      if (doesNotMeetAnyMustMatchCriterion(criteria))
	         return false;
	      return anyMatches(criteria);
	   }
	 
	 private void calculateScore(Criteria criteria) {
	      profile.setScore(0);
	      for (Criterion criterion: criteria) 
	         if (criterion.matches(answerMatching(criterion))) 
	            profile.addScore(criterion.getWeight().getValue()); ;
	   }

	   private boolean doesNotMeetAnyMustMatchCriterion(Criteria criteria) {
	      for (Criterion criterion: criteria) {
	         boolean match = criterion.matches(answerMatching(criterion));
	         if (!match && criterion.getWeight() == Weight.MustMatch) 
	            return true;
	      }
	      return false;
	   }

	   private boolean anyMatches(Criteria criteria) {
	      boolean anyMatches = false;
	      for (Criterion criterion: criteria) 
	         anyMatches |= criterion.matches(answerMatching(criterion));
	      return anyMatches;
	   }

	   private Answer answerMatching(Criterion criterion) {
		  Map<String, Answer> answers = profile.getAnswer(); 
	      return answers.get(criterion.getAnswer().getQuestionText());
	   }
}
