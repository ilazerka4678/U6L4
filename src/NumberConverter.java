public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i,i+1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        o = o + "\n";
        return o;
    }

    public int[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        int numDecimal = 0;
        if ((base > 0) && (base < 11)){
            int power = digits.length;
            for (int i = 0; i < digits.length; i++){
                power--;
                numDecimal += digits[i] * Math.pow(base, power);
            }
        }
        return numDecimal;
    }

    public int[] convertToBinary() {
        int decimal = convertToDecimal();
        System.out.println(decimal);
        int power = 1;
        int temp = 0;
        for (int i = 1; decimal/i > 1;i = i * 2){
            power++;
        }
        int currentPower = power;
        int[] numBinary = new int[power];
        for (int i = 0; i < power; i++){
            System.out.println(currentPower);
          temp = decimal - (int)Math.pow(2,currentPower-1);
          if (temp > 0){
              numBinary[i] = 1;
              decimal = decimal - (int)Math.pow(2,currentPower-1);
          }
          else{
              numBinary[i] = 0;
          }
          currentPower--;
        }
        return numBinary;
    }

    public int[] convertToOctal()
    {
return null;
    }
}
