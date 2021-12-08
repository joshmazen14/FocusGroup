import java.util.Arrays;

public class FocusGroup {
  public static void main(String[] args) {
    Attendee paul = new Attendee("Paul");
    Attendee ruben = new Attendee("Ruben", false, new BeingAFlipGod(), false);

    paul.addIdea("Bluetooth capabilities");
    paul.addIdea("Extra cupholders");

    ruben.addIdea("A good steering wheel that doesn't fly off when you're driving");

    paul.addIdea("Automatic side-view mirrors");

    ruben.addIdea("A great steering wheel that doesn't whiff out of the window while I driving");

    paul.addIdea("Sleek");
    ruben.addIdea("Too small");
    if (IdeaDeterminer.isCarIdeaGood("Too small")) {
      System.out.println("I think it's a good idea, and I stand by it.");
    }

    paul.addIdea("Sporty look");
    ruben.addIdea("Stinky");
    ruben.addIdea("No space for mother-in-law");

    if (!paul.hasCarIdea("No space for mother-in-law")) {
      System.out.println("Shut up " + paul + ". You probably love your mother-in-law.");
      if (paul.getLovesMotherInLaw()) {
        System.out.println("Oh my god. He admit it!");
      }
    }

    if (paul.numGoodCarIdeas() == 0) {
      System.out.print(paul + ". " + paul + ".");
      System.out.println("You. Have. No. Good. Car. Ideas.");
    }

    Attendee[] attendees = new Attendee[]{ruben, paul};
    Arrays.sort(attendees);
    System.out.println(attendees[0] + " is doing the best at this.");
    if (ruben.numGoodCarIdeas() == 5) {
      System.out.println("This car is everything.");
      String actionPaulMustTake = ruben.flipBottle(paul);
      System.out.println("Now " + actionPaulMustTake);
      if (ruben.numGoodCarIdeas() > paul.numGoodCarIdeas()) {
        System.out.println(ruben + " is the most popular now " + paul);
        ruben.flipBottle(paul); // nothing done here, Paul already has to marry his mother-in-law
      }
    }
  }
}
