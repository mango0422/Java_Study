package ch09.sec02.exam04;

public class Annonymous {
    private int field;

    public void method(final int arg1, int arg2){
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        //arg1 = 20;
        //arg2 = 20;

        //var1 = 30;
        //var2 = 30;

        Calculatable calc = new Calculatable(){
            @Override
            public int sum(){
                int result = field + arg1 + var1 + arg2 + var2;
                return result;
            }
        };

        System.out.println(calc.sum());
    }
}
