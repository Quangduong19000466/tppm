package homework3.bai2_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck=new Author("tan a teck","ahteck@gmail.com",'m');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@gmail.com");
        System.out.println("name is"+ahTeck.getName());
        System.out.println("email is:" +ahTeck.getEmail());
        System.out.println("gender ís:"+ahTeck.getGender());

    }
}
