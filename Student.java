class Student extends Person
{
  String courseTitle,enrollment,id;
  Student(String course,String enroll,String id,String name,String fatherName,String address)
  {
    super(name,fatherName,address);
    courseTitle=course;
    enrollment=enroll;
    this.id=id;
  }
  public void showInfor()
  {
     System.out.println("The coursetitle of student is:"+courseTitle);
    System.out.println("The enrollment  of student is:"+enrollment);
    System.out.println("The id of student is:"+id);
  }
}