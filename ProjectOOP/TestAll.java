import homework1.*;
import homework2.*;
import homework3.*;
import homework4.*;
import homework5.*;
import homework6.*;
import lab1.*;
import lab2.*;

import java.util.Scanner;

public class TestAll {
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: homework1 ");
        System.out.println("2: homework2 ");
        System.out.println("3: homework3 ");
        System.out.println("4: homework4 ");
        System.out.println("5: homework5 ");
        System.out.println("6: homework6 ");
        System.out.println("7: lap1 ");
        System.out.println("8: lap2 ");
        System.out.println("9: thoat chuong trinh");
        System.out.print(" moi ban chon homework hoac lab : ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("1:bin2dec");
                System.out.println("2:BoxPattern");
                System.out.println("3:CheckerPattern");
                System.out.println("4:CheckHexStr");
                System.out.println("5:CountVowelsDigits");
                System.out.println("6:ExchangeCipher");
                System.out.println("7:Hex2Dec");
                System.out.println("8:HillPatternX");
                System.out.println("9:Oct2dec");
                System.out.println("10:PhonkeyPad");
                System.out.println("11:ReverseString");
                System.out.println("12:SquarePattern");
                System.out.println("13:SquareParttern1");
                System.out.println("14:TimeTable");
                System.out.println("15:TrianggularPatternX");
                System.out.println("16:thoat homework1");
                System.out.print("moi ban chon:");
                int s = sc.nextInt();
                switch (s) {
                    case 1:
                        Bin2dec.test();
                        break;
                    case 2:
                        BoxPattern.test();
                        break;
                    case 3:
                        CheckerPattern.test();
                        break;
                    case 4:
                        CheckHexStr.test();
                        break;
                    case 5:
                        CountVowelsDigits.test();
                        break;
                    case 6:
                        ExchangeCipher.test();
                        break;
                    case 7:
                        Hex2Dec.test();
                        break;
                    case 8:
                        HillPatternX.test();
                        break;
                    case 9:
                        Oct2Dec.test();
                        break;
                    case 10:
                        PhoneKeyPad.test();
                        break;
                    case 11:
                        ReverseString.test();
                        break;
                    case 12:
                        SquarePattern.test();
                        break;
                    case 13:
                        SquarePattern1.test();
                        break;
                    case 14:
                        TimeTable.test();
                        break;
                    case 15:
                        TriangularPatternX.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();

                }
                break;
            case 2:
                System.out.println("1: bai 2_3");
                System.out.println("2: BubbleSort");
                System.out.println("3: ExponemtialSeries");
                System.out.println("4: Feactorialdequy2");
                System.out.println("5: FactorialInt");
                System.out.println("6: FactorialLong");
                System.out.println("7: Fibonacci2_2");
                System.out.println("8: FibonacciInt");
                System.out.println("9: GCD2_4");
                System.out.println("10: GreatestCommonDivisor");
                System.out.println("11: InsertionSort");
                System.out.println("12: LinearSearch");
                System.out.println("13: Matrix ");
                System.out.println("14: NubmerGuess");
                System.out.println("15: PefectNumberList");
                System.out.println("16: PefectPrimerFactorList");
                System.out.println("17: SelectionSort");
                System.out.println("18: TribonacciInt");
                System.out.println("19: TrigonometricSeries");
                int b = sc.nextInt();
                switch (b) {
                    case 1:
                        Bai2_3.test();
                        break;
                    case 2:
                        BubbleSort.test();
                        break;
                    case 3:
                        ExponentialSeries.test();
                        break;
                    case 4:
                        Factorialdequy2.test();
                        break;
                    case 5:
                        FactorialInt.test();
                        ;
                        break;
                    case 6:
                        FactorialLong.test();
                        break;
                    case 7:
                        Fibonacci2_2.test();
                        break;
                    case 8:
                        FibonacciInt.test();
                        break;
                    case 9:
                        GCD2_4.test();
                        ;
                        break;
                    case 10:
                        GreatestCommonDivisor.test();
                        break;
                    case 11:
                        InsertionSort.test();
                        break;
                    case 12:
                        LinearSearch.test();
                        break;
                    case 13:
                        Matrix.test();
                        break;
                    case 14:
                        NumberGuess.test();
                        break;
                    case 15:
                        PerfectNumberList.test();
                        break;
                    case 16:
                        PerfectPrimeFactorList.test();
                        break;
                    case 17:
                        SelectionSort.test();
                        break;
                    case 18:
                        TrigonometricSeries.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();

                }
                break;
            case 3:
                for (int i = 1; i < 10; i++) {
                    System.out.println(i + ": bai1_" + i);
                }
                for (int i = 1; i <= 10; i++) {
                    if (i == 7 || i == 5) {
                        continue;
                    }
                    System.out.println((i + 9) + ": bai2_" + i);
                }
                int d = sc.nextInt();
                switch (d) {
                    case 1:
                        Test1_1.test();
                        break;
                    case 2:
                        Test1_2.test();
                        break;
                    case 3:
                        Test1_3.test();
                        break;
                    case 4:
                        Test1_4.test();
                        break;
                    case 5:
                        Test1_5.test();
                        break;
                    case 6:
                        Test1_6.test();
                        break;
                    case 7:
                        Test1_7.test();
                        break;
                    case 8:
                        Test1_8.test();
                        break;
                    case 9:
                        Test1_9.test();
                        break;
                    case 10:
                        Test2_1.test();
                        break;
                    case 11:
                        Test2_2.test();
                        break;
                    case 12:
                        Test2_3.test();
                        break;
                    case 13:
                        Test2_4.test();
                        break;
                    case 15:
                        Test2_6.test();
                        break;
                    case 17:
                        Test2_8.test();
                        break;
                    case 18:
                        Test2_9.test();
                        break;
                    case 19:
                        Test2_10.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();
                }
                break;
            case 4:
                for (int i = 1; i < 8; i++) {
                    System.out.println(i + ": bai 1_" + i);
                }
                System.out.print("chon bai tap : ");
                int c = sc.nextInt();
                switch (c) {
                    case 1:
                        TestComplex.test();
                        break;
                    case 2:
                        TestMyPolynomial.test();
                        break;
                    case 3:
                        TestBigInteger.test();
                        break;
                    case 4:
                        TestMyTime.test();
                        break;
                    case 5:
                        TestMyDate.test();
                        break;
                    case 6:
                        TestContainer.test();
                        break;
                    case 7:
                        TestPlayer.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();
                }
                break;
            case 5:
                for (int i = 1; i < 6; i++) {
                    System.out.println(i + ": bai 1_" + i);
                }
                System.out.println("6 : bai 2_1");
                System.out.println("7 : bai 2_2");
                System.out.println("chon bai tap:");
                int e = sc.nextInt();
                switch (e) {
                    case 1:
                        TestCylinder.test();
                        break;
                    case 2:
                        Test51_2.test();
                        break;
                    case 3:
                        Test51_3.test();
                        break;
                    case 4:
                        Test51_4.test();
                        break;
                    case 5:
                        Test51_5.test();
                        break;
                    case 6:
                        TestLineSub.test();
                        break;
                    case 7:
                        Test52_2.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();

                }
                break;
            case 6:
                for (int i = 1; i < 9; i++) {
                    System.out.println(i + " : bai 1_" + i);
                }
                System.out.print("chon bai tap :");
                int g = sc.nextInt();
                switch (g) {
                    case 1:
                        Test6_1.test();
                        break;
                    case 2:
                        Test6_2.test();
                        break;
                    case 3:
                        Test6_3.test();
                        break;
                    case 4:
                        Test6_4.test();
                        break;
                    case 5:
                        Test6_5.test();
                        break;
                    case 6:
                        Test6_6.test();
                        break;
                    case 7:
                        TestAnimal.test();
                        break;
                    case 8:
                        Test6_8.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();
                }
                break;
            case 7:
                System.out.println("1: CheckOddEven");
                System.out.println("2: ChecPassFail");
                System.out.println("3: CircleComputation");
                System.out.println("4: ComputePI");
                System.out.println("5: CylinderComputation");
                System.out.println("6: ExtractDigits");
                System.out.println("7: Fibonacci");
                System.out.println("8: HarmonicSum");
                System.out.println("9: PensionContributionCalculator");
                System.out.println("10: PensionContributionCalculatorWithSentinel ");
                System.out.println("11: PrintDayInWorld");
                System.out.println("12: PrintNumberInWord");
                System.out.println("13: ReverseInt");
                System.out.println("14: SphereComputation");
                System.out.println("15: SumAvaerageRunnuningInt");
                System.out.println("16: SumProductMinMax3");
                System.out.println("17: SumProductMinMax5");
                System.out.println("18: Triboacci");
                System.out.print("chon bai tap:");
                int h = sc.nextInt();
                switch (h) {
                    case 1:
                        CheckOddEven.test();
                        break;
                    case 2:
                        CheckPassFail.test();
                        break;
                    case 3:
                        CircleComputation.test();
                        break;
                    case 4:
                        ComputePI.test();
                        break;
                    case 5:
                        CylinderComputation.test();
                        break;
                    case 6:
                        ExtractDigits.test();
                        break;
                    case 7:
                        Fibonacci.test();
                        break;
                    case 8:
                        HarmonicSum.test();
                        break;
                    case 9:
                        PensionContributionCalculator.test();
                        break;
                    case 10:
                        PensionContributionCalculatorWithSentinel.test();
                        break;
                    case 11:
                        PrintDayInWord.test();
                        break;
                    case 12:
                        PrintNumberInWord.test();
                        break;
                    case 13:
                        ReverseInt.test();
                        break;
                    case 14:
                        SphereComputation.test();
                        break;
                    case 15:
                        SumAverageRunningInt.test();
                        break;
                    case 16:
                        SumProductMinMax3.test();
                        break;
                    case 17:
                        SumProductMinMax5.test();
                        break;
                    case 18:
                        Tribonacci.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();
                }
                break;
            case 8:
                System.out.println("1: ArrayReverse");
                System.out.println("2: ArrayToString");
                System.out.println("3: bai2_5");
                System.out.println("4: bai2_6");
                System.out.println("5: bai2_7");
                System.out.println("6: bai2_8");
                System.out.println("7: Dec2Hex");
                System.out.println("8: Exponent");
                System.out.println("9: GradesStatistics");
                System.out.println("10: GradesStatistic2_11");
                System.out.println("11: Hex2Bin");
                System.out.println("12: MagicSum");
                System.out.println("13: PrintAraay");
                System.out.println("14: PrintArray");
                System.out.println("15: PrintArrayInStars");
                System.out.println("16: SwapArray");
                System.out.print("chon bai tap:");
                int k = sc.nextInt();
                switch (k) {
                    case 1:
                        ArrayReverse.test();
                        break;
                    case 2:
                        ArrayToString.test();
                        break;
                    case 3:
                        bai2_5.test();
                        break;
                    case 4:
                        bai2_6.test();
                        break;
                    case 5:
                        bai2_7.test();
                        break;
                    case 6:
                        bai2_8.test();
                        break;
                    case 7:
                        Dec2Hex.test();
                        break;
                    case 8:
                        Exponent.test();
                        break;
                    case 9:
                        GradesStatistics.test();
                        break;
                    case 10:
                        GradesStatistics2_11.test();
                        break;
                    case 11:
                        Hex2Bin.test();
                        break;
                    case 12:
                        MagicSum.test();
                        break;
                    case 13:
                        PrintAraay.test();
                        break;
                    case 14:
                        PrintArray.test();
                        break;
                    case 15:
                        SwapArray.test();
                        break;
                    default:
                        System.out.println("moi ban chon lai :");
                        menu();
                }
                break;
            case 9:
                System.exit(0);
            default:
                System.out.println("moi ban chon lai :");
                menu();
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }


}
