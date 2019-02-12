import java.util.*;

class Main 
{

  public static void main(String[] args) 
  {
    int[] arr = {2,1,5,4,0,-1};
    SortLeo sort = new SortLeo();
    int[] arr2 = sort.Sort(arr);
    for(int i = 0; i < arr2.length; i++){
      System.out.println(arr2[i]);
    }
  }
}
