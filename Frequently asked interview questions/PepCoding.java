import java.util.Scanner;

public class PepCoding {

    public static void main(String[] args) {
        //Initialized the scanner object 
        Scanner scanner = new Scanner(System.in);
       //Input from the user
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for(int i=0; i < arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        //to check weather a user input integer is present in the array and displaying the index of the integer in array.
        int data = scanner.nextInt();
        scanner.close();
        int index = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == data){
                index = i;
                break;
            }
        }
        System.out.print(index);
    }
    
}
