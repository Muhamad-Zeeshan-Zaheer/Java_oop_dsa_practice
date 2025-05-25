public class age{
  public int pupAge() {
      int age;
      age=0;
      age = age + 7;
      System.out.println("Puppy age is : " + age);
      return age;
  }
  public static void main(String[] args)
  {
    int b;
    age a=new age();
    b=a.pupAge();
    System.out.println(b);


  }
}
