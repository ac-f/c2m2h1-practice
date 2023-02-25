package search;

public class CountNumberOfWaterballs extends Search<Integer>{
  private Integer count = 0;
  @Override
  protected Integer defaultResult() {
    return count;
  }

  @Override
  protected boolean condition(Integer result, String str) {
    return "Waterball".equals(str);
  }

  @Override
  protected Integer operation(String str) {
    count ++;
    return count;
  }
}
