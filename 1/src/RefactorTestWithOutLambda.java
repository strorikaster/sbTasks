//package any_classes;

class RefactorTest implements RefCreator {

    static String str = "do some usual";


    public void someMethod() {
        print(str, 1);
    }

    public void someElseMethod() {
        print(str, 2);
    }

    @Override
    public String print(String s, int num) {

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println(s);
                    break;
                case 1, 3:
                    System.out.println(s + i);
                    break;
                case 2:
                    if (num == 1) {
                        RefCreator.printOperativeRef();
                    } else {
                        RefCreator.printHistoricalRef();
                    }
                    break;
                case 4:
                    System.out.println(s + i + "\n");
                    break;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        RefactorTest refactorTest = new RefactorTest();
        refactorTest.someMethod();
        refactorTest.someElseMethod();

    }

}

/*static class*/
interface RefCreator {
    static void printOperativeRef() {
        System.out.println("operative ref");
    }

    static void printHistoricalRef() {
        System.out.println("historical ref");
    }

    String print(String str, int num);
}
