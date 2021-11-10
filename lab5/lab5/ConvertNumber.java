import java.util.HashMap;
import java.util.Map;

public class ConvertNumber {
    private static final Map<Integer, String> singleDigits = new HashMap<Integer, String>();

    static {
        singleDigits.put(0, "không");
        singleDigits.put(1, "một");
        singleDigits.put(2, "hai");
        singleDigits.put(3, "ba");
        singleDigits.put(4, "bốn");
        singleDigits.put(5, "năm");
        singleDigits.put(6, "sáu");
        singleDigits.put(7, "bảy");
        singleDigits.put(8, "tám");
        singleDigits.put(9, "chín");
        singleDigits.put(10, "mười");
        singleDigits.put(11, "mười một");
        singleDigits.put(12, "mười hai");
        singleDigits.put(13, "mười ba");
        singleDigits.put(14, "mười bốn");
        singleDigits.put(15, "mười lăm");
        singleDigits.put(16, "mười sáu");
        singleDigits.put(17, "mười bảy");
        singleDigits.put(18, "mười tám");
        singleDigits.put(19, "mười chín");
    }
    private static final Map<Integer, String> multiDigits = new HashMap<Integer, String>();
    static {
        multiDigits.put(10, "mười");
        multiDigits.put(20, "hai mươi");
        multiDigits.put(30, "ba mươi");
        multiDigits.put(40, "bốn mươi");
        multiDigits.put(50, "năm mươi");
        multiDigits.put(60, "sáu mươi");
        multiDigits.put(70, "bảy mươi");
        multiDigits.put(80, "tám mươi");
        multiDigits.put(90, "chín mươi");
    }

    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final int HUNDRED = 100;
    private static final int TEN = 10;

    private static final String handleUnderOneThousand(int number) {
        StringBuilder builder = new StringBuilder();

        int x = number;
        int m = x / HUNDRED;
        int r = x % HUNDRED;
        if (m > 0) {

            builder.append(singleDigits.get(m)).append("-trăm");

            x = x % HUNDRED;
        }

        if (r > 0) {
            if (m > 0) {

                builder.append(" ");

            }

            if (x <= 19) {

                builder.append(singleDigits.get(x));

            } else {
                m = x / TEN;
                r = x % TEN;
                if (r == 0) {

                    builder.append(multiDigits.get(x));

                } else {
                    x = x - r;

                    builder.append(multiDigits.get(x)).append("-");

                    builder.append(singleDigits.get(r));

                }
            }
        }
        return builder.toString();
    }

    public static final String toVietNamese(int number) {
        int x = number;

        if (x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {

            if (x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
                throw new IllegalArgumentException(
                        "Number has to be <= Integer.MAX_VALUE and > Integer.MIN_VALUE. number=" + x);
        }
        StringBuilder builder = new StringBuilder();

        if (x == 0) {

            builder.append(singleDigits.get(x));

            return builder.toString();
        }
        boolean billion = false;
        boolean million = false;
        boolean thousand = false;

        if (x < 0) {

            builder.append(" negative ");
            // Make the number positive

            x = x * -1;

        }

        int m = x / BILLION;
        if (m > 0) {
            billion = true;

            builder.append(handleUnderOneThousand(m)).append("-tỷ");

            x = x % BILLION;

        }

        m = x / MILLION;
        if (m > 0) {
            if (billion) {
                builder.append(" ");
            }

            million = true;

            builder.append(handleUnderOneThousand(m)).append("-triệu");

            x = x % MILLION;

        }

        m = x / THOUSAND;
        if (m > 0) {

            if (billion || million) {
                builder.append(" ");

            }

            thousand = true;

            builder.append(handleUnderOneThousand(m)).append("−nghìn");

            x = x % THOUSAND;

        }

        if (billion || million || thousand && x != 0) {

            builder.append(" ");

        }

        builder.append(handleUnderOneThousand(x));

        return builder.toString();
    }
}