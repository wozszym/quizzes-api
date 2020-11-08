class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {

        double res = 0.0;

        try {
            res = Double.parseDouble(input);
        } catch (Exception e) {
            res = 0.0;
        }

        return res;
    }
}