class Caixa extends Funcionario {
    private double horasExtras;

    
    public Caixa(String nome, double salario, double horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }

   
    @Override
    public double calcularSalarioFinal() {
        
        return super.calcularSalarioFinal() + horasExtras * 10; 
    }

    
    public double getHorasExtras() {
        return horasExtras;
    }
}
