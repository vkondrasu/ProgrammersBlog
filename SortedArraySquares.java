class SortedArraySquares {

  public static int absolute(int n){
    return n > 0 ? n : -n;
  }

  public static int[] makeSquares(int[] arr) {
    int[] squares = new int[arr.length];
    int n = arr.length;

    int start_i = 0;
    int end_i = n-1;

    int c_index = n-1;

    while(start_i < end_i){
      if( absolute(arr[start_i]) > absolute(arr[end_i]) ){
        squares[c_index--] = arr[start_i] * arr[start_i];
        start_i++;
      }else{
        squares[c_index--] = arr[end_i] * arr[end_i];
        end_i--;
      }
    }

    return squares;
  }

  public static void main(String[] args) {

    int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 });
    for (int num : result)
      System.out.print(num + " ");
    System.out.println();

    result = SortedArraySquares.makeSquares(new int[] { -3, -1, 0, 1, 2 });
    for (int num : result)
      System.out.print(num + " ");
    System.out.println();
  }
}
