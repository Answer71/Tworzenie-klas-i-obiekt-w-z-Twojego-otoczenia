class TestTV {
    public static void main(String[] args) {
        tv tv1 = new tv(52,"black", true);

        tv tv2 = new tv(42, "Silver", true);

        System.out.println("Telewizor 1:" + tv1.size + "inch " + "color: " + tv1.color + " SMART: " + tv1.smart);
        System.out.println("Telewizor 2:" + tv2.size + "inch " + "color: " + tv2.color + " SMART: " + tv2.smart);
    }
}