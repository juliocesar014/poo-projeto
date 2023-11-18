class Gerente extends Funcionario {
    private double bonus;

    
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    
    @Override
    public double calcularSalarioFinal() {
        
        return super.calcularSalarioFinal() + bonus;
    }

    
    public String getNome() {
        return super.getNome();
    }

    
    public double getBonus() {
        return bonus;
    }
}
