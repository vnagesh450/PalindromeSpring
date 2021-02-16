package com.example.palindrome;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalindromRepo extends JpaRepository<PalindromeEntity, Integer> {

    PalindromeEntity findByOriginalString(String str);
}
