import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String hoursystem = scanner.next();
        String[] parts = hoursystem.split(":");
        String hour = parts[0];
        String minute = parts[1];
        String secondandsystem = parts[2];
        char[] second = new char[2];
        second[0] = secondandsystem.charAt(0);
        second[1] = secondandsystem.charAt(1);
        char[] system = new char[2];
        system[0] = secondandsystem.charAt(2);
        system[1] = secondandsystem.charAt(3);
        int newhour = Integer.parseInt(String.valueOf(hour));
        int newminute = Integer.parseInt(String.valueOf(minute));
        int second1 = Integer.parseInt(String.valueOf(second[0]));
        int second2 = Integer.parseInt(String.valueOf(second[1]));
        int newsecond = second1 * 10 + second2;
        if(newhour >= 1 && newhour <= 12){
            if(newminute >= 0 && newminute <= 59){
                if(newsecond >= 0 && newsecond <= 59){
                    if(system[0] == 'P' && newhour < 12){
                        System.out.print(newhour+12);
                        System.out.print(":");
                        System.out.print(minute);
                        System.out.print(":");
                        if(second1 == 0) {
                            System.out.print("0" + newsecond);
                        }
                        else{
                            System.out.print(newsecond);
                        }
                    }
                    else if(system[0] == 'A' && newhour == 12){
                        System.out.print("00");
                        System.out.print(":");
                        System.out.print(minute);
                        System.out.print(":");
                        if(second1 == 0) {
                            System.out.print("0" + newsecond);
                        }
                        else{
                            System.out.print(newsecond);
                        }
                    }
                    else{
                        if(newhour < 10) {
                            System.out.print("0" + newhour);
                        }
                        else{
                            System.out.print(newhour);
                        }
                        System.out.print(":");
                        System.out.print(minute);
                        System.out.print(":");
                        if(second1 == 0) {
                            System.out.print("0" + newsecond);
                        }
                        else{
                            System.out.print(newsecond);
                        }
                    }
                }
            }
        }
    }
}