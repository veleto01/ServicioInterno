package com.example.demo;

public class email {
	
		private String destino;
	    private String origen;
	    private String texto;
	    private String asunto;

	    public email(String destino1, String origen1, String texto1, String asunto1) {
	    	destino = destino1;
	    	origen = origen1;
	    	texto = texto1;
	    	asunto = asunto1;
	    	
	    }
	    
	    public email(String destino1, String origen1, String texto1) {
	    	destino = destino1;
	    	origen = origen1;
	    	texto = texto1;
	    }
	    

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public String getOrigen() {
			return origen;
		}

		public void setOrigen(String origen) {
			this.origen = origen;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

		public String getAsunto() {
			return asunto;
		}

		public void setAsunto(String asunto) {
			this.asunto = asunto;
		}


	    
}
