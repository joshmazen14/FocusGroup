public class CarIdea {
  private String idea;

  public CarIdea(String idea) {
    this.idea = idea;
  }

  public boolean isIdeaGood() {
    return IdeaDeterminer.isCarIdeaGood(idea);
  }

  @Override
  public int hashCode() {
    return idea.hashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == null) return false;
    if (other instanceof CarIdea) {
      CarIdea otherIdea = (CarIdea) other;
      return idea.equals(otherIdea.idea);
    }

    return false;
  }
}
