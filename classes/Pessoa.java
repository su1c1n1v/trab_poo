package poo;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    // Atributos
    private int id;
    private String primeiroNome;
    private String segundoNome;
    private String sexo;
    private String paisDeOrigem;
    private LocalDate dataNascimento;

    // Metodos

    // Constructorores

    public Pessoa(int id, String primeiroNome, String segundoNome, String sexo, String paisDeOrigem, int anoNascimento, int mesNascimento, int diaNascimento){
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.sexo = sexo;
        this.paisDeOrigem = paisDeOrigem;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
    }

    public Pessoa(int id, String primeiroNome, String segundoNome) {
        this(id, primeiroNome, segundoNome, "Nao Definido", "Nao definido", 0, 0, 0);
    }

    public int calcularIdade() {

        LocalDate dataDefault = LocalDate.of(0,0,0);
        if ((dataNascimento != dataDefault)) {
            return Period.between(dataNascimento, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }


    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Pessoa obj = (Pessoa) o;
            return (id == obj.id && primeiroNome == obj.primeiroNome && segundoNome == obj.segundoNome && sexo == obj.sexo && paisDeOrigem == obj.paisDeOrigem && dataNascimento == obj.dataNascimento);
        }
        return false;
    }

    @Override
    public Object clone() {
        Pessoa novaPessoa = new Pessoa(id, primeiroNome, segundoNome, sexo, paisDeOrigem, dataNascimento.getYear(), dataNascimento.getMonthValue(), dataNascimento.getDayOfMonth());
        return novaPessoa;
    }

    @Override
    public String toString() {
        return "Nome: " + primeiroNome + " " + segundoNome + "\nSexo: " + sexo + "\nPais de Origem: " + paisDeOrigem + "\nData de nascimento: " + dataNascimento;
    }


}
