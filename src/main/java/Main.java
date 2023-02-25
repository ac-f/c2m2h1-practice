import search.CountNumberOfWaterballs;
import search.SearchEmptyMessageIndex;
import search.SearchLongestMessage;
import search.SearchStrategy;
import sortArr.Desc;
import sortArr.Sort;
import sortArr.SortStrategy;

public class Main {
  public static void main(String[] args) {
    //Sort Arr
    int[] intArr = {1, 7, 9, 100, 52, 64, 24, 99};
    SortStrategy strategy = new Desc();
    strategy.sort(intArr);

    //Search
    String[] str = {"Waterball", "Apple Waterball", "", "Waterball", "Banana", "", "", "Cherry", "Waterball", "Grape"};
    SearchStrategy countNumberOfWaterballs = new CountNumberOfWaterballs();
    SearchStrategy emptyMessageIndex = new SearchEmptyMessageIndex();
    SearchStrategy longestMessage = new SearchLongestMessage();
    countNumberOfWaterballs.search(str);
    emptyMessageIndex.search(str);
    longestMessage.search(str);

  }
}
