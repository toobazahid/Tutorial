class User {

//Constructor
User(Double startingMoney, String fName, String lName, String userName, String passWord) {
this.startingMoney=startingMoney;
this.fName=fName;
this.lName=lName; 
this.userName=userName;
this.passWord=passWord;
}
double startingMoney;
String fName;
String lName; 
String userName;
String passWord;
}


User john = new User(..Values.); 
User betty= new User(..Values.); 

john.getLName();  
betty.setPassword("pass");


in java you cant create a runtime variable; better do this way
whenever user is arrived; use a Map
Map.add("userName", new User(...Values..)); //userName as key
then get that object like Map.get("userName")