import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Question 1
        System.out.println("Enter the first number ");
        int firstnumber = scanner.nextInt();
        System.out.println("Enter the second number ");
        int secondnumber = scanner.nextInt();
        int sum = firstnumber + secondnumber;
        int multi = firstnumber * secondnumber;
        int sub = firstnumber - secondnumber;
        int div = firstnumber / secondnumber;
        int rem = firstnumber % secondnumber;
        System.out.println(firstnumber + "+"+ secondnumber +"=" +sum);
        System.out.println(firstnumber + "*"+ secondnumber +"=" +multi);
        System.out.println(firstnumber + "-"+ secondnumber +"=" +sub);
        System.out.println(firstnumber + "/"+ secondnumber +"=" +div);
        System.out.println(firstnumber + "%"+ secondnumber +"=" +rem);

        System.out.println("---------------------------------------------------------------------------------");

        //Question 2
        System.out.println("Enter a number to show its multiplication table");
        int mulNumber = scanner.nextInt();
        for(int i=1 ; i <=10 ; i++){
            int mm = i * mulNumber;
            System.out.println( mulNumber +"x" +i +"=" +mm);
        }

        System.out.println("---------------------------------------------------------------------------------");

        //Question 3
        //area = pie * r ^2
        //perimeter pie * d , d=r*2
        System.out.println("Enter the radius");
        double rad = scanner.nextDouble();
        double dd = rad * rad;
        double d = rad *2;
        double carea = 3.14 * dd;
        double cperi = 3.14 *d;
        System.out.println("perimeter is =" +cperi);
        System.out.println("area is =" +carea);

        System.out.println("---------------------------------------------------------------------------------");

        //Question 4
        System.out.println("Enter the count of numbers ");
        int countNum =scanner.nextInt();
        int sumen =0;
        int ii =0;
        while (ii < countNum) {
            System.out.println("Enter an integer");
            int en = scanner.nextInt();
            sumen += en;
            ii++;
        }
        double avrg = (double)sumen / countNum;
        System.out.println("the avreg is " + avrg );

        System.out.println("---------------------------------------------------------------------------------");

        //Question 5
        System.out.println("Enter the first number");
        int fnum = scanner.nextInt();
        System.out.println("Enter the second number");
        int snum = scanner.nextInt();
        System.out.println("Enter the third number");
        int tnum = scanner.nextInt();
        int fsNum =fnum +snum;
        if(fsNum == tnum){
            System.out.println("the result is: true");
        }else{
            System.out.println("the result is: false");
        }

        System.out.println("---------------------------------------------------------------------------------");

        //Question 6
        System.out.println("Enter a String");
        String word = scanner.nextLine();
        String  reversword = "";
        for( int i = word.length()-1 ; i <= 0 ; i--){
            reversword += word.charAt(i);
        }
        System.out.println(reversword);

        System.out.println("---------------------------------------------------------------------------------");

        //Question 7
        System.out.println("Enter a number ");
        int number =scanner.nextInt();
        if(number % 2 ==0){
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");
        }

        System.out.println("---------------------------------------------------------------------------------");

        //Question 8
        //F =(C x 1.8) +32
        System.out.println("Enter temperature in C");
        int c = scanner.nextInt();
        double f = (c * 1.8) + 32;
        System.out.println("temp in F is" +f );

        System.out.println("---------------------------------------------------------------------------------");

        //Question 9
        System.out.println("Input a String");
        String sent = scanner.nextLine();
        System.out.println("Input a number");
        int index = scanner.nextInt();
        System.out.println(sent.charAt(index));

        System.out.println("---------------------------------------------------------------------------------");

        //Question 10
        System.out.println("Enter the width ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height ");
        double height = scanner.nextDouble();
        double area = width * height ;
        double peri = 2 * (width + height);
        System.out.println("Area is "+ width +"*" +height+ "= " + area);
        System.out.println("Perimeter is 2 * ("+ width +"+" +height+ ")= " + peri);

        System.out.println("---------------------------------------------------------------------------------");

        //Question 11
        System.out.println("Input first integer");
        int fint = scanner.nextInt();
        System.out.println("Input second integer");
        int sint = scanner.nextInt();
        if( fint < sint){
            System.out.println(fint + "<" + sint);
        }else if(fint > sint){
            System.out.println(fint + ">" + sint);
        }else if(fint != sint) {
            System.out.println(fint + "!=" + sint);
        }else if(fint >= sint) {
            System.out.println(fint + ">=" + sint);
        }else if(fint <= sint) {
            System.out.println(fint + "<=" + sint);
        }else System.out.println("Enter an integer");

        System.out.println("---------------------------------------------------------------------------------");

        //Question 12
        System.out.println("Enter seconds:");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

        System.out.println("---------------------------------------------------------------------------------");

        //Question 13
        System.out.println("Input first number");
        int finteger = scanner.nextInt();
        System.out.println("Input second number");
        int sinteger = scanner.nextInt();
        System.out.println("Input third number");
        int tinteger = scanner.nextInt();
        System.out.println("Input fourth number");
        int fointeger = scanner.nextInt();
        if(finteger == sinteger){
            if(sinteger == tinteger){
                if(tinteger ==fointeger){
                    System.out.println("Numbers are equal !!");
                }
            }
        }else {
            System.out.printf("Numbers are not equal !!");
        }

        System.out.println("---------------------------------------------------------------------------------");

        //Question 14
        System.out.println("input an integer ");
        int pint = scanner.nextInt();;
        if(pint % 2 != 0){
            System.out.println("Number is positive");
        }

        System.out.println("---------------------------------------------------------------------------------");

        //Question 15
        System.out.println("Enter numbers and enter -1 to stop");
        int intnum = scanner.nextInt();
        int ponum =0;
        int nenum =0;
        int zenum =0;
        do{
            System.out.println("Enter numbers");
            int innum = scanner.nextInt();
            if(innum >0){
                ponum +=1;
            }else if(innum < 0 ){
                nenum +=1;
            }else {
                zenum += 1;
            }
        }while (intnum != -1);
        System.out.println(ponum +"positives");
        System.out.println(zenum +"zero");
        System.out.println(nenum +"negatives");

        System.out.println("---------------------------------------------------------------------------------");

        //Question16
         System.out.println("Enter an integer");
         int pp = scanner.nextInt();
         String pps = Integer.toString(pp);
         String reverspps ="";
        for( int i = pps.length()-1 ; i <= 0 ; i--){
            reverspps += pps.charAt(i);
        }
        System.out.println(reverspps);

        System.out.println("---------------------------------------------------------------------------------");

        //Question 17
        System.out.println("Enter numbers and enter -1 to stop");

        int largestNumber ;
        int smallestNumber ;
        boolean firstNumber = true;
        int innum;
        do {
            System.out.println("Enter the number:");
            innum = scanner.nextInt();
            largestNumber = intnum;
            smallestNumber = intnum;
            if (innum != -1) {
                if (firstNumber) {
                    largestNumber = innum;
                    smallestNumber = innum;
                    firstNumber = false;
                } else {
                    if (innum > largestNumber) {
                        largestNumber = innum;
                    }
                    if (innum < smallestNumber) {
                        smallestNumber = innum;
                    } } }
        } while (innum != -1);
        System.out.println("The largest number: " + largestNumber);
        System.out.println("The smallest number: " + smallestNumber);


        System.out.println("---------------------------------------------------------------------------------");

        //Question 18
        //for - if - increment
        System.out.println("Enetr a String ");
        String string = scanner.nextLine();
        int aCounter = 0 ;
        for(int i = 0 ; i <= string.length()-1 ; i++ ){
            if(string.charAt(i) == 'a'){
                aCounter ++;
            }
        }
        System.out.println("Numbers of a's :" + aCounter);



}}