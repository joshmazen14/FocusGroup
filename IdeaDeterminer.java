public class IdeaDeterminer {
  private static final String[] GOOD_CAR_IDEAS = { 
    "A good steering wheel that doesn't fly off when you're driving",
    "A good steering wheel that doesn't fly off your hand when you're driving",
    "A great steering wheel that doesn't whiff out of the window while I driving",
    "Too small",
    "Stinky",
    "No space for mother-in-law"
  };

  private IdeaDeterminer() {
    throw new IllegalStateException("You probably love your mother in law");
  }

  public static boolean isCarIdeaGood(String idea) {
    for (String goodCarIdea: GOOD_CAR_IDEAS) {
      if (idea.equals(goodCarIdea)) {
        return true;
      }
    }

    return false;
  }
}
