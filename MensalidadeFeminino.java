public class MensalidadeFeminino {
    private static double mensalidade;

    public static double CalculoMensalidadeFeminino(int idade, String sexo) {
        if(sexo.equalsIgnoreCase("F")){
            if(idade<=18){
                setMensalidade(60.0);
            } else if (idade <= 25) {
                setMensalidade(90.0);
            } else if (idade <= 40) {
                setMensalidade(85.0);
            } else if (idade <= 50) {
                setMensalidade(65.0);
            } else {
                setMensalidade(60.0);
            }
        } else {
            System.out.println("Sexo inválido.");
            setMensalidade(0.0);
        }
        return getMensalidade();
        }
            public static void setMensalidade(double mensalidade) {
            MensalidadeFeminino.mensalidade = mensalidade;
            }
            public static double getMensalidade() {
                return mensalidade;
            }
        
}
            
            
            
        
        
    
