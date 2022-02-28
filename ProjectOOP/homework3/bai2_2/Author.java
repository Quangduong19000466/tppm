package homework3.bai2_2;

public class Author {
    private String name;
    private  String email;
    private char gender;


    public Author(){

    }
    public Author(String name,String email,char gender){
        this.email=email;
        this.name= name;
        this.gender=gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "["+this.name+","+this.email+","+this.gender+"]";
    }
}
