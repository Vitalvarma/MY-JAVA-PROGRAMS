public class Student{
    String firstName;
    String lastName;
    int Regdid;
    float Score;
    public void setfirstname(String sf){
        firstName = sf;
    }
    public void setlastname(String ln){
        lastName = ln;
    }
    public void setregdid(int rg){
        Regdid = rg;
    }
    public void setscore(float sc){
        Score = sc;
    }
    public String getfirstname(){
        return firstName;
    }
    public String getlastname(){
        return lastName;
    }
    public int getregdid(){
        return Regdid;
    }
    public float getscore(){
        return Score;
    }
}

class SetGet{
    public static void main(String args[]){
        String firstname,lastname;
        int regdid;
        float score;
        Student s1 = new Student();
        s1.setfirstname("hari");
        s1.setlastname("yadav");
        s1.setregdid(550);
        s1.setscore(9);
        firstname = s1.getfirstname();
        lastname = s1.getlastname();
        regdid = s1.getregdid();
        score = s1.getscore();
        System.out.println("Hello, I Am " + firstname + " " + lastname + ".My Regdid is " + regdid + ",My Score is " + score); 
    }
}