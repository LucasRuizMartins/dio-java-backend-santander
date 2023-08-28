package entities;

public class ContaBanco
 {

    private Integer number; 
    private String agency; 
    private String clientName; 
    private Double balance;
    
    public ContaBanco(Integer number, String agency, String clientName, Double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }



    
}
