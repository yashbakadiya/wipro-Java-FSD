public class FunctionEx {

    public static void main(String[]  args){
    int array1[]={12,34,56};
    int array2[]={1,78,9};
    FunctionEx demo=new FunctionEx();
 // display array1 and array 2
    demo.displayArray(array1);
    demo.displayArray(array2);

    }

    void displayArray(int array[]){
        for(int i=0;i<array.length;i++){
            int iterated= array[i];
            System.out.println(iterated);
        }
    }



}
