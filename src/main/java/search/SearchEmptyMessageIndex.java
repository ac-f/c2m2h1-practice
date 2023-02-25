package search;

public class SearchEmptyMessageIndex extends Search<Integer> {
  private Integer count = 0;
  @Override
  protected Integer defaultResult() {
    return count;
  }
  @Override
  protected boolean condition(Integer result, String str) {
    return str.isEmpty();
  }

  @Override
  protected Integer operation(String str) {
    count++;
    return count;
  }
}
