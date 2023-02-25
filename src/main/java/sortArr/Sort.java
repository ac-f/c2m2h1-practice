package sortArr;

public abstract class Sort implements SortStrategy {
  public void sort(int[] arr) {
    var length = arr.length;
    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - i - 1; j++) {
        if (condition(arr, j)) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < length; i++) {
      System.out.println(arr[i]);
    }
  }

  protected boolean condition(int[] arr, int index) {
    return arr[index] < arr[index + 1];
  }
}
