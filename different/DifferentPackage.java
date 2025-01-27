package different;

import same.Base;

public class DifferentPackage extends Base {
    public static void main(String[] args) {
        Base base = new Base();
        System.out.println("Inside DifferentPackageClass (non-subclass):");
        
        // accessible directly
        System.out.println("Public Member: " + base.publicMember); // Accessible

        DifferentPackage obj = new DifferentPackage();
        System.out.println("Protected Member: " + obj.protectedMember); // Not accessible directly

    }
}