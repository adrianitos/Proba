
public class Strings {

	public static void main(String[] args) {
		
		String hola = "Hola, ";
		String mundo = "string";

		String holamundo = hola + mundo;
		
		StringBuffer holamundoBuffer = new StringBuffer();
		holamundoBuffer.append("Hola i adeu Andreu, ");
		holamundoBuffer.append("buffer");

		String holamundoBuf = holamundoBuffer.toString();

		StringBuilder holamundoBuilder = new StringBuilder();
		holamundoBuilder.append("Hola, ");
		holamundoBuilder.append("builder");

		String holamundoBui = holamundoBuilder.toString();
		
		System.out.println(holamundo);
		System.out.println(holamundoBuf);
		System.out.println(holamundoBui);
		
		StringBuffer sbuffer = new StringBuffer();
        long inicio = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            sbuffer.append("zim");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuffer: " + (fin-inicio));

        StringBuilder sbuilder = new StringBuilder();
        inicio = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            sbuilder.append("zim");
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuilder: " + (fin-inicio));
	}

}
