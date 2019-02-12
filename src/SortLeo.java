import java.util.*;

class SortLeo
{
  // this will sort from least to greatest
  public int[] Sort(int[] array)
  {
    for(int i = 1; i < array.length; i++)
    {
      int j = i-1;
      int i2= i;
      int dummy = array[i];
      while(j >= 0 && array[j] > dummy)
      {
        array[i2] = array[j];
        array[j] = dummy;
        j--;
        i2--;
      }
    }
    return array;
  }
}
