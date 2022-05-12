package tdd;

public  class Kata {

    public  int add (int i, int i1){
        return  i +i1;
    }

    public int subtract(int j, int i2) {
        int difference = 0;
        if (j>12) difference = j-12;
        if (12>j) difference = 12 -j ;
        return difference;

    }

    public int product (int k,int p) {
        return k*p;
    }

    public  int quotient(int n, int q) {
        int divident = 0 ;

        if  (q == 0) return divident ;
        divident = n/q;

        return divident;
    }


    public  int mult(int las ) {
        int answer = 0 ;
        if (las >= 1 && las <= 4 ) answer = las * 2000 ;

        if (las >=5 && las <= 9) answer = las * 1800 ;

        if (las >=10 && las <= 29) answer = las * 1600 ;

        if (las >=30 && las <= 49) answer = las * 1500 ;

        if (las >=50 && las <= 99) answer = las * 1300 ;

        if (las >=100 && las <= 199) answer = las * 1200 ;

        if (las >=200 && las <= 499) answer = las * 1100 ;

        if (las >=500)  answer = las * 1100 ;

        return answer;
    }





    public String SchoolResult(int score) {

        String grade = null ;
        {
            if (score <= 100 && score > 90)  grade = "A" ;

            if (score >= 80 && score < 90)  grade = "B" ;

            if (score >= 70 && score < 80)  grade = "C" ;

            if (score >= 60 && score < 70)  grade = "D" ;

            if (score <= 60) grade = "F" ;

            return  grade;
        }
    }


}





