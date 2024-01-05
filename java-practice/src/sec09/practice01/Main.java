package sec09.practice01;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(){
            @Override
            public void print(){
                System.out.println("람다식이 없을 때 방식");
            }
        };

        //람다식
        Printer printer2 = ()->{
            System.out.println("인자도 반환값도 없는 람다식");
        };

        Printer printer3 = () -> System.out.println("반환값 없을 시 {} 생략가능");

        Printer printer4 = () -> {
            System.out.println("코드가 여러 줄일 때는");
            System.out.println("{} 필요");
        };

        for (Printer p : new Printer[]{printer,printer2,printer3,printer4}){
            p.print();
        }

        Returner returner = ()->{return 1;};
        Returner returner1 = ()->"반환코드만 있을 시 {}와 return 생략가능";
        Object returnObj = returner.returnObj();
        Object returnObj1 = returner1.returnObj();

        SingleParam singleParam = (i) -> {return i*i;};
        SingleParam singleParam1 = (i) ->  i*i;
        SingleParam singleParam2 = i -> i*i*i;

        int func = singleParam1.func(3);
        int func1 = singleParam2.func(3);

        DoubleParam add = (a,b)->a+b;
        DoubleParam multiAndPrint = (a,b) -> {
            int result = a*b;
            System.out.printf("%d * %d = %d%n",a,b,result);
            return result;
        };

        int added = add.func(2,3);
        multiAndPrint.func(2, 3);

    }

}




