package com.example.palindrome;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "palindrome")
public class PalindromeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;
    private String  originalString;
    private String palindromeString;
}
