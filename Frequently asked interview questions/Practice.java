class Practice{

    static boolean isPallindrome(String str){
        String rev = " ";
        boolean ans = false;

        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            ans = true;
        }
        return ans; 
    }
    public static void main(String[] args){

        // String string = "java";
        // System.out.println(Practice.isPallindrome(string));

        String a1 = new String("Hello");
        String a2 = new String("Hello");
        if(a1 == a2){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }


    }
}