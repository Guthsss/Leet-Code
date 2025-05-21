public class Ultimo_Elemento_Array {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;  
            }
            digits[i] = 0;  
        }

        int[] novo = new int[n + 1];
        novo[0] = 1;  
        
        return novo;
    }
}