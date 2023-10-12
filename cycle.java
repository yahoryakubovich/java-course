public class cycle {
    //    public static void main(String[] args) {
//        // for
//        for (float i = 100; i > 10; i--) {
//            System.out.println("Element: " + i);
//        }
//    }
//    public static void main(String[] args) {
//        // while
//        int i = 0;
//        while (i<10) {
//            System.out.println("Element: " + i);
//            i++;
//        }
//    }
//}
//    public static void main(String[] args) {
//        // do while
//        int i = 0;
//        do {
//            System.out.println("Element: " + i);
//            i++;
//        } while (i < 100);
//    }
//}

    public static void main(String[] args) {
        for (int i = 5; i < 25; i += 2) {
            if (i % 3 == 0)
                continue;
            if (i >= 17)
                break;
            System.out.println("Element: " + i);
        }
    }
}