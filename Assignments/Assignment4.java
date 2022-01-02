package Assignments;

public class Assignment4 {

     public static void main(String[] args) {
        
        int [] arr = {3,2,1,7,8,6,5,4,9};
        sort(arr);
        for (int n:arr) {
            System.out.print(n+" ");
        }

    }
    static void sort(int [] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
}
