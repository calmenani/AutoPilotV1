package programs;

class SortArrays {
    public static void main(String args[] ) throws Exception {
        int []a={2,3,6,9,110};
        int []b={1,3,7,8,19,22,26,29,30};
        for(int x:mergeArrays(a,b)){
            System.out.print(x+" ");
        }
        
    }
    static int[] mergeArrays(int []a, int []b){
       
        int []c=new int[a.length+ b.length];
        
        int i=0;int j=0;int k=0;
        
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        if(i!=a.length){
            for(;i<a.length;i++){
                c[k++]=a[i];
            }
        }
        else{
            for(;j<b.length;j++){
                c[k++]=b[j];
            }
        }
        return c;
        
    }
}
