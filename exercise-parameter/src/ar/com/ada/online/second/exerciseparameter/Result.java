package ar.com.ada.online.second.exerciseparameter;

public class Result {
    //ATRIBUTOS
    private Integer resultSum;
    private Integer resultSubtraction;
    private Integer multiplication;
    private Integer division;


    //COSNTRUCTOR VACIO
    public Result() {
    }

    //getters and setters

    public Integer getResultSum() {
        return this.resultSum;
    }

    public void setResultSum(Integer resultSum) {
        this.resultSum = resultSum;
    }

    public Integer getResultSubtraction() {
        return this.resultSubtraction;
    }

    public void setResultSubtraction(Integer resultSubtraction) {
        this.resultSubtraction = resultSubtraction;
    }

    public Integer getMultiplication() {
        return this.multiplication;
    }

    public void setMultiplication(Integer multiplication) {
        this.multiplication = multiplication;
    }

    public Integer getDivision() {
        return this.division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }
}
