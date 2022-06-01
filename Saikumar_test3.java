public class Main
{
public static void main(String[] args) {
// TODO Auto-generated method stub
int arr[] = {1,-2,-3,5};
int arr1[] = {1,2,3,-5};
int arr2[] = {1,2,0,-5};
System.out.println("[ " + solution(arr) + " ] => Needs to be 1" );
System.out.println("[ " + solution(arr1) + " ] => Needs to be -1");
System.out.println("[ " + solution(arr2) + " ] => Needs to be 0");
System.out.println("Final return should be (-1, 1, 0)");
}
public static int solution(int[] A) {
int temp = 1;
for (int i = 0; i < A.length; i++){
temp *= A[i];
}
return temp;
}
}

output:
[ 30 ] => Needs to be 1
[ -30 ] => Needs to be -1
[ 0 ] => Needs to be 0
Final return should be (-1, 1, 0)
