package com.example.palindrome;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UtilsPalindrome {
    PalindromRepo palindromRepo;
    private PalindromeEntity toSaveData(String str, int low, int high)
    {
        PalindromeEntity verify = palindromRepo.findByOriginalString(str);
        if(verify == null){
            return palindromRepo.save(PalindromeEntity.builder().originalString(str).palindromeString(str.substring(low, high+1)).build());
        } else{
            return PalindromeEntity.builder().palindromeString("Entry already exists").build();
        }


    }

    public PalindromeEntity longestPalSubstr(String str)
    {
        int maxLength = 1, start = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag!=0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return toSaveData(str, start, start + maxLength - 1);
    }


}
