package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtill utils = new DecoUtill();
        String deco = utils.deco(s);

        System.out.println("Befor : " + s);
        System.out.println("After : " + deco);

    }
}
