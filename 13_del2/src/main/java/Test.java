    public class Test {
        public static void main(String[] args) {
            int Terning1 = 0;
            int Terning2 = 0;
            int Terning3 = 0;
            int Terning4 = 0;
            int Terning5 = 0;
            int Terning6 = 0;
            for (int i = 0; i < 3000; i++) {
                int Die1 = (int) (Math.random() * 6) + 1;
                if (Die1 == 1) {
                    Terning1++;
                }
                if (Die1 == 2) {
                    Terning2++;
                }
                if (Die1 == 3) {
                    Terning3++;
                }
                if (Die1 == 4) {
                    Terning4++;
                }
                if (Die1 == 5) {
                    Terning5++;
                }
                if (Die1 == 6) {
                    Terning6++;
                }
            }
            System.out.println(Terning1);
            System.out.println(Terning2);
            System.out.println(Terning3);
            System.out.println(Terning4);
            System.out.println(Terning5);
            System.out.println(Terning6);
            System.out.println();
            System.out.println(Terning1 + Terning2 + Terning3 + Terning4 + Terning5 + Terning6);
        }
    }
