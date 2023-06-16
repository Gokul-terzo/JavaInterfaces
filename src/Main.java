public class Main {
    public static void main(String args[]){
        show1();
    }

    public static void show1(){   //Anonymous inner class to avoid use of separate class
        greet(new Printer() {
            @Override
            public void consolePrinter(String message,int num) {
                System.out.println(message+num);
            }
        });
    }
    public static void greet(Printer print){
        print.consolePrinter("Hello World",12);
    }
}
