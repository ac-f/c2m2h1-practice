package sortArr;

public class Asc extends Sort{
  @Override
  protected boolean condition(int[] arr, int index) {
    return arr[index] > arr[index + 1];
  }
}
