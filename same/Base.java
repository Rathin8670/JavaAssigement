package same;

public class Base {
    private String privateMember = "Private Member";
    String defaultMember = "Default Member"; // default access
    protected String protectedMember = "Protected Member";
    public String publicMember = "Public Member";

    public void displayMembers() {
        System.out.println("Inside BaseClass:");
        System.out.println("Private Member: " + privateMember);
        System.out.println("Default Member: " + defaultMember);
        System.out.println("Protected Member: " + protectedMember);
        System.out.println("Public Member: " + publicMember);
    }
}

class SamePackage {
    public static void main(String[]args){
        Base base = new Base();
        System.out.println("Inside SamePackage:");
        //System.out.println("Private Member: " + base.privateMember); // Not
        // accessible
        System.out.println("Default Member: " + base.defaultMember); // Accessible
        System.out.println("Protected Member: " + base.protectedMember); // Accessible
        System.out.println("Public Member: " + base.publicMember); // Accessible
    }
}
