package CreationalPatterns.PrototypePattern.Vehicles;

public class Main {

    public static void main(String[] args){

        Person saliha = new Person();
        saliha.setName("Saliha");
        Person saad = new Person();
        saad.setName("Saad");


        Vehicle chevrolet = new Vehicle();
        chevrolet.setBrand(Brand.Chevrolet);
        chevrolet.setOwner(saliha);

        Vehicle chevroletCopy = chevrolet.clone();
        chevroletCopy.getOwner().setName("Saliha 2");

        Vehicle cadillac = chevrolet.clone();

        cadillac.setOwner(saad);
        cadillac.setBrand(Brand.Cadillac);

        System.out.println(chevrolet);
        System.out.println(chevroletCopy);
        System.out.println(cadillac);

    }

}
