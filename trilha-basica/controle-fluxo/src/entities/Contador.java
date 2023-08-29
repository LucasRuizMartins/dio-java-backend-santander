package entities;

import exceptions.ParametrosInvalidosException;

public class Contador {

    private Integer numberOne;
    private Integer numberTwo;

    public Contador(Integer numberOne, Integer numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void countValues() throws ParametrosInvalidosException {
        int cont = numberOne - numberTwo;

        if (numberOne < numberTwo) {
            throw new ParametrosInvalidosException("Parâmetros inválidos.");
        }
        for (int i = 1; i <= cont; i++) {
            System.out.println(i);
        }
    }
}