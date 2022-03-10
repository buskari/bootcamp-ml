public class Main {
    public static void main(String[] args) {
        String[] cities = {
                "London",
                "Madrid",
                "New York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };

        int[][] temperatures = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        String lowTempCity = "";
        String highTempCity = "";
        int lowTempCityIndex = 0;
        int highTempCityIndex = 0;
        int lowestTemp = temperatures[0][0];
        int highestTemp = temperatures[0][1];

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                if (temperatures[i][j] < lowestTemp) {
                    lowestTemp = temperatures[i][j];
                    lowTempCityIndex = i;
                }

                if (temperatures[i][j] > highestTemp) {
                    highestTemp = temperatures[i][j];
                    highTempCityIndex = i;
                }
            }
        }

        lowTempCity = cities[lowTempCityIndex];
        highTempCity = cities[highTempCityIndex];

        System.out.println("A temperatura mais baixa foi em " + lowTempCity + " com " + lowestTemp + "º C.");
        System.out.println("A temperatura mais alta foi em " + highTempCity + " com " + highestTemp + "º C.");
    }
}
