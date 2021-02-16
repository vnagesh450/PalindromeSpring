package com.example.palindrome;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
@AllArgsConstructor
public class PalindromeService {
    PalindromRepo palindromRepo;
    UtilsPalindrome utilsPalindrome;

    public String getLongestPalindrome(PalindromeRequest data){
        PalindromeEntity convertedData = utilsPalindrome.longestPalSubstr(data.getData());
        return convertedData.getPalindromeString();
    }

    public String getPalindromeForString(PalindromeRequest data) {
        PalindromeEntity palindromeEntity = palindromRepo.findByOriginalString(data.getData());
        return palindromeEntity.getPalindromeString();
    }
}
