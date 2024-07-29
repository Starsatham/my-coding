 ublic class findTheLetterAndNumber{
public static void main(String args[])
{
  String a;
        Scanner s=new Scanner(System.in);
         System.out.println("enter the sentence: ");
         a=s.nextLine();
         count(a);
    }
    public static void count( String a)
    {
      char[] c=a.toCharArray();
      int letter=0;
      int space=0;
      int num=0;
      int other=0;
      for(int i=0;i<a.length();i++)
      {
         if(Character.isLetter(c[i])){
            letter++;
         }
         else if(Character.isDigit(c[i])){
            num++;
         }
         else if(Character.isSpaceChar(c[i])){
            space++;
         }
         else{
            other++;
         }
      }
      System.out.println("letters is"+letter);
      System.out.println("digits is"+num);
      System.out.println("space is"+space);
      System.out.println("other is"+other);
}
}