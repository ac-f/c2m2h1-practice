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

  protected T defaultResult() {
    return null;
  }
  protected boolean condition(T result, String str) {
    return false;
  }
  protected T operation(String str) {
    return null;
  }
}
