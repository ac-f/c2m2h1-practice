package search;

public class SearchLongestMessage extends Search<String> {
  private String result = "";

  @Override
  protected String defaultResult() {
    return result;
  }

  @Override
  protected boolean condition(String maxLengthMessage, String str) {
    return str.length() > maxLengthMessage.length();
  }

  @Override
  protected String operation(String str) {
    result = str;
    return result;
  }
}
