package sortArr;

public class Desc extends Sort{
  @Override
  protected boolean condition(int[] arr, int index) {
    return arr[index] < arr[index + 1];
  }
}
