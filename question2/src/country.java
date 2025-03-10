public class country {
    private int N;
    private double rate;
    public country(int N , double rate){
        this.N = N;
        this.rate = rate;
    }
    public void next_year(){
        this.N = N + (int)(0.01*rate*N);
    }

    public int getN() {
        return N;
    }
}
