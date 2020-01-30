//Okoye-Nobert Chukwuebuka

class Main {
    public static void main(String[] args) {
        // Declaring the name of the person
        String personName = "Okoye-Nobert";

        // Declaring the height(in centimeters)  and weight (in kilogram) of the person
        double personHeight = 162.56;
        double personWeight = 67.3;

        //declaring and calculating the person's bmi
        double personBmi =(personWeight/personHeight/personHeight)*10000;
        // Printing out the person's name and BMI
        System.out.println("Hello" + " " + personName+".");
        System.out.println("From your " + "height(meters) and weight(kilograms), your BMI is" + " "
                + personBmi +"kg/m^2");

        //declaring the length and width of rectangle in centimeter of a rectangle
        int rectanglelength = 10;
        int rectanglewidth = 10;

        //declaring and calculating for the perimeter of the rectangle
        int rectangleperimeter = 2*(rectanglelength + rectanglewidth);
        System.out.println("   ");
        //printing out the perimeter of the rectangle
        System.out.println("The perimeter of the rectangle is"+ " "+ rectangleperimeter + "centimetres.");


        //declaring and calculating for the surface of the rectangle
        int rectanglesurface = rectanglelength*rectanglewidth;
        //printing out the surface area of the rectangle
        System.out.println("The surface area of the rectangle is"+ " "+ rectanglesurface + "centimetres.");


    }
}
