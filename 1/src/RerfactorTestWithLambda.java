
    //package any_classes;

    class RefactorTestWithLambda  {

        String str = "do some usual";

       RefCreatorWithLambda ref = (str, num) -> {

            for (int i = 0; i < 5; i++) {
                switch (i) {
                    case 0:
                        System.out.println(str);
                        break;
                    case 1, 3:
                        System.out.println(str + i);
                        break;
                    case 2:
                        if (num == 1) {
                            RefCreatorWithLambda.printOperativeRef();
                        } else {
                            RefCreatorWithLambda.printHistoricalRef();
                        }
                        break;
                    case 4:
                        System.out.println(str + i + "\n");
                        break;
                }
            }

            return "";
        };

        public void someMethod() {
            ref.print(str, 1);
        }

        public void someElseMethod() {
            ref.print(str, 2);
        }

        public static void main(String[] args) {
            RefactorTestWithLambda refactorTestWithLambda = new RefactorTestWithLambda();
            refactorTestWithLambda.someMethod();
            refactorTestWithLambda.someElseMethod();

        }

    }

    /*static class*/
    @FunctionalInterface
    interface RefCreatorWithLambda {
        static void printOperativeRef() {
            System.out.println("operative ref");
        }

        static void printHistoricalRef() {
            System.out.println("historical ref");
        }

        String print(String str, int num);
    }


