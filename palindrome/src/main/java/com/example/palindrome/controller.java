package com.example.palindrome;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "palindrome")
@AllArgsConstructor
@Slf4j
public class controller {
    PalindromeService palindromeService;
    @PostMapping
    public String getLongestPalindrome(@RequestBody PalindromeRequest data){
        return palindromeService.getLongestPalindrome(data);
    }

    @GetMapping
    public String getPalindromeForString(@RequestBody PalindromeRequest data){
        return palindromeService.getPalindromeForString(data);
    }
}
