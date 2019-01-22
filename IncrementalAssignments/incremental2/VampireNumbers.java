package IncrementalAssignments.incremental2;

import java.util.Arrays;
import java.util.HashSet;

public class VampireNumbers {
    private static int numberOfDigits(long number){
        return Long.toString(number).length();
    }

    private static boolean isVampire(long orig, long fang1, long fang2){
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")) return false;

        int originalLength = numberOfDigits(orig);
        if(numberOfDigits(fang1) != originalLength / 2 || numberOfDigits(fang2) != originalLength / 2) return false;

        byte[] originalBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(fang1) + Long.toString(fang2)).getBytes();
        Arrays.sort(originalBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(originalBytes, fangBytes);
    }

    public static void main(String[] args){
        HashSet<Long> vampireNumbers = new HashSet<Long>();
        for(long i = 10; vampireNumbers.size() <100; i++ ){
            if((numberOfDigits(i) % 2) != 0) {i = i * 10 - 1; continue;}
            for(long fang1 = 2; fang1 <= Math.sqrt(i) + 1; fang1++){
                if(i % fang1 == 0){
                    long fang2 = i / fang1;
                    if(isVampire(i, fang1, fang2) && fang1 <= fang2){
                        vampireNumbers.add(i);
                        System.out.println(vampireNumbers.size()+" "+i);
                    }
                }
            }
        }

    }
}