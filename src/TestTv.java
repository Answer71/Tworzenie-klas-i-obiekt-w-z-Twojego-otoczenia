class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.size = 52;
        tv1.color = "black";
        tv1.smart = true;

        TV tv2 = new TV();

        tv2.size = 42;
        tv2.color = "silver";
        tv2.smart = true;

        System.out.println("Telewizor 1:" + tv1.size + "inch " + "color: " + tv1.color + " SMART: " + tv1.smart);
        System.out.println("Telewizor 2:" + tv2.size + "inch " + "color: " + tv2.color + " SMART: " + tv2.smart);
    }
}