package programs;

public class RotateArray {
    public static void main(String args[] ) throws Exception {
        int input[]={1,2,3,4,5,8,10};
       System.out.println("Right rotate");
      //  rotateRight(input,5);
        System.out.println("\nLeft rotate");
        rotateLeft(input,5);
    }
    static void rotateRight(int[] inputArray, int rotations){
        int temp;
        while(rotations>0){
            temp=inputArray[inputArray.length-1];
            for(int i=inputArray.length-1;i>0;i--){
                inputArray[i]=inputArray[i-1];
            }
            inputArray[0]=temp;
            rotations--;
        }
        for(int x:inputArray)
            System.out.print(x+" ");
    }
    static void rotateLeft(int[] inputArray, int rotations){
        int temp;
        while(rotations>0){
            temp=inputArray[0];
            for(int i=0;i<inputArray.length-1;i++){
            	inputArray[i]=inputArray[i+1];
            }
            inputArray[inputArray.length-1]=temp;
            rotations--;
        }
        for(int x:inputArray)
            System.out.print(x+" ");
    }
}
