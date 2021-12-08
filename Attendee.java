import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Attendee implements Comparable<Attendee> {
  private String name;
  private boolean flinches;
  private boolean lovesMotherInLaw;
  private Set<CarIdea> goodCarIdeas;
  private Set<CarIdea> badCarIdeas;
  private Random random;

  public Attendee(String name, boolean flinches, Random random, boolean lovesMotherInLaw) {
    this.name = name;
    this.flinches = flinches;
    this.goodCarIdeas = new HashSet<>();
    this.badCarIdeas = new HashSet<>();
    this.random = random;
    this.lovesMotherInLaw = lovesMotherInLaw;
  }

  public Attendee(String name) {
    this(name, true, new Random(), true);
  }

  @Override
  public String toString() {
    return name;
  }

  public boolean addIdea(String idea) {
    System.out.println(idea);
    CarIdea carIdea = new CarIdea(idea);
    if (carIdea.isIdeaGood()) {
      goodCarIdeas.add(carIdea);
      if (numGoodCarIdeas() == 2) {
        System.out.println("Oh nice!");
      }
      return true;
    }

    badCarIdeas.add(carIdea);
    if (badCarIdeas.size() == 5) {
      System.out.println("Teacher's pet!");
    }
    return false;
  }

  public String getName() {
    return name;
  }

  public boolean didTheyFlinch() {
    return flinches;
  }

  public int numGoodCarIdeas() {
    return goodCarIdeas.size();
  }

  public boolean hasCarIdea(String idea) {
    return goodCarIdeas.contains(new CarIdea(idea));
  }

  public String flipBottle(Attendee otherPerson) {
    int quoteRandomFlipUnquote = random.nextInt(1);

    if (quoteRandomFlipUnquote == 1 && otherPerson.didTheyFlinch()) {
      return otherPerson.getName() + " has to marry their mother-in-law!";
    } else {
      return "Nothing";
    }
  }

  public boolean getLovesMotherInLaw() {
    return lovesMotherInLaw;
  }

  @Override()
  public int compareTo(Attendee other) {
    return other.numGoodCarIdeas() - numGoodCarIdeas();
  }
}
