public class GitHubPractice {
    public static void main(String[] args) {

        String str="hannah";
        String newString="";
        for (int i =str.length()-1; i>=0; i--) {
            newString+=str.charAt(i);
        }




        if (str.equals(newString)) {
            System.out.println("str is a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }




    }
}
