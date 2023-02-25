package search;

public abstract class Search<T> implements SearchStrategy<T> {
  @Override
  public T search(String[] arr) {
    T result = defaultResult();
    for (String str : arr) {
      if (condition(result, str)) {
        result = operation(str);
      }
    }
    System.out.println(result);
    return result;
  }

  //無預設行為
  protected abstract T defaultResult();
  //有預設行為
  protected boolean condition(T result, String str) {
    return false;
  }
  protected abstract T operation(String str);
}
