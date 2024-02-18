public class Main {
    public static void main(String[] args) {
        Prodejce prodejce1 = new Prodejce("Jan", "Novák", LocalDate.of(1980, 1, 1),
                5, new BigDecimal("10.5"), "Praha", "ABC123", new BigDecimal("8.5"), "192.168.1.1");

        Prodejce prodejce2 = new Prodejce("Eva", "Veselá", LocalDate.of(1992, 5, 15),
                8, new BigDecimal("8.2"), "Brno", "XYZ456", new BigDecimal("7.2"), "192.168.1.2");


        Prodejce[] prodejci = {prodejce1, prodejce2};
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu: " + vypocetPrumeru(prodejci));
    }

    private static BigDecimal vypocetPrumeru(Prodejce[] prodejci) {
        if (prodejci.length == 0) {
            return BigDecimal.ZERO;
        }

        BigDecimal soucetMrkve = BigDecimal.ZERO;
        int pocetSmluv = 0;

        for (Prodejce prodejce : prodejci) {
            soucetMrkve = soucetMrkve.add(prodejce.getMnozstviProdaneMrkve());
            pocetSmluv += prodejce.getPocetSmluv();
        }

        return soucetMrkve.divide(BigDecimal.valueOf(pocetSmluv), 2, BigDecimal.ROUND_HALF_UP);
    }
}

