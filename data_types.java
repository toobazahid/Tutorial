class Person
{
  String name,fatherName,address;
  Person(String n,String fN,String address)
  {
   name=n;
   fatherName=fN;
   this.address=address;
  }
  public void showInfor()
  {
    System.out.println("The name of person is:"+name);
    System.out.println("The father name of person is:"+fatherName);
    System.out.println("The address of person is:"+address);
  }
  
}