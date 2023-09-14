public class Question {

    public String firstRepeatingCharacter(String str){
        char foundChar ='' ;
        for(int i=0 ;i<=str.length();i++){
            for(int j=str.length()-1;i>0;i--){
                if (str.charAt(i) == str.charAt(j)){
                    foundString = str.charAt(i);
                    break;
                }
            }
        }
        return foundString;
    }
    public static void main(String[] args){
        String  str = "missipsmgpth";
        Question question = new Question();
        // question.firstRepeatingCharacter(hello)
       
    }
}




inputArray = [
  "1233454356\tGET /index.html\t10.10.10.1",
  "1233454356\tGET /index.html\t10.10.10.1",
  "1233454356\tGET /index.html\t10.10.10.1",
  "1233454323\tGET /index.htm\t10.13.10.1",
  "1233454356\tGET /find.html\t10.14.10.1",
  "1232343356\tGET /index.html\t10.14.10.1",
  "1233454356\tGET /index.html\t10.14.10.1",
  "1233654906\tGET /index.html\t123.14.10.1",
  "1233454316\tGET /index.html\t10.14.10.1",
  "1233887346\tGET /index.html\t10.14.10.1",
  "1233454356\tGET /list.html\t10.14
inputArray = [
  "1233454356\tGET /index.html\t10.10.10.1",
  "1233454356\tGET /index.html\t10.10.10.1",
  "1233454356\tGET /index.html\t10.10.10.1",
  "1233454323\tGET /index.htm\t10.13.10.1",
  "1233454356\tGET /find.html\t10.14.10.1",
  "1232343356\tGET /index.html\t10.14.10.1",
  "1233454356\tGET /index.html\t10.14.10.1",
  "1233654906\tGET /index.html\t123.14.10.1",
  "1233454316\tGET /index.html\t10.14.10.1",
  "1233887346\tGET /index.html\t10.14.10.1"
]
Ajay Malla12:33 PM
OUTPUT = [10.10.10.1, 10.10.10.1]
Ajay Malla12:52 PM
missipsmgpth
Ajay Malla12:55 PM
+----+---------+
| Id | Email |
+----+---------+
| 1 | a@b.com |
| 2 | c@d.com |
| 3 | a@b.com |