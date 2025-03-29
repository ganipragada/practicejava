package basicPrograms;

class OuterClass {
    void outerMethod() {
        class Local {
            void innerMethod() {
                System.out.println("Inner method called!");
            }
        }
        Local local = new Local();
        local.innerMethod();
    }

    public static void main(String[] args) {
        new OuterClass().outerMethod();
    }
}

