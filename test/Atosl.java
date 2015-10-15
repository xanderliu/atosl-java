public class Atosl {
native String[] symbolicate(String arch, String dSYM, String[] addresses, int addressLength);
static {
        // System.load("atosl_library_path");
        System.load("/Users/devholic/Desktop/git/honeyqa/atosl-java/test/libatosl.so");
}
static public void main(String argv[]) {
        String test1_Address[] = {"0xcf000","0x0017ddd5"};
        Atosl atosl = new Atosl();
        String[] r = atosl.symbolicate("armv7",
        "./res/MapOut.app.dSYM/Contents/Resources/DWARF/MapOut",
        test1_Address, test1_Address.length);
        System.out.println("return code :" + r[0]);
        System.out.println(r[1]);
}
}
