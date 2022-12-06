package app;

public class Zodiac {
    public static final Zodiac ARIES = new Zodiac(0);
    public static final Zodiac TAURUS = new Zodiac(1);
    public static final Zodiac GEMINI = new Zodiac(2);
    public static final Zodiac CANCER = new Zodiac(3);
    public static final Zodiac LEO = new Zodiac(4);
    public static final Zodiac VIRGO = new Zodiac(5);
    public static final Zodiac LIBRA = new Zodiac(6);
    public static final Zodiac SCORPIUS = new Zodiac(7);
    public static final Zodiac SAGITTARIUS = new Zodiac(8);
    public static final Zodiac CAPRICORNUS = new Zodiac(9);
    public static final Zodiac AQUARIUS = new Zodiac(10);
    public static final Zodiac PISCES = new Zodiac(11);
    private static final Zodiac[] array = {};
    private final int value;
    private Zodiac (int value)
    {
        this.value = value;
    }
    public int ordinal()
    {
        return this.value;
    }
    public static Zodiac[] values()
    {
        return array;
    }

    public int getvalue() {
        return this.value;
    }
}
