package singles;

public class Fila {
	   private static Fila instanciaUnica;
	   
	    private Fila() {
	    }
	 
	    public static Fila getInstancia() {
	        if (instanciaUnica == null) {
	            instanciaUnica = new Fila();
	        }
	        return instanciaUnica;
	    }
	 
	    public void imprimeDocumento() {
	        System.out.println("Documento impresso.");
	    }
	 
	    public void removeDocumento() {
	        System.out.println("Documento removido.");
	    }
	 
	    public void removeTodosDocumentos() {
	        System.out.println("Todos os documentos foram removidos.");
	    }
}
