package atu.ie;

public class Passenger {
    private String title;
    private String Fname;
    private String Lname;

    public Passenger(String title, String Fname, String Lname) {
        if(!isValidTitle(title)){
            throw new IllegalArgumentException("Invalid title");
    }
    if(Fname==null|| Fname.length()<3){
        throw new IllegalArgumentException("Invalid Fname");
    }
    if (Lname==null||Lname.length()<3){
        throw new IllegalArgumentException("Invalid Lname");
    }
    this.title = title;
    this.Fname = Fname;
    this.Lname = Lname;
}
private boolean isValidTitle(String title){
    return title.equals("mr")||title.equals("ms")||title.equals("mrs");
}
public String getTitle(){
    return title;
        }
        public String getFirstname(){
    return Fname;
    }
    public String getLastname(){
        return Lname;
    }
}
