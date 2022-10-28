import java.util.ArrayList;
import java.util.Collections;

public class OddEven {

public static void main(String[] args) {

int[] myArray={1,2,3,4} ;
ArrayList<Integer>evenList = new ArrayList<Integer>();

for(int i=0;i<myArray.length;i++){
if(myArray[i]%2==0){
evenList.add(myArray[i]);
}
}
Collections.sort(evenList);
for(int even : evenList)
System.out.print(even+" ");

}
}